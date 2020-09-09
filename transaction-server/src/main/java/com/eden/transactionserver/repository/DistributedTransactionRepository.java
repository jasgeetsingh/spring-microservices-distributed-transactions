package com.eden.transactionserver.repository;


import com.eden.transactionserver.domain.DistributedTransaction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DistributedTransactionRepository {

    List<DistributedTransaction> transactions = new ArrayList<>();

    public DistributedTransaction findById(Long id){
        return transactions.singleOrNull { it.id == id }
    }

    fun findAll(): List<DistributedTransaction> {
        return transactions
    }

    fun save(transaction: DistributedTransaction): DistributedTransaction {
        transaction.id = UUID.randomUUID().toString()
        transactions.add(transaction)
        return transaction
    }

    fun update(transaction: DistributedTransaction): DistributedTransaction {
        val index = transactions.indexOfFirst { it.id == transaction.id }
        if (index >= 0) {
            transactions[index] = transaction
        }
        return transaction
    }

    fun removeById(id: String): Boolean {
        return transactions.removeIf { it.id == id }
    }

}
