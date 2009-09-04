package org.maksud.gwt.app.maksudapp.server.servlets.data;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.maksud.gwt.app.maksudapp.server.data.PMF;
import org.maksud.gwt.app.maksudapp.server.data.entities.Employee;

public class DataServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		PersistenceManager pm = PMF.get().getPersistenceManager();

		// Create Employee
		{
			Employee em = new Employee("Alfred", "Smith");

			try {
				pm.makePersistent(em);
			} finally {

			}
		}

		// Get All Data
		{
			String query = "select from " + Employee.class.getName();

			try {
				List<Employee> employees = (List<Employee>) pm.newQuery(query).execute();
				int i = 0;
				i += 10;

				System.out.println("Total Records Found: " + employees.size());

				for (i = 0; i < employees.size(); i++) {
					Employee em = employees.get(i);
					System.out.println("Id: " + em.getId() + "  :::  " + em.getFirst() + " " + em.getLast());
				}

			} finally {
			}
		}

		// Testing GetObject
		{
			Employee em = pm.getObjectById(Employee.class, 10);
			System.out.println("Id: " + em.getId() + "  :::  " + em.getFirst() + " " + em.getLast());

			em.setFirst(em.getFirst() + ":" + em.getLast());
			em.setLast("  >> ");

		}
		pm.close();

	}

}
