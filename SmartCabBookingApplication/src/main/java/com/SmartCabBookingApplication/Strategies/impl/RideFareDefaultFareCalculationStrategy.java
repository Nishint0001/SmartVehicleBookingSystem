package com.SmartCabBookingApplication.Strategies.impl;

import com.SmartCabBookingApplication.DTO.RideRequestDto;
import com.SmartCabBookingApplication.Strategies.RideFareCalculationStrategy;

public class RideFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy
{
    @Override
    public double calculateFare(RideRequestDto rideRequestDto)
    {
        return 0;
    }
}
