package com.sportsrleague.admin.soccer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Team {

    @Id
    private String name;
    private String location;
    private int cups;

    public Team(String name, String location, int cups) {
        this.name = name;
        this.location = location;
        this.cups = cups;
    }
}
