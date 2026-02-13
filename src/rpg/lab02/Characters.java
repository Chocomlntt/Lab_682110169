package rpg.lab02;

public class Characters {
    protected String name;
    protected int level;
    protected int healthPoints;
    protected int maxHealthPoints;
    protected Weapon weapon;
    protected int defense;
    protected int damage;
    protected String status="Active";
    private String charactersclass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public void setMaxHealthPoints(int maxHealthPoints) {
        this.maxHealthPoints = maxHealthPoints;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getCharactersclass() {
        return charactersclass;
    }

    public void setCharactersclass(String charactersclass) {
        this.charactersclass = charactersclass;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Characters(String name, int level, int maxHealthPoints, int damage, int defense, Weapon weapon, String charactersclass){
        this.name=name;
        this.level=level;
        this.healthPoints=maxHealthPoints;
        this.maxHealthPoints=maxHealthPoints;
        this.weapon=weapon;
        this.charactersclass=charactersclass;
        this.damage=damage;
        this.defense=defense;
    }

    public void displayCharacterDetails(){
//        --- ARTHUR ---
        System.out.println("\n      --- "+name+" ---");
//        Class: Warrior
        System.out.println("Class: "+charactersclass);
//        Status: Active
        System.out.println("Status: "+status);
//        Level: 10
        System.out.println("Level: "+level);
//        Health Points: 1500/1500
        System.out.println("Health Points: "+healthPoints+"/"+maxHealthPoints);
//        Damage: 20
        System.out.println("Damage: "+damage);
//        Defense: 10
        System.out.println("Defense: "+defense);
//        Weapon: Sword (Type: Melee, Damage: 25, Ability: Slash Attack)
        System.out.println("Weapon: "+weapon);
    }

    public void attack(Characters taget){
        if (taget.getHealthPoints()<=0){
            System.out.println("Can't attack die character");
            return;
        }
//        Arthur (Warrior) attacks Merlin with Sword!
        System.out.println(name+" ("+charactersclass+") attacks "+taget.getName()+" with "+weapon.getName()+"!");
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

    public void levelUp(){
//        Arthur leveled up to Level 11!
        System.out.println(name+" leveled up to Level "+(level++));
        maxHealthPoints+=10;
        healthPoints=maxHealthPoints;
//            Max Health increased to 1510 (full heal applied)
        System.out.println("Max Health increased to "+maxHealthPoints+" (full heal applied)");
    }
}
