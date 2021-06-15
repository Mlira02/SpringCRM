package com.marcos.springcrm.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class CustomerItems
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerItemId;

    private int CustomerId;

    private int itemId;

    private int quantity;

    private boolean isPurchased;

    private String size;

    private boolean isShipped;

    private String notes;
}
