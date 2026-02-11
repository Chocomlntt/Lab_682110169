package rpg.lab01;

public class Characters {
    protected String name;
    protected int level;
    protected int healthPoints;
    protected int maxHealthPoints;
    protected Weapon weapon;
    private String charactersclass;

    public Characters() {
    }

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

    public Characters(String name, int level, int maxHealthPoints, Weapon weapon, String charactersclass){
        this.name=name;
        this.level=level;
        this.healthPoints=maxHealthPoints;
        this.maxHealthPoints=maxHealthPoints;
        this.weapon=weapon;
        this.charactersclass=charactersclass;
    }

    public void displayCharacterDetails(){
//        --- ARTHUR ---
        System.out.println("      --- "+name+" ---");
//        Class: Warrior
        System.out.println("Class:"+charactersclass);
//        Level: 10
        System.out.println("Level:"+level);
//        Health Points: 1500/1500
        System.out.println("Health Points:"+healthPoints+"/"+maxHealthPoints);
//        Weapon: Sword (Type: Melee, Damage: 25, Ability: Slash Attack)
        System.out.println("Weapon:"+weapon);
    }

    public int attack(){
//        Arthur (Warrior) attacks with Sword!
        System.out.println(name+" ("+charactersclass+") attacks with "+weapon.getName()+"!");
        int levelDamage = level * 2;
        int damage = weapon.getBaseDamage() + levelDamage;
//        Attack Damage: 45 (Weapon Base: 25 + Level Bonus: 20)
        System.out.println("Attack Damage: "+damage+" (Weapon Base: "+weapon.getBaseDamage()+" + Level Bonus: "+levelDamage+")");
        return damage;
    }

    public void takeDamage(int damage){
//        Merlin takes 45 damage! Current HP: 755/800
        healthPoints-=damage;
        System.out.println(name+" takes "+damage+" damage! Current HP: "+healthPoints+"/"+maxHealthPoints);
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
