package com.kenpino.practice.repository;

import com.kenpino.practice.domain.Character;
import org.springframework.data.repository.CrudRepository;

public interface CharacterRepository extends CrudRepository<Character, Long>{}
