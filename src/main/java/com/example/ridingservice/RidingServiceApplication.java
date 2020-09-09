package com.example.ridingservice;

import com.example.ridingservice.model.Ride;
import com.example.ridingservice.repo.RiderRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class RidingServiceApplication implements CommandLineRunner {
    private RiderRepo riderRepo;

    public RidingServiceApplication(RiderRepo riderRepo) {
        this.riderRepo = riderRepo;
    }

    public static void main(String[] args) {
        SpringApplication.run(RidingServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        riderRepo.save(new Ride(generateId(),"fourth dimension",5,5));
        riderRepo.save(new Ride(generateId(),"twistter",4,5));
        riderRepo.save(new Ride(generateId(),"roller custer",4,4));

    }

    private String generateId()
    {
        String uuId= UUID.randomUUID().toString();
        String uuIdArr[]=uuId.split("-");
        return uuIdArr[0];
    }
}
