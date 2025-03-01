package com.SmartCabBookingApplication.Services;

import com.SmartCabBookingApplication.DTO.DriverDto;
import com.SmartCabBookingApplication.DTO.SignUpDto;
import com.SmartCabBookingApplication.DTO.UserDto;

public interface AuthService
{
    String login(String email,String password);

    UserDto signup(SignUpDto signUpDto);

    DriverDto onboardNewDriver(Long userId);

}
