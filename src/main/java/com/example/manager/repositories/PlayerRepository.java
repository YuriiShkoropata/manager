package com.example.manager.repositories;

import com.example.manager.models.Player;
import com.example.manager.models.Skills;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    List<Player> findAllBySurname(String surname);

}
