package com.example;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//import com.momchil_atanasov.data.front.parser.*;


/**
 * Root resource (exposed at "myresource" path)
 */
@Path("")
public class Resources {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "GET successful!";
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_OCTET_STREAM)
    public String postObj(byte[] payload){
    	return "POST successful";
    }

}
