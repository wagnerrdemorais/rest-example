package com.wagnerrdemorais.restexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wagnerrdemorais.restexample.Planet;

@Repository
public interface PlanetRepository extends JpaRepository<Planet, Long> {

    static Planet findPlanet(String name) {
        Planet planet;
        planet = new Planet();

        planet.setName(name);
        planet.setClimate("Rainy");
        planet.setTerrain("Bumpy");

        return planet;
    }

    Planet findByName(String name);
}
