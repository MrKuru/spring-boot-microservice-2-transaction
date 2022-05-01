package com.sha.springbootmicroservice2transaction.service;

import com.sha.springbootmicroservice2transaction.model.TransactionEntity;

import java.util.List;

public interface ITransactionService
{
    TransactionEntity saveTransaction(TransactionEntity transaction);

    void deleteTransaction(Long transactionId);

    List<TransactionEntity> findAllTransactionsOfUser(Long userId);
}
