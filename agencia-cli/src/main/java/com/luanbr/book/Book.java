package com.luanbr.book;

import com.luanbr.client.Client;

public class Book {
    private Client client;

    private long id;

    private Book(Client client) {
        this.client = client;
    }

    public static Book of(Client client) {
        return new Book(client);
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public long getId(){return this.id;}

    public void setId(long id) {
        this.id = id;
    }
}
