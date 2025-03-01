package com.SmartCabBookingApplication.Strategies.impl;

import com.SmartCabBookingApplication.DTO.RideRequestDto;
import com.SmartCabBookingApplication.Entities.DriverEntity;
import com.SmartCabBookingApplication.Entities.RideRequestEntity;
import com.SmartCabBookingApplication.Strategies.DriverMatchingStrategy;

import java.util.List;

public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy
{
    @Override
    public List<DriverEntity> findMatchingDriver(RideRequestEntity rideRequestEntity) {
        return List.of();
    }
}
