
import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miguel
 */
public class SpecialFood extends Food {
    
    public SpecialFood(Snake snake) {
        super(snake);
    }
    
    public void paint(Graphics g, int width, int height) {
        Util.drawSquare(g, row, col, Color.MAGENTA, width, height);
    }
    
}
