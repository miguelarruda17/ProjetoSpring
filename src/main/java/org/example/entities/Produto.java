package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Produto  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "NOME")
    private String nome;

    @ManyToOne
    @JoinColumn(name = "FORNECEDOR", nullable = false)
    private Fornecedor fornecedor;

    public Produto() {
    }

    public Produto(long id, String nome, Fornecedor fornecedor) {
        this.id = id;
        this.nome = nome;
        this.fornecedor = fornecedor;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
