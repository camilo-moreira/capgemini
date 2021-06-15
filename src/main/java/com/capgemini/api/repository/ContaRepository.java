package com.capgemini.api.repository;

import com.capgemini.api.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Optional;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {

    @Query("Select c from Conta c where c.id =?1 and c.saldo >= ?2")
    Optional<Conta> findByIdAndSaldo(Long id, BigDecimal valor);
}
