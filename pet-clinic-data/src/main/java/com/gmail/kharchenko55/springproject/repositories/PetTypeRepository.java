package com.gmail.kharchenko55.springproject.repositories;

import com.gmail.kharchenko55.springproject.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
