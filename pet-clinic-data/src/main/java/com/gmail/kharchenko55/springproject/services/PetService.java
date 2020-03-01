package com.gmail.kharchenko55.springproject.services;

import com.gmail.kharchenko55.springproject.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
