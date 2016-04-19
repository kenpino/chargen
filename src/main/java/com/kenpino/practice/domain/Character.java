package com.kenpino.practice.domain;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//@Entity
//@XmlRootElement
public class Character {

    //    @Id
//    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private enum CharacterClass {MAGE,ROGUE, WARRIOR}
    private enum CharacterRace {HUMAN,ELF, DWARF}
    private enum CharacterGender {MALE, FEMALE}
    private int characterLvl;
    private String characterName;
    private int characterAge;

    public Character() {}

    public Character(String characterName, int characterAge) {
        this.characterLvl = 1;
        this.characterName = characterName;
        this.characterAge = characterAge;
    }

    public int getCharacterLvl() {
        return characterLvl;
    }
    public void setCharacterLvl(int characterLvl) {
        this.characterLvl = characterLvl;
    }
    public String getCharacterName() {
        return characterName;
    }
    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
    public int getCharacterAge() {
        return characterAge;
    }
    public void setCharacterAge(int characterAge) {
        this.characterAge = characterAge;
    }

}
