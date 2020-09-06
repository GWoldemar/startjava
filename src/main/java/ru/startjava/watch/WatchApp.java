package ru.startjava.watch;

import ru.startjava.core.GraphicsCore;

import java.awt.*;

import static java.lang.Math.*;

public class WatchApp extends GraphicsCore {
    public WatchApp() {
        super();
    }

    @Override
    protected void showGraphics(Graphics graphics) {
//        graphics.setColor(Color.GREEN);
//        graphics.drawOval(100, 200, 100, 100);
//        graphics.fillOval(); // центр
//        graphics.setColor(Color.MAGENTA);
//        graphics.drawString(String.valueOf(12), 20, 20);
        // 1. Нарисовать окружность

        // 2. Нарисовать циферблат
        for (int i = 1; i <= 12; i++) {
            final int xt = (int) (115 + round(100 * sin(6.28 * 30 * i / 360)));
            final int yt = (int) (115 - round(100 * cos(6.28 * 30 * i / 360)));
            // отобразить число
        }

        // 3. Нарисовать центр

        // 4. Нарисовать минутную стрелку
        // i = 12

        // 5. Нарисовать часовую стрелку
        // i = 4

        // 6. Нарисовать секундную стрелку
        // i = 10
    }

    public static void main(String[] args) {
        run(new WatchApp(), "Watch");
    }
}
