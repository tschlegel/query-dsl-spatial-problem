package com.example.querydslspatial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.locationtech.jts.geom.Point;

@Entity
public class SpatialEntity {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private Point point;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    Point getPoint() {
        return point;
    }

    void setPoint(Point point) {
        this.point = point;
    }
}
