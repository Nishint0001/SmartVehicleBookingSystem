package com.SmartCabBookingApplication.DTO;

import com.SmartCabBookingApplication.Entities.DriverEntity;
import com.SmartCabBookingApplication.Entities.Enums.PaymentMethodEnum;
import com.SmartCabBookingApplication.Entities.Enums.RideStatusEnum;
import com.SmartCabBookingApplication.Entities.RiderEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideDto
{
    private Long id;

    private PointDto pickUpLocation;

    private PointDto  dropOffLocation;

    private LocalDateTime createdTime;

    private RiderDto riderDto;

    private DriverDto driverDto;

    private PaymentMethodEnum paymentMethodEnum;

    private RideStatusEnum rideStatusEnum;

    private Double fare;

    private LocalDateTime startedAt;

    private LocalDateTime endedAt;

    private String otp;
}


