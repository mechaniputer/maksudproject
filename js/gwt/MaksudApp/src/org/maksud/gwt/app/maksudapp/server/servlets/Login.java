package org.maksud.gwt.app.maksudapp.server.servlets;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.maksud.gwt.app.maksudapp.server.data.PMF;
import org.maksud.gwt.app.maksudapp.server.data.entities.UserEntity;
import org.maksud.gwt.app.maksudapp.server.data.entities.UserStatus;

import com.google.appengine.api.datastore.KeyFactory;

public class Login extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String login = req.getParameter("userid");
		String password = req.getParameter("password");

		try {
			PersistenceManager pm = PMF.get().getPersistenceManager();
			UserEntity user = (UserEntity) pm.getObjectById(UserEntity.class, KeyFactory.createKey(UserEntity.class.getSimpleName(), login));

			if (user.getPassword().equals(password)) {
				res.getWriter().println("Password OK.");
				if (user.getStatus() == UserStatus.Active) {
					res.getWriter().println("Login Ok.");

					HttpSession session = req.getSession(true);
					//session.setAttribute("userid", user.getLogin());
					getServletContext().getRequestDispatcher("/login.jsp").forward(req, res);
					// session.setAttribute("error", "");

				} else {
					HttpSession session = req.getSession(true);
					session.removeAttribute("userid");

					req.setAttribute("error", "Inactive / Banned.");
					getServletContext().getRequestDispatcher("/login.jsp").forward(req, res);
				}
			} else {
				HttpSession session = req.getSession(true);
				session.removeAttribute("userid");

				req.setAttribute("error", "Incorrected Password.");
				getServletContext().getRequestDispatcher("/login.jsp").forward(req, res);
			}
		} catch (Exception e) {

		}
	}
}
