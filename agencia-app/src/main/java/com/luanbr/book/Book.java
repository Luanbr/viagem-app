package com.luanbr.book;


import com.luanbr.client.Client;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;

@Entity
public class Book extends PanacheEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    public Client client;
}
