package com.kenpino.practice.service;

import com.kenpino.practice.domain.Character;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CharacterService {

//    private CharacterRepository characterRepository;

    public void addTestData(){

        List<Character> characters = new ArrayList<Character>();
        characters.add(new Character("Lara", 25));
        characters.add(new Character("Tom", 37));
        characters.add(new Character("Alex", 42));

    }

    public List<Character> getAllCharacters(){
        List<Character> characters = new ArrayList<Character>();
        return characters;
    }
}
