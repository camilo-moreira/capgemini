package com.capgemini.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Cliente extends Pessoa {

    @JsonIgnore
    @OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER)
    private List<Conta> contas;

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
