package it.univaq.we.testSpringMysqlFreemarker.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "car")
public class Car implements java.io.Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="maker", nullable=false, length=64)
    private String maker;

    @Column(name="model", nullable=false, length=64)
    private String model;

    @Temporal(TemporalType.DATE)
    @Column(name = "year", nullable = false)
    private Date year;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }
}