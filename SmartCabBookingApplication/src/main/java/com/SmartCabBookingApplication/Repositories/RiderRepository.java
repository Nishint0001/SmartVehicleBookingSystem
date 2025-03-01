package com.SmartCabBookingApplication.Repositories;

import com.SmartCabBookingApplication.Entities.RiderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiderRepository extends JpaRepository<RiderEntity,Long>
{

}
