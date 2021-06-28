package asteroids;

import javafx.geometry.Point2D;
import javafx.scene.shape.Polygon;

/**
 *
 * @author Vlad A. Popescu
 */
public class Ship extends Character {   

    public Ship(int x, int y) {
        super(new Polygon(-5, -5, 10, 0, -5, 5), x, y);        
    }
}
