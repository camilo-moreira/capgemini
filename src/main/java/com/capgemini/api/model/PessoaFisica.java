package com.capgemini.api.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Calendar;

@Entity
public class PessoaFisica extends Pessoa{

    @Length(min=11, max=11)
    @Column(unique=true)
    private String cpf;

    @Column(nullable=false)
    private String nome;

    @Column
    private Calendar dataNascimento;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
