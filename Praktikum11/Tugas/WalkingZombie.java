package Tugas;
public class WalkingZombie extends Zombie{
    
    public WalkingZombie(int health, int level){
        this.health = health;
        this.level = level;
    }

    @Override
    public void destroyed() {
        health = (int)(health) - (int)(health * 0.2);
    }
    
    public String getZombieInfo(){
        String info = "";
        info += "Walking Zombie Data : \n";
        info += super.getZombieInfo();
        return info;
    }
}
