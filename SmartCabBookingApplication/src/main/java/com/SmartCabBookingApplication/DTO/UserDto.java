package com.SmartCabBookingApplication.DTO;

import com.SmartCabBookingApplication.Entities.Enums.RoleEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto
{
    private String name;
    private String email;
    private Set<RoleEnum> roles;


}
