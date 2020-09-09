package com.example.ridingservice.rest;

import com.example.ridingservice.ex.RideNotFoundException;
import com.example.ridingservice.model.Ride;
import com.example.ridingservice.service.RiderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class RiderController {

    private RiderService riderService;

    public RiderController(RiderService riderService) {
        this.riderService = riderService;
    }
    @RequestMapping(method = RequestMethod.GET,produces ={MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_ATOM_XML_VALUE},value = "/rides")
    public ResponseEntity<Iterable<Ride>> findAllRide()
    {
        return ResponseEntity.status(HttpStatus.OK).body(riderService.getAllRide());
    }
    @RequestMapping(method = RequestMethod.GET,produces ={MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_ATOM_XML_VALUE},value = "/rides/{rideId}")
    public ResponseEntity<Optional<Ride>> findRideById(@PathVariable("rideId") String rideId) throws RideNotFoundException {
        Optional<Ride> ride=riderService.getRideById(rideId);
        Ride ride1=ride.get();
        if (ride1==null)
        {
            throw new RideNotFoundException("ride not found with id: "+rideId);
        }

        return new ResponseEntity<Optional<Ride>>(riderService.getRideById(rideId),HttpStatus.OK);
    }

}
