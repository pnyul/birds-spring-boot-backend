package com.developer.birds.controller;

import com.developer.birds.service.SpotService;
import com.developer.birds.model.Spot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/spots")
public class SpotController {
    @Autowired
    private SpotService spotService;

    //returns all Spot objects regardless of the Bird objects
    @GetMapping("/")
    public ResponseEntity<List<Spot>> getAllSpots() {
        return new ResponseEntity<>(spotService.allSpots(), HttpStatus.OK);
    }

    @PostMapping
    private ResponseEntity<Spot> createSpot(@RequestBody Map<String, String> s) {
        return new ResponseEntity<>(spotService.createSpot(s.get("details"), s.get("birdId")), HttpStatus.CREATED);
    }

}
