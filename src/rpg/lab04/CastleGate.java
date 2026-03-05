package rpg.lab04;

public class CastleGate implements Destructible {
    private String name;
    private boolean isLocked;
    private boolean isReinforced;
    private double durability;
    private double maxDurability;
    private String status;

    public CastleGate(String name, double maxDurability,boolean isLocked, boolean isReinforced) {
        this.name=name;
        this.isLocked = isLocked;
        this.isReinforced = isReinforced;
        this.durability = maxDurability;
        this.maxDurability = maxDurability;
        this.status = "INTACT";
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public boolean isReinforced() {
        return isReinforced;
    }

    public void setReinforced(boolean reinforced) {
        isReinforced = reinforced;
    }

    public double getDurability() {
        return durability;
    }

    public void setDurability(double durability) {
        this.durability = durability;
    }

    public double getMaxDurability() {
        return maxDurability;
    }

    public void setMaxDurability(double maxDurability) {
        this.maxDurability = maxDurability;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayGateDetails() {
        System.out.println("\n      --- "+name+" ---");
        System.out.println("Durability: "+durability+"/"+maxDurability);
        System.out.println("Is Locked: "+isLocked);
        System.out.println("Is Reinforced: "+isReinforced);
        System.out.println("Status: "+status);
    }

    @Override
    public void receiveDamage(double amount) {
        setDurability(getDurability()-amount);
        if (getDurability()<=0){
            setDurability(0);
            isDestroyed();
            System.out.println("Can't attack destroyed "+getName());
        }
        System.out.println(name+"'s Durability: "+durability+"/"+maxDurability);
    }

    @Override
    public boolean isDestroyed() {
        if (getDurability()<=0) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void breakOpen() {

    }
}
