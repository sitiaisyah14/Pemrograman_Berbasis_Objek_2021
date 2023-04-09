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
public class GameItem {
    protected int positionX;
    protected int positionY;
    protected int score;
    protected String icoName;
    
    public int getPositionX(){
        return positionX;
    }
    
    public void setPositionX(int positionX){
        this.positionX = positionX;
    }
    
    public int getPositionY(){
        return positionY;
    }
    
    public void setPositionY(int positionY){
        this.positionY = positionY;
    }
    
    public int getScore(){
        return score;
    }
    
    public void setScore(int score){
        this.score = score;
    }
    
    public String getIcoName(){
        return icoName;
    }
    
    public void setIcoName(String icoName){
        this.icoName = icoName;
    }
}
