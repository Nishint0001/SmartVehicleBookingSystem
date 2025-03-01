package com.SmartCabBookingApplication.Strategies;

import com.SmartCabBookingApplication.DTO.RideRequestDto;
import com.SmartCabBookingApplication.Entities.DriverEntity;
import com.SmartCabBookingApplication.Entities.RideRequestEntity;

import java.util.List;

public interface DriverMatchingStrategy
{
    List<DriverEntity> findMatchingDriver(RideRequestEntity rideRequestEntity);
}
