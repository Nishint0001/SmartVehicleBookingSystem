package com.SmartCabBookingApplication.Repositories;

import com.SmartCabBookingApplication.Entities.DriverEntity;
import org.locationtech.jts.geom.Point;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DriverRepository extends JpaRepository<DriverEntity,Long>
{
    @Query(
            "SELECT d.*,ST_Distance(d.current_location,:pickUpLocation) AS distance "
            +
            "FROM drivers AS d"
            +
            "where available=true AND ST_DWithin(d.current_location,:pickUpLocation,10000)"
            +
            "ORDER BY distance "
            +
            "LIMIT 10"
    )


    List<DriverEntity> findTenNearestDrivers(Point pickUpLocation);
}
