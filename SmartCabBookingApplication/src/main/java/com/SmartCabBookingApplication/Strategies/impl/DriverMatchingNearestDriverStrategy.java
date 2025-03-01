package com.SmartCabBookingApplication.Strategies.impl;

import com.SmartCabBookingApplication.DTO.RideRequestDto;
import com.SmartCabBookingApplication.Entities.DriverEntity;
import com.SmartCabBookingApplication.Entities.RideRequestEntity;
import com.SmartCabBookingApplication.Strategies.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy
{
    @Override
    public List<DriverEntity> findMatchingDriver(RideRequestEntity rideRequestEntity)
    {
        return List.of();
    }
}
