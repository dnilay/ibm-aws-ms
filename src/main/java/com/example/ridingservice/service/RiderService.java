package com.example.ridingservice.service;

import com.example.ridingservice.model.Ride;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface RiderService {
    public Iterable<Ride> getAllRide();
    public Optional<Ride> getRideById(String rideId);
}
