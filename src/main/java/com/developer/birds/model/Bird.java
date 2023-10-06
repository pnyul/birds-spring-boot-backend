package com.developer.birds.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

//this class represents a general bird with some main properties
@Document(collection = "birds")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bird {

    @Id
    private ObjectId id;

    private String birdId;

    private String species;

    private String genus;

    private String family;

    private String order;

    private String populationSize;

    private String lifeSpan;

    private String weight;

    private String length;

    private String wingspan;

    private String clutchSize;

    private String incubationPeriod;

    private String independentAge;

    private String populationStatus;

    private String populationTrend;

    private String pictureLink;

    private String videoLink;

    private List<String> distribution;

    @DocumentReference
    private List<Spot> spotIds;

}
