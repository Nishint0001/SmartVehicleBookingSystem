package com.SmartCabBookingApplication.Repositories;

import com.SmartCabBookingApplication.Entities.RideRequestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRequestRepository extends JpaRepository<RideRequestEntity,Long>
{

}
