package com.SmartCabBookingApplication.Strategies.impl;

import com.SmartCabBookingApplication.DTO.RideRequestDto;
import com.SmartCabBookingApplication.Entities.DriverEntity;
import com.SmartCabBookingApplication.Entities.RideRequestEntity;
import com.SmartCabBookingApplication.Repositories.DriverRepository;
import com.SmartCabBookingApplication.Strategies.DriverMatchingStrategy;
import lombok.RequiredArgsConstructor;
import org.hibernate.grammars.hql.HqlParser;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy
{
    private final DriverRepository driverRepository;
    @Override
    public List<DriverEntity> findMatchingDriver(RideRequestEntity rideRequestEntity)
    {
        return driverRepository.findTenNearestDrivers(rideRequestEntity.getPickUpLocation());
    }
}
