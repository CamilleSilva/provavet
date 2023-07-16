package br.com.tech4me.provavet.service;

import java.util.List;

import br.com.tech4me.provavet.model.Pet;

public interface PetService {
    List<Pet> obterTodos();
    Pet cadastrar(Pet pet);
    Pet atualizar(String id, Pet pet);
    void excluir(String id);
    Pet obterPorId(String id);
}
