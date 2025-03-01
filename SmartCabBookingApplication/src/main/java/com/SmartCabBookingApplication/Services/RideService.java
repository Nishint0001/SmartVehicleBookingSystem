package com.SmartCabBookingApplication.Services;


import com.SmartCabBookingApplication.DTO.RideDto;
import com.SmartCabBookingApplication.DTO.RideRequestDto;
import com.SmartCabBookingApplication.Entities.DriverEntity;
import com.SmartCabBookingApplication.Entities.Enums.RideStatusEnum;
import com.SmartCabBookingApplication.Entities.RideEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService
{
    RideEntity getRideById(Long rideId);

    void matchWithDriver(RideRequestDto rideRequestDto);

    RideEntity createNewRide(RideRequestDto rideRequestDto, DriverEntity driverEntity);

    RideEntity updateRideStatus(Long rideId, RideStatusEnum rideStatusEnum);

    Page<RideEntity> getAllRidesOfRider(Long riderId, PageRequest pageRequest);

    Page<RideEntity> getAllRidesOfDriver(Long driverId,PageRequest pageRequest);


}
