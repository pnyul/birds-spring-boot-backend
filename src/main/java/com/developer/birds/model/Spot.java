package com.developer.birds.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "spots")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Spot {

    @Id
    private ObjectId id;

    //the circumstances of the observation
    private String details;

    public Spot(String details) {
        this.details = details;
    }

}
