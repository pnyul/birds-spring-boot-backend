package com.developer.birds.repository;

import com.developer.birds.model.Spot;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpotRepository extends MongoRepository<Spot, ObjectId> {
}
