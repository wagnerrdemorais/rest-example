package com.wagnerrdemorais.restexample.service;

import org.springframework.stereotype.Service;

import com.wagnerrdemorais.restexample.Planet;
import com.wagnerrdemorais.restexample.repository.PlanetRepository;

@Service
public class PlanetService {

    public Planet findPlanet(String name){
        return PlanetRepository.findPlanet(name);
    }

//    public Planet findPlanetByName(String name){
//        return PlanetRepository.findPlanet(name);
//    }

}
