package com.eden.transactionserver.domain;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DistributedTransactionParticipant {


    String serviceId;

    DistributedTransactionStatus status;




}
