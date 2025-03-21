package org.example.services;

import org.example.entities.Fornecedor;
import org.example.entities.Usuario;
import org.example.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class FornecedorService {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> findAll(){
        return repository.findAll();
    }

    public Optional<Fornecedor> findById(Long id) {
        return repository.findById(id);
    }
    public

}
