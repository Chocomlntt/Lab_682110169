package rpg.lab04;

public class Archer extends Characters {
    private double accuracy;

    public Archer(String name, int level, int maxHealthPoints, int damage, int defense,double accuracy, Weapon weapon) {
        super(name, level, maxHealthPoints, damage, defense, weapon, "Archer");
        this.accuracy=accuracy;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    @Override
    public void attack(Destructible taget){
        if(Math.random()>accuracy){
            System.out.println("Miss");
        }else {
            super.attack(taget);
        }
    }
}
