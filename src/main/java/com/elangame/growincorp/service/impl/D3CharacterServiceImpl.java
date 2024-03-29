package com.elangame.growincorp.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.elangame.growincorp.service.D3CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Iterables;

import com.elangame.growincorp.entity.D3Character;
import com.elangame.growincorp.repository.D3CharacterRepository;

@Service
public class D3CharacterServiceImpl implements D3CharacterService {

	@Autowired
	private D3CharacterRepository repo;
	
	public List<D3Character> findAllCharacters() {
		List<D3Character> characters = new ArrayList<D3Character>();
		Iterables.addAll(characters, repo.findAll());
		return characters;
	}

	@Transactional
	public void addCharacter(D3Character d3Character) {
		repo.save(d3Character);
	}

}
