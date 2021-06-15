package com.capgemini.api.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Calendar;

@Entity
public class Transacao {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column
    private Integer tipo;

    @Column
    private String forma;

    @Column
    private BigDecimal valor;

    @Column
    private Calendar data;

    @ManyToOne()
    private Conta conta;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
