package com.example.manager.service;

import com.example.manager.models.Player;
import com.example.manager.repositories.PlayerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
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

        log.info("Saving new Player. Surname: {}; Rating: {}", player.getSurname(), player.getRating());
        Player playerFromDb = playerRepository.save(player);
        playerRepository.save(player);
    }

    public void deletePlayer(Long id) {
        playerRepository.deleteById(id);
    }

    public Player getPlayerById(Long id) {
        return playerRepository.findById(id).orElse(null);
    }
}
