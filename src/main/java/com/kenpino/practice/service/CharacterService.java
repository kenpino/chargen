package com.kenpino.practice.service;

import com.kenpino.practice.domain.Character;
import com.kenpino.practice.repository.CharacterRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
public class CharacterService {

    private CharacterRepository characterRepository;

    List<Character> characters = new ArrayList<Character>();

    public CharacterService(){

        characters.add(new Character("Lara", 25));
        characters.add(new Character("Tom", 37));
        characters.add(new Character("Alex", 42));

    }

    public List<Character> getAllCharacters(){
        return characters;
    }

//    @Transactional
//    public void addCharacter(Character character){
//
//    }
}
