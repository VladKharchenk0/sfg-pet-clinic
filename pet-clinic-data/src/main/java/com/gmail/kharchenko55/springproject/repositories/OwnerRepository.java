package com.gmail.kharchenko55.springproject.repositories;

import com.gmail.kharchenko55.springproject.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
