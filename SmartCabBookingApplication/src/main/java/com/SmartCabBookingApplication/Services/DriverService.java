package com.SmartCabBookingApplication.Services;

import com.SmartCabBookingApplication.DTO.DriverDto;
import com.SmartCabBookingApplication.DTO.RideDto;
import com.SmartCabBookingApplication.DTO.RiderDto;

import java.util.List;

public interface DriverService
{
    RideDto acceptRide(Long rideId);

    RideDto cancelRide(Long rideId);

    RideDto startRide(Long rideId);

    RideDto endRide(Long rideId);

    RiderDto rateRider(Long rideId,Integer rating);

    DriverDto getMyProfile();

    List<RideDto> getAllMyRides();

}
