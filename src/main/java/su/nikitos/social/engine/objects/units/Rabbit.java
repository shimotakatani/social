package su.nikitos.social.engine.objects.units;

import su.nikitos.social.consts.ColorConst;
import su.nikitos.social.consts.DirectionConst;
import su.nikitos.social.engine.objects.GameMap;
import su.nikitos.social.engine.objects.GameMapCell;

import java.util.Random;
import java.util.Vector;

/**
 * create time 26.02.2018
 *
 * @author nponosov
 */
public class Rabbit {

    Random random = new Random();

    public int eatedGrass = 0;
    public int x = 0;
    public int y = 0;
    public int direction = DirectionConst.E;


    private void eatGrass(GameMapCell cell){
        if (cell.color == ColorConst.GREEN) {
            cell.color = ColorConst.WHITE;
            eatedGrass++;
        }
    }

    public void doTact(GameMap map){
        if (map.getCell(y, x).color == ColorConst.GREEN){
            eatGrass(map.getCell(y, x));
        } else {
            changeDirection();
            goForvard(map.capacity);
        }
    }

    private void changeDirection(){
        direction = random.nextInt(8);
    }

    private void goForvard(int capacity){
        switch (direction){
            case DirectionConst.E: x = Math.min(capacity-1, x+1);
            case DirectionConst.NE: {
                x = Math.min(capacity-1, x+1);
                y = Math.max(0, y-1);
            }
            case DirectionConst.N: y = Math.max(0, y-1);
            case DirectionConst.NW: {
                x = Math.max(0, x-1);
                y = Math.max(0, y-1);
            }
            case DirectionConst.W: x = Math.max(0, x-1);
            case DirectionConst.SW: {
                x = Math.max(0, x-1);
                y = Math.min(capacity-1, y+1);
            }
            case DirectionConst.S: y = Math.min(capacity-1, y+1);
            case DirectionConst.SE: {
                x = Math.min(capacity-1, x+1);
                y = Math.min(capacity-1, y+1);
            }
        }
    }

}
