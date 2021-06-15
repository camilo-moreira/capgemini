package com.capgemini.api.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class PessoaJuridica extends Pessoa {

    @Length(min=14, max=14)
    @Column(unique=true)
    private String cnpj;

    @Column(nullable=false)
    private String razaoSocial;

    @Column(nullable=false)
    private String nomeFantasia;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
}
