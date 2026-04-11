package org.example.lab.tools;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.example.lab.entities.PointEntity;
import org.example.lab.tools.ApplicationService;
import java.util.List;

@ApplicationScoped
public class PointService {

    @Inject
    private ApplicationService applicationService;

    public void processPoint(double x, double y, double r) {
        long startTime = System.nanoTime();
        PointEntity point = new PointEntity(x, y, r);
        long executionTime = System.nanoTime() - startTime;
        point.setExecutionTime(executionTime);

        applicationService.savePoint(point);
    }

    public List<PointEntity> getAllPoints() {
        return applicationService.getAllPoints();
    }
}