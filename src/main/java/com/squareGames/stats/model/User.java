package com.squareGames.stats.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "email",nullable = false, unique = true, length = 255)
    private String email;
    @Basic
    @Column(name = "firstName",nullable = false,length = 255)
    private String firstName;
    @Basic
    @Column(name = "lastName",nullable = false,length = 255)
    private String lastName;

    @Basic
    @Column(name = "nbWins", nullable = true)
    private Integer nbWins;

    @Basic
    @Column(name = "nbLoses",nullable = true)
    private Integer nbLoses;
    @JsonManagedReference
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_game",joinColumns = {@JoinColumn(name = "user_id")},inverseJoinColumns = {@JoinColumn(name = "game_id")})
    private Set<Game> games = new HashSet<>();

    public User() {
    }

    public User(String email, String firstName, String lastName) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getNbWins() {
        return nbWins;
    }

    public void setNbWins(Integer nbWins) {
        this.nbWins = nbWins;
    }

    public Integer getNbLoses() {
        return nbLoses;
    }

    public void setNbLoses(Integer nbLoses) {
        this.nbLoses = nbLoses;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Game> getGames() {
        return games;
    }

    public void setGames(Set<Game> games) {
        this.games = games;
    }
}
