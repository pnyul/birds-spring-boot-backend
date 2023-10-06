package com.developer.birds.service;

import com.developer.birds.repository.SpotRepository;
import com.developer.birds.model.Bird;
import com.developer.birds.model.Spot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpotService implements ISpotService {
    @Autowired
    private SpotRepository spotRepository;
    @Autowired
    private MongoTemplate mongoTemplate;
    @Override
    public List<Spot> allSpots() {
        return spotRepository.findAll();
    }
    @Override
    public Spot createSpot(String spotDetails, String birdId) {

        Spot spot = spotRepository.insert(new Spot(spotDetails));

        mongoTemplate.update(Bird.class)
                .matching(Criteria.where("birdId").is(birdId))
                .apply(new Update().push("spotIds").value(spot))
                .first();

        return spot;
    }

}
