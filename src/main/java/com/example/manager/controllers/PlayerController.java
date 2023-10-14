package com.example.manager.controllers;

import com.example.manager.models.Player;
import com.example.manager.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
public class PlayerController {
    private final PlayerService playerService;

    @GetMapping("/")
    public String players(@RequestParam(name = "surname",required = false) String surname, Model model) {
        model.addAttribute("players", playerService.listPlayers(surname));
        return "players";
    }
    @GetMapping("/player/{id}")
    public String playerInfo(@PathVariable Long id, Model model) {
        Player player = playerService.getPlayerById(id);
        model.addAttribute("player", player);
        model.addAttribute("images", player.getImages());
        return "player-info";
    }
    @PostMapping("/player/create")
    public String createPlayer(@RequestParam("file1") MultipartFile file1, Player player) throws IOException {
        playerService.savePlayer(player, file1);
        return "redirect:/";
    }
    @PostMapping("/player/delete/{id}")
    public String deletePlayer(@PathVariable Long id) {
        playerService.deletePlayer(id);
         return "redirect:/";
    }
}
