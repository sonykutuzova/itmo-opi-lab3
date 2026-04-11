package org.example.lab.beans;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.example.lab.tools.PointService;

import org.example.lab.entities.PointEntity;
import java.io.Serializable;

@Named
@SessionScoped
public class PointBean implements Serializable {

    private double x;
    private double y;
    private double r;

    @Inject
    private PointService pointService;

    public void checkPoint() {
        pointService.processPoint(x, y, r);
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setR(double r) {
        this.r = r;
    }
    public double getX() { return x; }
    public double getY() { return y; }
    public void setY(double y) { this.y = y; }
    public double getR() { return r; }
}//аоаоаооа