package Tugas;
public class Barrier implements Destroyable{
    private int strength;
    
    public Barrier(int strength){
        this.strength = strength;
    }
    
    public int getStrength(){
        return strength;
    }

    @Override
    public void destroyed() {
        strength -= 15;
    }
    
    public String getBarrierInfo(){
        String info = "";
        info += "Barrier Strength : " + strength + "\n";
        return info;
    }
}
