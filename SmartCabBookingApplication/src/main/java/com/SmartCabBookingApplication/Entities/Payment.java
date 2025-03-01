package com.SmartCabBookingApplication.Entities;

import com.SmartCabBookingApplication.Entities.Enums.PaymentMethodEnum;
import com.SmartCabBookingApplication.Entities.Enums.PaymentStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
public class Payment
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    @CreationTimestamp
    private LocalDateTime paymentTime;

    @Enumerated(EnumType.STRING)
    private PaymentMethodEnum paymentMethod;

    @OneToOne(fetch = FetchType.LAZY)
    private RideEntity ride;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
}
