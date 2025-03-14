package org.example.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Cliente {


    //Atributos do java e do database.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto Increment.
    @Column(name = "ID_CLIENTE")//nome no banco de dados.
    private Long idCliente; // nome no java.

    @Column(length = 55, name = "NOME_CLIENTE", nullable = false) //length = quant de caracteres. Nullable = false(NotNull) ou true(Null).
    private String nomeCliente;

    @Column(name = "CPF_CNPJ",nullable = false)
    private String cpfCnpj;

    @Column( name = "DATA_NASCIMENTO", nullable = false)
    private LocalDate dataNascimento;

    @Column(name = "FORMA_PAGAMENTO")
    private String formaPagamento;


    public Cliente() {  }//Construtor vazio.

    //Construtor com argumentos(Construtor de inicialização de atributos do java).
    public Cliente(Long idCliente, String nomeCliente, String cpfCnpj, LocalDate dataNascimento, String formaPagamento) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.cpfCnpj = cpfCnpj;
        this.dataNascimento = dataNascimento;
        this.formaPagamento = formaPagamento;
    }


    //GETTERS E SETTERS.
    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}
