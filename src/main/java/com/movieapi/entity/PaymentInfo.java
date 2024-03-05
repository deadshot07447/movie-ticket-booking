package com.movieapi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "PaymentInfo")
@Data
public class PaymentInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String paymentId;
    private String accountNo;
    private double amount;
    private String cardType;
    private long ticketId;


}
