package org.example.services;

import org.example.entities.Produto;
import org.example.repositories.ProdutoRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;
    @Autowired
    private FornecedorService fornecedorService;

    public List<Produto> getAll() {

        return repository.findAll();

    }

    public Produto findById(Long id) {

        Optional<Produto> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id +
                        ", Tipo: " + Produto.class.getName()));

    }

    public Produto insert(Produto obj) {

        obj.setProId(null);
        obj.setFornecedor(fornecedorService.findById(obj.getFornecedor().getForId()));
        obj = repository.save(obj);
        return obj;

    }

    public Produto update(Long id, Produto obj) {

        Produto entity = repository.getOne(id);
        updateData(entity, obj);
        return repository.save(entity);

    }

    private void  updateData(Produto entity, Produto obj) {

       entity.setFornecedor(obj.getFornecedor());
       entity.setNome(obj.getNome());

    }

    public void delete(Long id) {

        repository.deleteById(id);

    }

}
