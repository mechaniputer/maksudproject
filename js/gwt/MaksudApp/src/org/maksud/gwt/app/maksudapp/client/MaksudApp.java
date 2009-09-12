package org.maksud.gwt.app.maksudapp.client;

import java.util.List;

import org.maksud.gwt.app.common.client.AuthenticationService;
import org.maksud.gwt.app.maksudapp.client.AppEvents;
import org.maksud.gwt.app.maksudapp.client.mvc.AppController;
import org.maksud.gwt.app.maksudapp.client.mvc.UserController;
import org.maksud.gwt.app.maksudapp.client.widget.*;

import com.extjs.gxt.ui.client.GXT;
import com.extjs.gxt.ui.client.Registry;
import com.extjs.gxt.ui.client.Style.LayoutRegion;
import com.extjs.gxt.ui.client.Style.Scroll;
import com.extjs.gxt.ui.client.core.XDOM;
import com.extjs.gxt.ui.client.mvc.Dispatcher;
import com.extjs.gxt.ui.client.util.Margins;
import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.MessageBox;
import com.extjs.gxt.ui.client.widget.TabPanel;
import com.extjs.gxt.ui.client.widget.Viewport;
import com.extjs.gxt.ui.client.widget.layout.BorderLayout;
import com.extjs.gxt.ui.client.widget.layout.BorderLayoutData;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class MaksudApp implements EntryPoint {

	public final static int UPLOAD = 0;
	public final static int FILES = 1;
	public final static int USERS = 2;

	private Viewport viewport;

	public static final String SERVICE = "BasicRPC";

	public void onModuleLoad() {

		// Service
		BasicRPCAsync service = (BasicRPCAsync) GWT.create(BasicRPC.class);
		ServiceDefTarget endpoint = (ServiceDefTarget) service;
		String moduleRelativeURL = SERVICE;
		endpoint.setServiceEntryPoint(moduleRelativeURL);
		Registry.register(SERVICE, service);

		Dispatcher dispatcher = Dispatcher.get();
		dispatcher.addController(new AppController());
		dispatcher.addController(new UserController());
		
		
		dispatcher.dispatch(AppEvents.LoginDialog);    
	    GXT.hideLoadingPanel("loading");

		/*BorderLayout borderLayout = new BorderLayout();

		TabPanel tabPanel = new TabPanel();

		ContentPanel west = new ContentPanel();
		ContentPanel south = new ContentPanel();
		final ContentPanel center = new ContentPanel();
		center.setHeading("BorderLayout Example");
		center.setScrollMode(Scroll.AUTOX);

		BorderLayoutData southData = new BorderLayoutData(LayoutRegion.SOUTH, 100);
		southData.setCollapsible(true);
		southData.setFloatable(true);
		southData.setHideCollapseTool(true);
		southData.setSplit(true);
		southData.setMargins(new Margins(5, 5, 0, 5));

		BorderLayoutData westData = new BorderLayoutData(LayoutRegion.WEST, 150);
		westData.setSplit(true);
		westData.setCollapsible(true);
		westData.setMargins(new Margins(5));

		BorderLayoutData centerData = new BorderLayoutData(LayoutRegion.CENTER);
		centerData.setMargins(new Margins(5, 0, 5, 0));

		Viewport viewport = new Viewport();
		viewport.setLayout(borderLayout);
		center.add(tabPanel);

		viewport.add(south, southData);
		viewport.add(center, centerData);
		viewport.add(west, westData);

		String id = Window.Location.getParameter("id");
		if (id == null) {
			id = XDOM.getBody().getId();
		}

		Anchor a = new Anchor("Upload");
		a.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				populateCenter(center, UPLOAD);
			}
		});
		west.add(a);

		a = new Anchor("Users");
		a.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				populateCenter(center, USERS);
			}
		});
		west.add(a);

		a = new Anchor("Files Uploaded");
		a.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				populateCenter(center, FILES);
			}
		});
		west.add(a);

		if (id.equals("fileupload")) {
			populateCenter(center, UPLOAD);
		} else if (id.equals("files")) {

		} else if (id.equals("users")) {
			populateCenter(center, USERS);
		}

		AuthenticationService.Util.getInstance().isSessionValid(new AsyncCallback<Boolean>() {

			@Override
			public void onSuccess(Boolean result) {
				if (result) {
					MessageBox.info("Session", "Session Valid", null);
				} else {
					MessageBox.info("Session", "Session Timeout", null);
				}
			}

			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub

			}
		});

		RootPanel.get().add(viewport);
	}

	void populateCenter(LayoutContainer center, int type) {
		// List<Component> elements = center.getItems();
		// for(int i=0;i< elements.size();i++)
		center.removeAll();

		if (type == UPLOAD) {
			GWTFileUpload fupload = new GWTFileUpload();
			center.add(fupload);
			center.show();
		} else if (type == FILES) {

		} else if (type == USERS) {
			try {
				UserGridSample ugs = new UserGridSample();
				center.add(ugs);
				center.show();
			} catch (Exception e) {
				MessageBox.info("Action", e.getMessage(), null);
			}
		}
*/
	}
}
