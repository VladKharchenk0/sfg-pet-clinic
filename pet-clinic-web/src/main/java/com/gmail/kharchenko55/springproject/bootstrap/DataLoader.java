package com.gmail.kharchenko55.springproject.bootstrap;

import com.gmail.kharchenko55.springproject.model.Owner;
import com.gmail.kharchenko55.springproject.model.PetType;
import com.gmail.kharchenko55.springproject.model.Vet;
import com.gmail.kharchenko55.springproject.services.OwnerService;
import com.gmail.kharchenko55.springproject.services.PetTypeService;
import com.gmail.kharchenko55.springproject.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService typeService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService typeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.typeService = typeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogType = typeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType saveCatPetType = typeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();

        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();

        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();

        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");

    }
}
