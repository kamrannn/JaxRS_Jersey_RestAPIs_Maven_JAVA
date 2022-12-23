package org.example;

import jakarta.json.JsonObject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.example.dto.DirectionsDTO;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/orsdirections")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Path("/testing")
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt(

    ) {
        return "Got it!";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    public String getRoute(@QueryParam("originLat") Double originLat, @QueryParam("originLon") Double originLon
            , @QueryParam("destinationLat") Double destinationLat, @QueryParam("destinationLon") Double destinationLon) {
        JsonObject object = RequestElevation.getRoute(originLat, originLon, destinationLat, destinationLon);
        return object.toString();
    }


    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes("application/json")
    public String postRoute(final DirectionsDTO directionsDTO) {
        JsonObject object = RequestElevation.getRoute(directionsDTO.getOriginLat(), directionsDTO.getOriginLon(), directionsDTO.getDestinationLat(), directionsDTO.getDestinationLon());
        return object.toString();
    }
}
