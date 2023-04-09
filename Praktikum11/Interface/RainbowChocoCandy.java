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
public class RainbowChocoCandy extends GameItem implements Movable, Explosive{
    @Override
    public void disappear() {
        this.positionX = -1;
        this.positionY = -1;
    }

    @Override
    public void destroy() {
        System.out.println("Pecahkan 10 permen secara random");
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
