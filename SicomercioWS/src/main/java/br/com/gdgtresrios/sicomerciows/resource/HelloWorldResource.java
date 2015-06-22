/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gdgtresrios.sicomerciows.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/helloworld")
public class HelloWorldResource {

    @GET
    @Produces("application/json; charset=UTF-8")
    public String hello() {        
        return "Olá Mundo Google";
    }

}
