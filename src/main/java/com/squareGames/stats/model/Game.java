package com.squareGames.stats.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "status", nullable = false, length = 45)
    private String status;
    @Basic
    @Column(name = "factory_id", nullable = false, length = 45)
    private String factoryId;
    @Basic
    @Column(name = "uuid", nullable = false, length = 255)
    private String uuId;
    @JsonBackReference
    @ManyToMany(mappedBy = "games",fetch = FetchType.EAGER)
    private Set<User> players = new HashSet();

    public Game() {
    }

    public Game(String status, String factoryId, String uuId, Set<User> players) {
        this.status = status;
        this.factoryId = factoryId;
        this.uuId = uuId;
        this.players = players;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(String factoryId) {
        this.factoryId = factoryId;
    }

    public String getUuId() {
        return uuId;
    }

    public void setUuId(String uuId) {
        this.uuId = uuId;
    }

    public Set<User> getPlayers() {
        return players;
    }

    public void setPlayers(Set<User> players) {
        this.players = players;
    }
}
