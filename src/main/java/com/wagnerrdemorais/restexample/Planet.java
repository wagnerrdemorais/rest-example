package com.wagnerrdemorais.restexample;

import javax.persistence.*;

@Entity
@Table(name = "Planet")
public class Planet {

    @Column(length = 80, nullable = false, unique = false)
    String name;
    @Column
    String climate;
    @Column
    String terrain;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }
}
