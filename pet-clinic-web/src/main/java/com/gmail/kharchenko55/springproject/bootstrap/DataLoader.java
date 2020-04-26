package com.gmail.kharchenko55.springproject.bootstrap;

import com.gmail.kharchenko55.springproject.model.Owner;
import com.gmail.kharchenko55.springproject.model.Pet;
import com.gmail.kharchenko55.springproject.model.PetType;
import com.gmail.kharchenko55.springproject.model.Vet;
import com.gmail.kharchenko55.springproject.services.OwnerService;
import com.gmail.kharchenko55.springproject.services.PetTypeService;
import com.gmail.kharchenko55.springproject.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

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
        owner1.setAddress("Green 11");
        owner1.setCity("Bern");
        owner1.setTelephone("11");

        Pet mikePet = new Pet();
        mikePet.setPetType(saveDogType);
        mikePet.setOwner(owner1);
        mikePet.setBirthDate(LocalDate.now());
        mikePet.setName("Benn");
         owner1.getPets().add(mikePet);
        ownerService.save(owner1);

        Owner owner2 = new Owner();

        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("Brown 21");
        owner2.setCity("Chicago");
        owner2.setTelephone("543");

        Pet fionasPet = new Pet();
        fionasPet.setName("Just Cat");
        fionasPet.setOwner(owner2);
        fionasPet.setBirthDate(LocalDate.now());
        fionasPet.setPetType(saveCatPetType);
        owner2.getPets().add(fionasPet);
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
