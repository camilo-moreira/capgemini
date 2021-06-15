package com.capgemini.api.model.custom;

import java.math.BigDecimal;

public class TransacaoCustom {

    private Long idConta;

    private int tipo;

    private FormaTransacao formaTransacao;

    private BigDecimal valor;

    public Long getIdConta() {
        return idConta;
    }

    public void setIdConta(Long idConta) {
        this.idConta = idConta;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public FormaTransacao getFormaTransacao() {
        return formaTransacao;
    }

    public void setFormaTransacao(FormaTransacao formaTransacao) {
        this.formaTransacao = formaTransacao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
