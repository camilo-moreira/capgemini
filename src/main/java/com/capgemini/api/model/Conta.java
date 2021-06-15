package com.capgemini.api.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Calendar;

@Entity
public class Conta {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idConta;

    @Column
    private boolean ativo;

    @ManyToOne(fetch = FetchType.EAGER)
    private Cliente cliente;

    @Column(nullable= false)
    private BigDecimal saldo;

    @Column
    private BigDecimal limiteSaqueDiario;

    @Column
    private String tipo;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataCadatro;

    public Long getIdConta() {
        return idConta;
    }

    public void setIdConta(Long idConta) {
        this.idConta = idConta;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getLimiteSaqueDiario() {
        return limiteSaqueDiario;
    }

    public void setLimiteSaqueDiario(BigDecimal limiteSaqueDiario) {
        this.limiteSaqueDiario = limiteSaqueDiario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Calendar getDataCadatro() {
        return dataCadatro;
    }

    public void setDataCadatro(Calendar dataCadatro) {
        this.dataCadatro = dataCadatro;
    }
}
