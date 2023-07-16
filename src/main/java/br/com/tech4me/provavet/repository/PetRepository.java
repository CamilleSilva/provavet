package br.com.tech4me.provavet.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4me.provavet.model.Pet;

public interface PetRepository extends MongoRepository <Pet, String> {
    
}
