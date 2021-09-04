package com.BiCycleParts.bicycle.entity;
import javax.persistence.*;

// 2. Entity - POJO

@Entity
@Table(name = "bikeparts")
public class BikeParts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "identifier")
    private String identifier;

    @Column(name = "name")
    private String name;

    @Column(name = "bike_type")
    private String bikeType;

    public BikeParts() {
    }

    public BikeParts(int id, String identifier, String name, String bikeType) {
        this.id = id;
        this.identifier = identifier;
        this.name = name;
        this.bikeType = bikeType;
    }

    public int getId() {
        return id;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public String getBikeType() {
        return bikeType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    @Override
    public String toString() {
        return "BikeParts{" +
                "id=" + id +
                ", identifier=" + identifier +
                ", name=" + name +
                ", bikeType=" + bikeType +
                '}';
    }
}
