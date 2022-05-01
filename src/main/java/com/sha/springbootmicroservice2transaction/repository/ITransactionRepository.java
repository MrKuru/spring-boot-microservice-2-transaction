package com.sha.springbootmicroservice2transaction.repository;

import com.sha.springbootmicroservice2transaction.model.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface ITransactionRepository extends JpaRepository<TransactionEntity, Long>
{
    List<TransactionEntity> findAllByUserId(Long userId);
}
