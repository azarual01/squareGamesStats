package com.squareGames.stats.Dto;

import java.util.*;

public class GameDTO {
    UUID id;
    String status;
    String factoryId;

    public GameDTO() {
    }

    public GameDTO(UUID id, String status, String factoryId) {
        this.id = id;
        this.status = status;
        this.factoryId = factoryId;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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
}
