package rpg.lab03;

public class Mage extends Characters {
    private double mana;

    public Mage(String name, int level, int maxHealthPoints, int damage, int defense, double mana, Weapon weapon) {
        super(name, level, maxHealthPoints, damage, defense, weapon, "Mage");
        this.mana=mana;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    @Override
    public void attack(Characters taget){
        if (taget.getHealthPoints()<=0){
            System.out.println("Can't attack die character");
            return;
        }
//        Arthur (Warrior) attacks Merlin with Sword!
        System.out.println(name+" ("+getCharactersclass()+") attacks "+taget.getName()+" with "+weapon.getName()+"!");
//        Raw Attack Damage: 45
        System.out.println("Raw Attack Damage: "+(damage+weapon.getBaseDamage()));
//        Merlin's Defense: 5 (reduces damage by 5)
        System.out.println(taget.getName()+"'s Defense: "+taget.getDefense()+" (reduces damage by "+taget.getDefense()+")");
//        Actual Damage Taken: 40
        System.out.println("Actual Damage Taken: "+((damage+weapon.getBaseDamage())-taget.getDefense()));
//        Merlin's HP: 760/800
        taget.setHealthPoints(taget.getHealthPoints()-((damage+weapon.getBaseDamage())-taget.getDefense()));
        if (taget.getHealthPoints()<0){
            taget.setHealthPoints(0);
        }
        System.out.println(taget.getName()+"'s HP: "+taget.getHealthPoints()+"/"+taget.getMaxHealthPoints());

    }
}
