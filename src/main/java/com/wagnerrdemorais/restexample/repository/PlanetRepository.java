package com.wagnerrdemorais.restexample.repository;

import com.wagnerrdemorais.restexample.Planet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanetRepository extends JpaRepository<Planet, Long> {
}
