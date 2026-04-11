package org.example.lab.entities;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "points")
public class PointEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "x_coord", nullable = false)
    private double x;

    @Column(name = "y_coord", nullable = false)
    private double y;

    @Column(name = "radius", nullable = false)
    private double r;

    @Column(name = "hit_result", nullable = false)
    private boolean hit;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false)
    private Date timestamp;

    @Column(name = "execution_time")
    private long executionTime;

    public PointEntity() {
        this.timestamp = new Date();

    }

    public PointEntity(double x, double y, double r) {
        this();
        this.x = x;
        this.y = y;
        this.r = r;
        this.hit = checkHit();
    }

    public void setExecutionTime(long executionTime) {
        this.executionTime = executionTime;
    }

    private boolean checkHit() {
        boolean rect = (x >= -r && x <= 0) && (y >= -r && y <= 0);
        boolean tri = (x >= -r/2 && x <= 0) && (y >= 0 && y <= 2 * x + r);
        boolean circle = (x >= 0 && y >= 0 && (x*x + y*y <= (r/2)*(r/2)));

        return rect || tri || circle;
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    public boolean isHit() {
        return hit;
    }
    public void setHit(boolean hit) {
        this.hit = hit;
    }
    public Date getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    public long getExecutionTime() {
        return executionTime;
    }
}

