package org.example.lab.beans;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.example.lab.entities.PointEntity;
import org.example.lab.tools.ApplicationService;
import org.example.lab.tools.PointService;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Named
@ApplicationScoped
public class ResultsBean implements Serializable {

    private List<PointEntity> points = new ArrayList<>();

    @Inject
    private PointService pointService;

    public List<PointEntity> getAllPoints() {return pointService.getAllPoints();
    }

    public String formatTime(Date timestamp) {
        if (timestamp == null) return "";
        return new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(timestamp);
    }
    public String formatExecutionTime(long executionTime) {
        return String.format("%.3f", executionTime / 1_000_000.0);
    }
}