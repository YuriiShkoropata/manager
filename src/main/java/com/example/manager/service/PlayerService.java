package com.example.manager.service;

import com.example.manager.models.Player;
import com.example.manager.models.Skills;
import com.example.manager.repositories.PlayerRepository;
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
       // player.setSkills(player.getSkills());
        log.info("Saving new {}", player);
        playerRepository.save(player);
    }

    public void deletePlayer(Long id) {
        playerRepository.deleteById(id);
    }

    public Player getPlayerById(Long id) {
        return playerRepository.findById(id).orElse(null);
    }

    public int calculateRating(Player player) {
        int rating = ((player.getSkills().getDribbling() +
                player.getSkills().getHeading() +
                player.getSkills().getInterceptions() +
                player.getSkills().getPace() +
                player.getSkills().getPassing() +
                player.getSkills().getStrength() +
                player.getSkills().getTechnique()) / 7);
        return rating;
    }
    public int calculateRating(Skills skills) {
        int rating = ((skills.getDribbling() +
                skills.getHeading() +
                skills.getInterceptions() +
                skills.getPace() +
                skills.getPassing() +
                skills.getStrength() +
                skills.getTechnique()) / 7);
        return rating;
    }
}
