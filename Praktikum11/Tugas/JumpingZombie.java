package Tugas;
public class JumpingZombie extends Zombie{
    
    public JumpingZombie(int health, int level){
        this.health = health;
        this.level = level;
    }

    @Override
    public void destroyed() {
        health = (int)(health) - (int)(0.1 * health);
    }
    
    public String getZombieInfo(){
        String info = "";
        info += "Jumping Zombie Data : \n";
        info += super.getZombieInfo();
        return info;
    }
}
