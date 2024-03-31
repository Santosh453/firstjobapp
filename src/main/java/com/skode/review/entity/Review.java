package com.skode.review.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.skode.company.companyEntity.Company;
import jakarta.persistence.*;

@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private double rating;

    @JsonIgnore
    @ManyToOne
    private Company company;

    public Company getCompany() {
        return company;
    }

    public Review(Long id, String title, String description, double rating, Company company) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.rating = rating;
        this.company = company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }


    public Long getId() {
        return id;
    }

    public Review(Long id, String title, String description, double rating) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.rating = rating;
    }

    public Review() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
