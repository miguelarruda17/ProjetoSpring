package org.example.services;

import org.example.entities.Cliente;
import org.example.entities.Fornecedor;
import org.example.repositories.ClienteRepository;
import org.example.services.exeptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.ref.Cleaner;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public List<Cliente> findAll(){

        return repository.findAll();
    }

    public Cliente findById(Long id){
        Optional<Cliente> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public  Cliente insert(Cliente cliente) {

        return repository.save(cliente);
    }

    public void delete(Long id) {

        repository.deleteById(id);
    }

    public boolean update(Long id, Cliente cliente){

        Optional<Cliente> optional = repository.findById(id);
        if (optional.isPresent()){

            Cliente cliente1 = optional.get();
            cliente1.setNomeCliente(cliente.getNomeCliente());
            cliente1.setCpfCnpj(cliente.getCpfCnpj());
            cliente1.setDataNascimento(cliente.getDataNascimento());
            cliente1.setFormaPagamento(cliente.getFormaPagamento());
            repository.save(cliente1);
            return true;
        }
        return  false;
    }



}
