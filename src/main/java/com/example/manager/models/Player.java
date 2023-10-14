package com.example.manager.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "players")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "player_name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "position")
    private String position;
    @Column(name = "number")
    private int number;
    @Column(name = "rating")
    private int rating;
}
