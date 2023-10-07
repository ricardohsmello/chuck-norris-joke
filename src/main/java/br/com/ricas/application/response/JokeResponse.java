package br.com.ricas.application.response;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JokeResponse {
    private String value;
    public String getValue() {
        return value;
    }
}

