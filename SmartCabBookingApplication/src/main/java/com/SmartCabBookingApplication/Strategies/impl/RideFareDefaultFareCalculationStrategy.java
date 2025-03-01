package com.SmartCabBookingApplication.Strategies.impl;

import com.SmartCabBookingApplication.DTO.RideRequestDto;
import com.SmartCabBookingApplication.Entities.RideRequestEntity;
import com.SmartCabBookingApplication.Services.DistanceService;
import com.SmartCabBookingApplication.Strategies.RideFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RideFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy
{
    private final DistanceService distanceService;
    @Override
    public double calculateFare(RideRequestEntity rideRequest)
    {
        Double distance=distanceService.calculateDistance(rideRequest.getPickUpLocation(), rideRequest.getDropOffLocation());
        return distance*Ride_Fare_Multiplier;
    }
}
