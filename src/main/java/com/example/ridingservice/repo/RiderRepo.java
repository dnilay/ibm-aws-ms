package com.example.ridingservice.repo;

import com.example.ridingservice.model.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiderRepo extends JpaRepository<Ride,String> {
}
