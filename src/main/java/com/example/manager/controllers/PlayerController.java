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


@Controller
@RequiredArgsConstructor
public class PlayerController {
    private final PlayerService playerService;

    @GetMapping("/")
    public String players(@RequestParam(name = "surname", required = false) String surname, Model model) {
        model.addAttribute("players", playerService.listPlayers(surname));
        return "players";
    }

    @GetMapping("/player/{id}")
    public String playerInfo(@PathVariable Long id, Model model) {
        model.addAttribute("player", playerService.getPlayerById(id));
        return "player-info";
    }

    @PostMapping("/player/create")
    public String createPlayer(Player player) {
        playerService.savePlayer(player);
        return "redirect:/";
    }

    @PostMapping("/player/delete/{id}")
    public String deletePlayer(@PathVariable Long id) {
        playerService.deletePlayer(id);
        return "redirect:/";
    }

    @GetMapping("/addPlayer")
    public String addNewPlayer(@RequestParam(name = "surname", required = false) String surname, Model model) {
        model.addAttribute("players", playerService.listPlayers(surname));
        return "addNewPlayer";
    }
}
