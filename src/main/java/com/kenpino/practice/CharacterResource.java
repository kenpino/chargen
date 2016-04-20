package com.kenpino.practice;

import com.kenpino.practice.domain.Character;
import com.kenpino.practice.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/characters")
public class CharacterResource {

//    @Autowired
    CharacterService characterService = new CharacterService();

    @RequestMapping(path = "/test")
    public String test(){
        return "Hello";
    }

    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public List<Character> getAllCharacters(){
        return characterService.getAllCharacters();
    }

//    @RequestMapping()
//    public void addCharacter(){
//        characterService.addCharacter(new Character(String name, int age));
//    }

}
