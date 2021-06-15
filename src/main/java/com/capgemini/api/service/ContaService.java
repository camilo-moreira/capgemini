package com.capgemini.api.service;

import com.capgemini.api.error.ContaNaoLocalizadaException;
import com.capgemini.api.model.Conta;
import com.capgemini.api.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class ContaService {

    @Autowired
    private ContaRepository contaRepository;

    public void depositar(Long id, BigDecimal valor, String tipo) {
        Optional<Conta> conta = contaRepository.findById(id);
        conta.ifPresent(c -> {c.setSaldo(c.getSaldo().add(valor)); contaRepository.save(c);});
    }

    public void sacar(Long id, BigDecimal valor, String tipo) {
        Optional<Conta> conta = contaRepository.findByIdAndSaldo(id, valor);
        conta.ifPresent(c -> {c.setSaldo(c.getSaldo().subtract(valor)); contaRepository.save(c);});
    }

    public BigDecimal consultarSaldo(Long id) {
        Optional<Conta> conta = contaRepository.findById(id);
        if (conta.isPresent()) {
            return conta.get().getSaldo();
        }
        throw new ContaNaoLocalizadaException("Não foi possível localizar a conta solicitada");
    }
}
