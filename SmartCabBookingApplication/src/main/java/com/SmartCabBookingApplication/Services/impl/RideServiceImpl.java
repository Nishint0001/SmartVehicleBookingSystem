package com.SmartCabBookingApplication.Services.impl;


import com.SmartCabBookingApplication.DTO.RideRequestDto;
import com.SmartCabBookingApplication.Entities.DriverEntity;
import com.SmartCabBookingApplication.Entities.Enums.RideStatusEnum;
import com.SmartCabBookingApplication.Entities.RideEntity;
import com.SmartCabBookingApplication.Services.RideService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class RideServiceImpl implements RideService
{
    @Override
    public RideEntity getRideById(Long rideId) {
        return null;
    }

    @Override
    public void matchWithDriver(RideRequestDto rideRequestDto) {

    }

    @Override
    public RideEntity createNewRide(RideRequestDto rideRequestDto, DriverEntity driverEntity) {
        return null;
    }

    @Override
    public RideEntity updateRideStatus(Long rideId, RideStatusEnum rideStatusEnum) {
        return null;
    }

    @Override
    public Page<RideEntity> getAllRidesOfRider(Long riderId, PageRequest pageRequest) {
        return null;
    }

    @Override
    public Page<RideEntity> getAllRidesOfDriver(Long driverId, PageRequest pageRequest) {
        return null;
    }


}

