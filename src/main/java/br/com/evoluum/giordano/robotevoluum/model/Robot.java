package br.com.evoluum.giordano.robotevoluum.model;

import lombok.Getter;

/**
 * @author Douglas Montanha Giordano
 */
public class Robot {
    @Getter
    private int x;
    @Getter
    private int y;
    @Getter
    private Coordinate direction;

    public Robot(){
        this.x = 0;
        this.y = 0;
        this.direction = Coordinate.N;
    }

    public void move(){
        switch (direction) {
            case N:
                this.y++;
                break;
            case S:
                this.y--;
                break;
            case E:
                this.x++;
                break;
            case W:
                this.x--;
                break;
        }
    }

    public void moveDirectionRight(){
        int nextDirection = this.direction.ordinal() + 1;
        this.direction = this.checkDirection(nextDirection);
    }

    public void moveDirectionLeft(){
        int previousDirection = this.direction.ordinal() - 1;
        this.direction = this.checkDirection(previousDirection);
    }

    public Coordinate checkDirection(int direction){
        if(direction < 0){
            return Coordinate.W;
        }else if (direction > 3){
            return Coordinate.N;
        } else {
            return Coordinate.values()[direction];
        }
    }
}
