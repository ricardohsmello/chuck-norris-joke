package br.com.ricas.application.web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.ricas.domain.service.ChuckNorrisService;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/api")
public class ChuckNorrisJokeResource {

    @RestClient
    ChuckNorrisService chuckNorrisService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getJoke() {
        return chuckNorrisService.getRandomJoke().getValue();
    }
}