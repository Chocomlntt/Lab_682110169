package rpg.lab03;

public class Warrior extends Characters {
    private double armorValue;

    public Warrior(String name, int level, int maxHealthPoints, int damage, int defense, double armorValue, Weapon weapon) {
        super(name, level, maxHealthPoints, damage, defense, weapon, "Warrior");
        this.armorValue=armorValue;
    }

    public double getArmorValue() {
        return armorValue;
    }

    public void setArmorValue(double armorValue) {
        this.armorValue = armorValue;
    }

    @Override
    public void receiveDamage(double amount){
        double finaldamagetaken = amount-armorValue;
        System.out.println("Reduces damage by "+armorValue);
        System.out.println("Actual Damage Taken: "+(finaldamagetaken));
        this.healthPoints-=finaldamagetaken;
        if (this.healthPoints<0){
            this.healthPoints=0;
        }
        System.out.println(this.name+"'s HP: "+this.healthPoints+"/"+this.maxHealthPoints);
    }

    @Override
    public void attack(Characters taget){
        if (taget.getHealthPoints()<=0){
            System.out.println("Can't attack die character");
            return;
        }
        System.out.println(name+" ("+getCharactersclass()+") attacks "+taget.getName()+" with "+weapon.getName()+"!");
        System.out.println("Raw Attack Damage: "+(damage+weapon.getBaseDamage()));
        System.out.println(taget.getName()+"'s Defense: "+taget.getDefense()+" (reduces damage by "+taget.getDefense()+")");
        double finaldamage =(((damage+weapon.getBaseDamage())-taget.getDefense())*1.5);
        System.out.println("Actual Damage Taken: "+(finaldamage)+" (1.5x damage bonus)");
        taget.receiveDamage(finaldamage);
    }

    @Override
    public void anotherDetails(){
        System.out.println("Armor: "+armorValue);
    }
}
