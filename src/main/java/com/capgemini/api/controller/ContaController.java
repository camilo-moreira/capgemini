package com.capgemini.api.controller;

import com.capgemini.api.error.FormaRecebimentoException;
import com.capgemini.api.error.FormaRetiradaException;
import com.capgemini.api.model.custom.FormaRecebimento;
import com.capgemini.api.model.custom.FormaRetirada;
import com.capgemini.api.model.custom.FormaTransacao;
import com.capgemini.api.model.custom.TransacaoCustom;
import com.capgemini.api.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/contas")
public class ContaController {

    @Autowired
    private ContaService contaService;

    private String getFormaRecebimento(FormaTransacao formaTransacao) {

        if (formaTransacao.getClass() == FormaRecebimento.class) {
            return ((FormaRecebimento) formaTransacao).name();
        }
        throw new FormaRecebimentoException("Forma não permitida para recebimento!");
    }

    private String getFormaRetirada(FormaTransacao formaTransacao) {

        if (formaTransacao.getClass() == FormaRecebimento.class) {
            return ((FormaRetirada) formaTransacao).name();
        }
        throw new FormaRetiradaException("Forma não permitida para retirada!");
    }

    //Operação de depósito para um conta
    @PutMapping("/depositos")
    public ResponseEntity<?> depositar(@RequestBody TransacaoCustom transacaoCustom){
        contaService.depositar(transacaoCustom.getIdConta(), transacaoCustom.getValor(), this.getFormaRecebimento(transacaoCustom.getFormaTransacao()));
        return ResponseEntity.ok().build();
    }

    //Operação de saque para um conta
    @PutMapping("/saques")
    public ResponseEntity<?> sacar(@RequestBody TransacaoCustom transacaoCustom){
        contaService.sacar(transacaoCustom.getIdConta(), transacaoCustom.getValor(), this.getFormaRetirada(transacaoCustom.getFormaTransacao()));
        return ResponseEntity.ok().build();
    }

    //Consultar saldo da conta
    @GetMapping("/{idConta}/saldos")
    public ResponseEntity<?> consultarSaldo(@PathVariable Long idConta){
        return ResponseEntity.ok(contaService.consultarSaldo(idConta));
    }

}
