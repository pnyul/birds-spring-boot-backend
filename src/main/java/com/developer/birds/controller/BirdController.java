package com.developer.birds.controller;

import com.developer.birds.service.BirdService;
import com.developer.birds.model.Bird;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/birds")
public class BirdController {
    @Autowired
    private BirdService birdService;

    //returns all Bird objects
    @GetMapping("/")
    public ResponseEntity<List<Bird>> getAllBirds() {
        return new ResponseEntity<>(birdService.allBirds(), HttpStatus.OK);
    }

    //returns a Bird object by the given id
    @GetMapping("/{birdId}")
    public ResponseEntity<Optional<Bird>> getBird(@PathVariable String birdId) {
        return new ResponseEntity<>(birdService.getBird(birdId), HttpStatus.OK);
    }

}
