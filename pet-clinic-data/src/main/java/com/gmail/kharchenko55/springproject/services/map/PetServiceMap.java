package com.gmail.kharchenko55.springproject.services.map;

import com.gmail.kharchenko55.springproject.model.Pet;
import com.gmail.kharchenko55.springproject.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
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
        return super.save(object);
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
