package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Usuario implements Serializable {

    //Atributos do java e do database.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto Increment.
    @Column(name = "ID_USUARIO")//nome no banco de dados.
    private Long idUsuario; // nome no java.

    @Column(length = 55, name = "NOME_USUARIO", nullable = false) //length = quant de caracteres. Nullable = false(NotNull) ou true(Null).
    private String nomeUsuario;

    @Column(name = "IDADE_USUARIO", nullable = false)
    private Integer idadeUsuario;


    public Usuario() {  }//Construtor vazio.

//Construtor com argumentos(Construtor de inicialização de atributos do java).
    public Usuario(Long idUsuario, String nomeUsuario, Integer idadeUsuario) {
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.idadeUsuario = idadeUsuario;
    }


    //GETTERS E SETTERS.
    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public Integer getIdadeUsuario() {
        return idadeUsuario;
    }

    public void setIdadeUsuario(Integer idadeUsuario) {
        this.idadeUsuario = idadeUsuario;
    }
}
