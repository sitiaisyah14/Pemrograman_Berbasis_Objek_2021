/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author WINDOWS 10
 */
public class PlainCandy extends GameItem implements Movable, Crushable{
    @Override
    public void disappear() {
        this.positionX = -1;
        this.positionY = -1;
    }
    
    @Override
    public void moveLeft() {
        this.positionX -= 1;
    }

    @Override
    public void moveRight() {
        this.positionX += 1;
    }

    @Override
    public void moveUp() {
        this.positionY += 1;
    }

    @Override
    public void moveDown() {
        this.positionY -= 1;
    }

    
    
}

