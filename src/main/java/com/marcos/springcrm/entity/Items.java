package com.marcos.springcrm.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Items
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private double price;

    private String locationId;

    private int quantity;

    private String size;

    private String type;

    // Possibly in main parks boolean
    // private boolean inMainParks;

}
