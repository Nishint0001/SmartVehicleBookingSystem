package com.SmartCabBookingApplication.Strategies;

import com.SmartCabBookingApplication.DTO.RideRequestDto;
import com.SmartCabBookingApplication.Entities.RideRequestEntity;

public interface RideFareCalculationStrategy
{
    double Ride_Fare_Multiplier=10;
    double calculateFare(RideRequestEntity rideRequest);

}
