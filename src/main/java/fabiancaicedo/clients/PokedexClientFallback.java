package fabiancaicedo.clients;

import io.micronaut.retry.annotation.Fallback;

@Fallback
public class PokedexClientFallback implements PokedexClient{
    @Override
    public String getPokomen(String name) {
        return "Fatal error";
    }
}
