package com.mobility.service.trips;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("trips")
public class TripsResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getIt() {
		return "Trips Resource";
	}
}
