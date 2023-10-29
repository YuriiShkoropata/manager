package com.example.manager.service;

import com.example.manager.models.Skills;
import com.example.manager.repositories.SkillsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class SkillsService {
    private final SkillsRepository skillsRepository;

    public List<Skills> listSkills(Long id) {
        if (id != null) return skillsRepository.findAllById(id);
        return skillsRepository.findAll();
    }
}
