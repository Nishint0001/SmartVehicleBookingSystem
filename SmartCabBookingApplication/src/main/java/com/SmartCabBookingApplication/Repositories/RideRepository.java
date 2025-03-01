package com.SmartCabBookingApplication.Repositories;

import com.SmartCabBookingApplication.Entities.RideEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepository extends JpaRepository<RideEntity,Long>
{

}
