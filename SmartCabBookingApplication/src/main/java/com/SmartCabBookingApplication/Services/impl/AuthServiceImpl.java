package com.SmartCabBookingApplication.Services.impl;

import com.SmartCabBookingApplication.DTO.DriverDto;
import com.SmartCabBookingApplication.DTO.SignUpDto;
import com.SmartCabBookingApplication.DTO.UserDto;
import com.SmartCabBookingApplication.Services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService
{
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignUpDto signUpDto) {
        return null;
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
