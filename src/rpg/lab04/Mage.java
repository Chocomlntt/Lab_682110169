package rpg.lab04;

public class Mage extends Characters {
    private double mana;
    private double maxMana;

    public Mage(String name, int level, int maxHealthPoints, int damage, int defense, double maxMana, Weapon weapon) {
        super(name, level, maxHealthPoints, damage, defense, weapon, "Mage");
        this.maxMana=maxMana;
        this.mana=maxMana;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    @Override
    public void attack(Destructible taget){
        if (this.mana<=0){
            System.out.println("Don't have enough mana");
            return;
        }
        this.mana-=20;
        super.attack(taget);
    }

    @Override
    public void anotherDetails(){
        System.out.println("Mana: "+mana+"/"+maxMana);
    }
}
