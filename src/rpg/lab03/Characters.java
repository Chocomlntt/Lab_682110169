package rpg.lab03;

public class Characters {
    protected String name;
    protected int level;
    protected double healthPoints;
    protected double maxHealthPoints;
    protected Weapon weapon;
    protected double defense;
    protected double damage;
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

    public double getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    public double getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public void setMaxHealthPoints(double maxHealthPoints) {
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

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
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
        System.out.println("\n      --- "+name+" ---");
        System.out.println("Class: "+charactersclass);
        System.out.println("Status: "+status);
        System.out.println("Level: "+level);
        System.out.println("Health Points: "+healthPoints+"/"+maxHealthPoints);
        System.out.println("Damage: "+damage);
        System.out.println("Defense: "+defense);
        anotherDetails();
        System.out.println("Weapon: "+weapon);
    }

    public void anotherDetails(){

    }

    public void attack(Characters taget){
        if (taget.getHealthPoints()<=0){
            System.out.println("Can't attack die character");
            return;
        }
//        Arthur (Warrior) attacks Merlin with Sword!
        System.out.println(name+" ("+charactersclass+") attacks "+taget.getName()+" with "+weapon.getName()+"!");
        System.out.println("Raw Attack Damage: "+(damage+weapon.getBaseDamage()));
        System.out.println(taget.getName()+"'s Defense: "+taget.getDefense()+" (reduces damage by "+taget.getDefense()+")");
        double finaldamage = (damage+weapon.getBaseDamage())-taget.getDefense();
        System.out.println("Actual Damage Taken: "+(finaldamage));
        taget.receiveDamage(finaldamage);
    }

    public void levelUp(){
        System.out.println(name+" leveled up to Level "+(level++));
        maxHealthPoints+=10;
        healthPoints=maxHealthPoints;
        System.out.println("Max Health increased to "+maxHealthPoints+" (full heal applied)");
    }

    public void receiveDamage(double amount){
        healthPoints-=amount;
        if (healthPoints<=0){
            healthPoints=0;
        }
        System.out.println(name+"'s HP: "+healthPoints+"/"+maxHealthPoints);
    }

}
