package com.suntask.demo.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mixinanode")
public class Mixinanode
{
    @Id
    private String id;

    private String param;
    private Double value;

    // Constructors
    public Mixinanode() {}

    public Mixinanode(String param, Double value) {
        this.param = param;
        this.value = value;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
