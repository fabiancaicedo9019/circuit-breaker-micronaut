package fabiancaicedo.clients;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.retry.annotation.CircuitBreaker;

@CircuitBreaker(delay = "5s", attempts = "3")
@Client("https://pokeapi.co/api/v2")
public interface PokedexClient {

    @Get("/pokemon/{name}")
    String getPokomen(String name);
}
