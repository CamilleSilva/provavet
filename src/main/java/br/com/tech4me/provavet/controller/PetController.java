package br.com.tech4me.provavet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.provavet.model.Pet;
import br.com.tech4me.provavet.service.PetService;

@RestController
@RequestMapping("/pets")

public class PetController {
    @Autowired
    private PetService servico;
    @GetMapping
    public List<Pet> obterTodos(){
        return servico.obterTodos();
    }

    @PostMapping
    public Pet cadastrar(@RequestBody Pet pet) {
        return servico.cadastrar(pet);
    }

    @PutMapping("/{id}")
    public Pet atualizar(@PathVariable String id, @RequestBody Pet pet){
    return servico.atualizar(id, pet);

    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable String id){
        servico.excluir(id);
    }
    
    @GetMapping("/{id}")
    public Pet obterPorId(@PathVariable String id){
        return servico.obterPorId(id);
    }
}
