package org.example.lab;

import org.example.lab.entities.PointEntity;
import org.junit.Test;
import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void testPointCreation() {
        PointEntity point = new PointEntity();
        point.setX(1.0);
        assertEquals(1.0, point.getX(), 0.01);
    }
}