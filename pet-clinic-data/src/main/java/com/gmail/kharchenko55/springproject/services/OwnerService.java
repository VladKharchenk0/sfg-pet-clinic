package com.gmail.kharchenko55.springproject.services;

import com.gmail.kharchenko55.springproject.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);

}
