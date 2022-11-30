package com.example.demo.models;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;

/*import .validation.constraints.Min.;
import .validation.constraints.NotEmpty;
import .validation.constraints.NotNull;
import .validation.constraints.Size;*/
import java.util.Date;

@Entity
public class Shoes {





    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty(message = "Заполните поле бренд и наименование")
    @Size(min = 2, max = 50,message = "Размер данного поля должен быть в диапазоне от 2 до 50")
    //@Pattern(regexp = "{A-Za-z0-9}*")
    private String brand;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @NotNull
    @Past
    private Date releaseDate;
    @NotNull
    @Column(nullable = false)
    private Boolean season;
   /* @Pattern(regexp = "^[0-9]+$")*/
    @Min(value = 1,message = "Минимальное значение 1")
    private Double weight;
    @NotEmpty(message = "Заполните поле артикул")
    /*@Pattern(regexp = "^[0-9]+$")*/
    @Size(min = 11, max = 11, message = "Артикул содержит 11 цифр")
    private String article;

    public Shoes(){
        weight = 0.0;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Boolean getSeason() {
        return season;
    }

    public void setSeason(Boolean season) {

        this.season = season;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {

        this.weight = weight;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {

        this.article = article;
    }




}
