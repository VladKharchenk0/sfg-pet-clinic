package com.gmail.kharchenko55.springproject.repositories;

import com.gmail.kharchenko55.springproject.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
