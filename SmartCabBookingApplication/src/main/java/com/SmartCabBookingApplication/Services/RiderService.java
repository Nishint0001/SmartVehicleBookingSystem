package com.SmartCabBookingApplication.Services;


import com.SmartCabBookingApplication.DTO.DriverDto;
import com.SmartCabBookingApplication.DTO.RideDto;
import com.SmartCabBookingApplication.DTO.RideRequestDto;
import com.SmartCabBookingApplication.DTO.RiderDto;

import java.util.List;

public interface RiderService
{
    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId,Integer rating);

    RiderDto getMyProfile();

    List<RideDto> getAllMyRides();

}
