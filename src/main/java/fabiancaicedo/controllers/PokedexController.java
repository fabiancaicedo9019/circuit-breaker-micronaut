package fabiancaicedo.controllers;

import fabiancaicedo.clients.PokedexClient;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class PokedexController {
    private final PokedexClient pokedexClient;

    public PokedexController(PokedexClient pokedexClient) {
        this.pokedexClient = pokedexClient;
    }

    @Get("/pokemon/{name}")
    public String getPokemon(String name){
        return pokedexClient.getPokomen(name);
    }
}
