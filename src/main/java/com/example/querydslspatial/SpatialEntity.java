package com.example.querydslspatial;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.locationtech.jts.geom.Point;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SpatialEntity {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private Point point;

}
