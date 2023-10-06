package com.developer.birds.service;

import com.developer.birds.repository.BirdRepository;
import com.developer.birds.model.Bird;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BirdService implements IBirdService {

    @Autowired
    private BirdRepository birdRepository;
    @Override
    public List<Bird> allBirds() {
        return birdRepository.findAll();
    }
    @Override
    public Optional<Bird> getBird(String birdId) {
        return birdRepository.findBirdByBirdId(birdId);
    }

}
