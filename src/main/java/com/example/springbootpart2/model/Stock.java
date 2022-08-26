package com.example.springbootpart2.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Stocks")
public class Stock {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private LocalDate date;
    private String type;

    @ManyToMany
    private List<Product> quantity;

    @ManyToOne
     private Users users;


    public Stock() {
    }


    public Stock(int id, LocalDate date, String type, List<Product> quantity, Users users) {
        this.id = id;
        this.date = date;
        this.type = type;
        this.quantity = quantity;
        this.users = users;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Product> getQuantity() {
        return quantity;
    }

    public void setQuantity(List<Product> quantity) {
        this.quantity = quantity;
    }
}
