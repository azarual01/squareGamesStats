package com.squareGames.stats.Dto;

import com.squareGames.stats.model.User;

import java.util.Optional;

public class UserDtoWinsAndLoses {
    private int id;
    private String email;
    private String firstName;
    private String lastName;
    private Integer nbWins;
    private Integer nbLoses;

    public UserDtoWinsAndLoses() {
    }

    public UserDtoWinsAndLoses(int id, String email, String firstName, String lastName, Integer nbWins, Integer nbLoses) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nbWins = nbWins;
        this.nbLoses = nbLoses;
    }
    public UserDtoWinsAndLoses(Optional<User> user) {
        this.id = user.get().getId();
        this.email = user.get().getEmail();
        this.firstName = user.get().getFirstName();
        this.lastName = user.get().getLastName();
        this.nbWins = user.get().getNbWins();
        this.nbLoses = user.get().getNbLoses();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
