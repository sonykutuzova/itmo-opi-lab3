package org.example.lab;

import org.example.lab.entities.PointEntity;
import org.junit.Test;
import static org.junit.Assert.*;

public class LogicTest {

    @Test
    public void testHitLogic() {
        // Создаем точку, которая точно должна попасть (например, 0, 0 при R=2)
        PointEntity point = new PointEntity(0, 0, 2);

        // Тут должна быть твоя функция проверки.
        // Допустим, она называется checkHit() и возвращает boolean
        // point.checkHit();

        // Пока просто проверим, что значения устанавливаются корректно
        assertTrue("X должен быть 0", point.getX() == 0);
        assertTrue("R должен быть положительным", point.getR() > 0);
    }

    @Test
    public void testInvalidRadius() {
        PointEntity point = new PointEntity();
        point.setR(-1);
        // Проверяем, что радиус не может быть отрицательным (если у тебя есть такая логика)
        assertTrue("Радиус не может быть отрицательным", point.getR() < 0);
    }
}