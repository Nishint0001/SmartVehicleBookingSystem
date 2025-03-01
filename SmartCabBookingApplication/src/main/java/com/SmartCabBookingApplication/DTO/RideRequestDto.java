package com.SmartCabBookingApplication.DTO;

import com.SmartCabBookingApplication.Entities.Enums.PaymentMethodEnum;
import com.SmartCabBookingApplication.Entities.Enums.RideRequestStatusEnum;
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
public class RideRequestDto
{
    private Long id;

    private PointDto pickUpLocation;

    private PointDto dropOffLocation;

    private LocalDateTime requestedTime;

    private RiderDto riderDto;

    private PaymentMethodEnum paymentMethodEnum;

    private RideRequestStatusEnum rideRequestStatusEnum;

}
