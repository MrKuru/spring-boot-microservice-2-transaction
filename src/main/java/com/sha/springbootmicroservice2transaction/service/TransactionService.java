package com.sha.springbootmicroservice2transaction.service;

import com.sha.springbootmicroservice2transaction.model.TransactionEntity;
import com.sha.springbootmicroservice2transaction.repository.ITransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransactionService implements ITransactionService
{
    @Autowired
    private ITransactionRepository transactionRepository;

    @Override
    public TransactionEntity saveTransaction(TransactionEntity transaction)
    {
        transaction.setTransactionTime(LocalDateTime.now());
        return transactionRepository.save(transaction);
    }

    @Override
    public void deleteTransaction(Long transactionId)
    {
        transactionRepository.deleteById(transactionId);
    }

    @Override
    public List<TransactionEntity> findAllTransactionsOfUser(Long userId)
    {
        return transactionRepository.findAllByUserId(userId);
    }
}