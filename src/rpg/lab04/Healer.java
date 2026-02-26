package rpg.lab04;

public class Healer extends Characters {
    private int healpower;

    public int getHealpower() {
        return healpower;
    }

    public void setHealpower(int healpower) {
        this.healpower = healpower;
    }

    public Healer(String name, int level, int maxHealthPoints, int damage, int defense, Weapon weapon, int healpower) {
        super(name, level, maxHealthPoints, damage, defense, weapon, "Healer");
        this.healpower=healpower+(level*3);
    }

    public void displayCharacterDetails(){
        System.out.println("      --- "+name+" ---");
        System.out.println("Class: "+getCharactersclass());
        System.out.println("Status: "+status);
        System.out.println("Level: "+level);
        System.out.println("Health Points: "+healthPoints+"/"+maxHealthPoints);
        System.out.println("Damage: "+damage);
        System.out.println("Defense: "+defense);
        System.out.println("Weapon: "+weapon);
        System.out.println("Healing Power: "+healpower);
    }

    public void heal(){
//        Elara (Healer) casts a healing spell!
        System.out.println(name+" (Healer) casts a healing spell!");
//                Healing Amount: 57 (Base: 30 + Level Bonus: 27)
        System.out.println("Healing Amount: "+healpower+" (Base: "+weapon.getBaseDamage()+" + Level Bonus: "+(level*3)+")");
        healthPoints+=healpower;
        if (healthPoints>maxHealthPoints){
            healthPoints=maxHealthPoints;
        }
//        Restored 57 HP! Current HP: 1000/1080
        System.out.println("Restored "+healpower+" HP! Current HP: "+healthPoints+"/"+maxHealthPoints);
    }
    public void healAlly(Characters taget){
//        Elara (Healer) casts healing spell on Arthur!
        System.out.println(name+" (Healer) casts healing spell on "+taget.getName()+"!");
//                Healing Amount: 57
        System.out.println("Healing Amount: "+healpower);
        taget.setHealthPoints(taget.getHealthPoints()+healpower);
        if (taget.getHealthPoints()> taget.getMaxHealthPoints()){
            taget.setHealthPoints(taget.getMaxHealthPoints());
        }
//        Restored 57 HP to Arthur! Their HP: 1510
        System.out.println("Restored "+healpower+" HP to "+taget.getName()+"! Their HP: "+taget.getHealthPoints()+"/"+taget.getMaxHealthPoints());

    }
}
