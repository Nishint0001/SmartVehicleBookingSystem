package com.SmartCabBookingApplication.Controllers;

import com.SmartCabBookingApplication.DTO.RideRequestDto;
import com.SmartCabBookingApplication.Services.RiderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rider")
@RequiredArgsConstructor
public class RiderController
{
    private final RiderService riderService;

    @PostMapping("/requestRide")
    public ResponseEntity<RideRequestDto> requestRide(@RequestBody RideRequestDto rideRequestDto)
    {
        return ResponseEntity.ok(riderService.requestRide(rideRequestDto));
    }
}
