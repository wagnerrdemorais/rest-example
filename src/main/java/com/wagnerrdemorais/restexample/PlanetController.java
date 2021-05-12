package com.wagnerrdemorais.restexample;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wagnerrdemorais.restexample.service.PlanetService;

@RestController
@EnableAutoConfiguration
public class PlanetController {

    private final PlanetService planetService;

    public PlanetController(PlanetService planetService) {
        this.planetService = planetService;
    }

    @GetMapping("/planet")
    public Planet planet(@RequestParam(value = "name", defaultValue = "NoName") String name) {
        return planetService.findPlanet(name);
    }

}
