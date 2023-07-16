package br.com.tech4me.provavet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.provavet.model.Pet;
import br.com.tech4me.provavet.repository.PetRepository;

@Service
public class PetServiceImpl implements PetService {
    @Autowired
    private PetRepository repositorio;
    @Override
    public List<Pet> obterTodos() {
       return repositorio.findAll();
    }
    @Override
    public Pet cadastrar(Pet pet) {
      return repositorio.save(pet);
  
    }
    @Override
    public Pet atualizar(String id, Pet pet) {
    Pet petatualizado=repositorio.findById(id).orElse(null);
    if(petatualizado!=null){
        pet.setId(id);
      return  repositorio.save(pet);
    }
   else{
      return null;
   }
    }
    @Override
    public void excluir(String id) {
       repositorio.deleteById(id);
    }
    @Override
    public Pet obterPorId(String id) {
       return repositorio.findById(id).orElse(null);
    }
    
}
