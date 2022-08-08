package com.mobility.service.notification;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("notification")
public class NotificationResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getIt() {
		return "Notification Resource";
	}
}
