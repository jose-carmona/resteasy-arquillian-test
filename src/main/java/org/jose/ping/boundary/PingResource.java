package org.jose.ping.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author jose
 */
@Path("ping")
public class PingResource {

    @GET
    public String ping() {
        return "Enjoy Java EE 8!";
    }

}
