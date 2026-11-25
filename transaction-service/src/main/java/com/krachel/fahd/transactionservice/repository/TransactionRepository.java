package com.krachel.fahd.transactionservice.repository;

import com.krachel.fahd.transactionservice.entities.Transaction;
import com.krachel.fahd.transactionservice.entities.TransactionStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByAccountId(long accountId);
    List<Transaction> findByStatus(TransactionStatus transactionStatus);
}
