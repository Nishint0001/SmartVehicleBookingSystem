package com.SmartCabBookingApplication.Services.impl;

import com.SmartCabBookingApplication.DTO.DriverDto;
import com.SmartCabBookingApplication.DTO.RideDto;
import com.SmartCabBookingApplication.DTO.RideRequestDto;
import com.SmartCabBookingApplication.DTO.RiderDto;
import com.SmartCabBookingApplication.Entities.Enums.RideRequestStatusEnum;
import com.SmartCabBookingApplication.Entities.RideRequestEntity;
import com.SmartCabBookingApplication.Repositories.RideRequestRepository;
import com.SmartCabBookingApplication.Repositories.RiderRepository;
import com.SmartCabBookingApplication.Services.RiderService;
import com.SmartCabBookingApplication.Strategies.DriverMatchingStrategy;
import com.SmartCabBookingApplication.Strategies.RideFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class RiderServiceImpl implements RiderService
{
    private final ModelMapper modelMapper;
    private final RideRequestRepository rideRequestRepository;
    private final RideFareCalculationStrategy rideFareCalculationStrategy;
    private final DriverMatchingStrategy driverMatchingStrategy;

    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto)
    {
        RideRequestEntity rideRequestEntity=modelMapper.map(rideRequestDto, RideRequestEntity.class);

        rideRequestEntity.setRideRequestStatusEnum(RideRequestStatusEnum.PENDING);

        Double fare=rideFareCalculationStrategy.calculateFare(rideRequestDto);
        rideRequestEntity.setFare(fare);

        driverMatchingStrategy.findMatchingDriver(rideRequestEntity);

       RideRequestEntity savedEntity= rideRequestRepository.save(rideRequestEntity);

        log.info(rideRequestEntity.toString());

        return modelMapper.map(savedEntity, RideRequestDto.class);

    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return List.of();
    }
}
