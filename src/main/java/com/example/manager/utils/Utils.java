package com.example.manager.utils;

import com.example.manager.models.Player;
import com.example.manager.models.Skills;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


public class Utils {
    Skills emptySkills = new Skills(0L,50,50,50,50,50,50,50,null);

    public Skills getEmptySkills() {
        return emptySkills;
    }
}
