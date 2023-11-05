package com.example.manager.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "skills")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "pace")
    private int pace;
    @Column(name = "strength")
    private int strength;
    @Column(name = "dribbling")
    private int dribbling;
    @Column(name = "heading")
    private int heading;
    @Column(name = "passing")
    private int passing;
    @Column(name = "technique")
    private int technique;
    @Column(name = "interceptions")
    private int interceptions;
    @OneToOne(cascade = CascadeType.ALL)
    private Player player;
}
