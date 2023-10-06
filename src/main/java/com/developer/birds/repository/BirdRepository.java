package com.developer.birds.repository;

import com.developer.birds.model.Bird;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BirdRepository extends MongoRepository<Bird, ObjectId> {

    Optional<Bird> findBirdByBirdId(String birdId);

}
