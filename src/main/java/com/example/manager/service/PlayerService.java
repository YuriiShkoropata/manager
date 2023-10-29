package com.example.manager.service;

import com.example.manager.models.Player;
import com.example.manager.models.Skills;
import com.example.manager.repositories.PlayerRepository;
import com.example.manager.utils.Utils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class PlayerService {
    private final PlayerRepository playerRepository;

    public List<Player> listPlayers(String surname) {
        if (surname != null) return playerRepository.findAllBySurname(surname);
        return playerRepository.findAll();
    }

    public void savePlayer(Player player) {
        player.setId(player.getId());
       //////// player.setSkills(Utils.defaultSkills);///////
        log.info("Saving new {}", player);
        playerRepository.save(player);
    }

    public void deletePlayer(Long id) {
        playerRepository.deleteById(id);
    }

    public Player getPlayerById(Long id) {
        return playerRepository.findById(id).orElse(null);
    }
}
