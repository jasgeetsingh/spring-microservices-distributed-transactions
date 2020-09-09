package com.eden.transactionserver.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class DistributedTransaction {
    Long id;
    DistributedTransactionStatus status;
    List<DistributedTransactionParticipant> participants = new ArrayList<>();
}
