package com.example.ridingservice.service;

import com.example.ridingservice.model.Ride;
import com.example.ridingservice.repo.RiderRepo;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@EnableAutoConfiguration
@EnableTransactionManagement
public class RiderServiceImpl implements RiderService{
   private RiderRepo riderRepo;

    public RiderServiceImpl(RiderRepo riderRepo) {
        this.riderRepo = riderRepo;
    }

    @Override
    @Transactional
    public Iterable<Ride> getAllRide() {
        return riderRepo.findAll();
    }

    @Override
    @Transactional
    public Optional<Ride> getRideById(String rideId) {
        return riderRepo.findById(rideId);
    }
}
