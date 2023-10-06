package com.developer.birds.service;

import com.developer.birds.model.Spot;

import java.util.List;

public interface ISpotService {

    List<Spot> allSpots();
    Spot createSpot(String spotDetails, String birdId);

}
