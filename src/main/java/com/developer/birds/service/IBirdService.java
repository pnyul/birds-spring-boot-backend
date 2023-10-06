package com.developer.birds.service;

import com.developer.birds.model.Bird;

import java.util.List;
import java.util.Optional;

public interface IBirdService {

    List<Bird> allBirds();
    Optional<Bird> getBird(String birdId);

}
