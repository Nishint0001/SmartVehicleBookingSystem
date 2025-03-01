package com.SmartCabBookingApplication.Strategies;

import com.SmartCabBookingApplication.DTO.RideRequestDto;

public interface RideFareCalculationStrategy
{
    double calculateFare(RideRequestDto rideRequestDto);

}
