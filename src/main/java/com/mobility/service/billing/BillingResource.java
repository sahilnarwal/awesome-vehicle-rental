package com.mobility.service.billing;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("billing")
public class BillingResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getIt() {
		return "Billing Resource";
	}
}
