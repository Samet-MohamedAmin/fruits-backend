package org.acme.core;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/ping")
public class PingController {

    @GET
    public String ping() {
        return "pong";
    }
}