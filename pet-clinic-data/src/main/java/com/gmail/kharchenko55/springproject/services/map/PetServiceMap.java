package com.gmail.kharchenko55.springproject.services.map;

import com.gmail.kharchenko55.springproject.model.Pet;
import com.gmail.kharchenko55.springproject.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteByID(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
