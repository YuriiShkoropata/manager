package com.example.manager.controllers;

import com.example.manager.models.Player;
import com.example.manager.models.Skills;
import com.example.manager.service.PlayerService;
import com.example.manager.service.SkillsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequiredArgsConstructor
public class PlayerController {
    private final PlayerService playerService;
    private final SkillsService skillsService;

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
    public String createPlayer(@ModelAttribute("player") Player player, Skills skills) {
        playerService.savePlayer(player);
       // Skills skills = new Skills(0L, 0,0,0,0,0,0,0,player);
        skillsService.saveSkills(skills);
        player.setSkills(skills);
        playerService.savePlayer(player);
        return "redirect:/";
    }

    @PostMapping("/player/delete/{id}")
    public String deletePlayer(@PathVariable Long id) {
        playerService.deletePlayer(id);
        return "redirect:/";
    }
    @GetMapping("/player/update/{id}")
    public String editPlayer(@PathVariable(value = "id") Long id, Model model) {
        Player player = playerService.getPlayerById(id);
        model.addAttribute("player", player);
        return "/editPlayer";
    }

    @GetMapping("/addPlayer")
    public String addNewPlayer() {
        return "addNewPlayer";
    }

    @GetMapping("/player/skills/{id}")
    public String showPlayerSkills(@PathVariable(value = "id") Long id, Model model) {
        Player player = playerService.getPlayerById(id);
        model.addAttribute("skills", skillsService.getSkillsById(player.getSkills().getId()));
        model.addAttribute("player", player);
        return "/skills";
    }
    @GetMapping("/skills/edit/{id}")
    public String editSkills(@PathVariable(value = "id") Long id, Model model) {
        Skills skills = playerService.getPlayerById(id).getSkills();
        model.addAttribute("skills", skills);
        return "/edit_skills";
    }
    @PostMapping("/player/skills/set")
    public String createPlayer(@ModelAttribute("skills") Skills skills) {
        skillsService.saveSkills(skills);
        return "redirect:/";
    }
}
