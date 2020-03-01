package com.gmail.kharchenko55.springproject.services;

import com.gmail.kharchenko55.springproject.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();

}
