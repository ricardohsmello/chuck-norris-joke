package br.com.ricas.domain.service;

import br.com.ricas.application.response.JokeResponse;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RegisterRestClient(configKey = "chuck-norris")
public interface ChuckNorrisService {
    @GET
    @Path("/jokes/random/")
    @Produces(MediaType.APPLICATION_JSON)
    JokeResponse getRandomJoke();
}