package com.SmartCabBookingApplication.Repositories;

import com.SmartCabBookingApplication.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long>
{

}
