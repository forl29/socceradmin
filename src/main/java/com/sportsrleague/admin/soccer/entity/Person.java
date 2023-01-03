package com.sportsrleague.admin.soccer.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String firstName;
    private String lastName;
    private int age;
    @ManyToOne
    private Team team;
    private String role;
}
