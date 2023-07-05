package com.luanbr.client;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Client extends PanacheEntity {
    public String name;

}