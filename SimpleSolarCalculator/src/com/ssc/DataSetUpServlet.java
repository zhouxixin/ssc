package com.ssc;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

@SuppressWarnings("serial")
public class DataSetUpServlet extends HttpServlet {
	
	private DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
	
	public void SetUp() {		
		    this.addToDataStore("disclaimer", "All results are merely estimates and the actual expenditure might be different. ");
	        this.addToDataStore("note", "All formulars for calculations are taken from the sample calculator on Blackboard. ");	               
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		this.SetUp();
		String destination = "/start.jsp";
		resp.sendRedirect(resp.encodeRedirectURL(destination));
	}
	
	private void addToDataStore(String name, String content) {		
		Entity entity = new Entity("info", name);
		entity.setProperty("name", name);
		entity.setProperty("content", content);
		datastore.put(entity);	
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		this.doGet(req, resp);		
	}

}
