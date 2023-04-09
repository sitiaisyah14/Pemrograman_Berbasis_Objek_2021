package Tugas;

public abstract class Zombie implements Destroyable{
    protected int health;
    protected int level;
    
    @Override
    public abstract void destroyed();
    
    public String getZombieInfo(){
        String info = "";
        info += "Health : " + health + "\n";
        info += "Level : " + level + "\n";
        return info;
    }
}
