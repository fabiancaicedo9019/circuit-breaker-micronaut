package fabiancaicedo.controllers;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.views.View;
import io.swagger.v3.oas.annotations.Hidden;

@Controller
public class HomeController {
    @View("home")
    @Get
    @Hidden
    public HttpResponse index() {
        return HttpResponse.ok();
    }
}
