package com.gmail.kharchenko55.springproject.repositories;

import com.gmail.kharchenko55.springproject.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Pet, Long> {
}
