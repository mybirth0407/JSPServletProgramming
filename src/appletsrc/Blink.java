/**
 * Created by Yedarm Seong on 2016-01-13.
 */

import java.awt.*;
import java.util.*;

public class Blink extends java.applet.Applet {
    private Timer timer;
    private String labelString;
    private int delay;

    public void init() {
        String blinkFrequency = getParameter("speed");
        delay = (blinkFrequency == null) ?
            400 : (1000 / Integer.parseInt(blinkFrequency));
        labelString = getParameter("lbl");

        if (labelString == null) {
            labelString = "Blink";
        }

        Font font = new java.awt.Font("Serif", Font.PLAIN, 24);
        setFont(font);
    }

    public void start() {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                repaint();
            }
        }, delay, delay);
    }

    public void paint(Graphics g) {
        int fontSize = g.getFont().getSize();
        int x = 0, y = fontSize, space;
        int red = (int) (50 * Math.random());
        int green = (int) (50 * Math.random());
        int blue = (int) (50 * Math.random());
        Dimension d = getSize();
        g.setColor(Color.black);
        FontMetrics fm = g.getFontMetrics();
        space = fm.stringWidth(" ");

        for (StringTokenizer t = new StringTokenizer(labelString);
             t.hasMoreTokens(); ) {
            String word = t.nextToken();
            int w = fm.stringWidth(word) + space;

            if (x + w > d.width) {
                x = 0;
                y += fontSize;
            }

            if (Math.random() < 0.5) {
                g.setColor(
                    new java.awt.Color((red + y * 30) % 256,
                        (green + x / 3) % 256, blue));
            }
            else {
                g.setColor(getBackground());
            }

            g.drawString(word, x, y);
            x += w;
        }
    }

    public void stop() {
        timer.cancel();
    }
}
