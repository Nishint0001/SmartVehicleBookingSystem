package com.SmartCabBookingApplication.Services.impl;

import com.SmartCabBookingApplication.Services.DistanceService;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceImpl implements DistanceService {
    @Override
    public double calculateDistance(Point src, Point dest)
    {
        //will call 3rd party api here called OSRm to calc dist
        return 0;
    }
}
