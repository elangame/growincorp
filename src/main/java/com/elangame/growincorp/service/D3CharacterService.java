package com.elangame.growincorp.service;

import java.util.List;

import com.elangame.growincorp.entity.D3Character;

public interface D3CharacterService {

	public List<D3Character> findAllCharacters();
	public void addCharacter(D3Character d3Character);
	
}
