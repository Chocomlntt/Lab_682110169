package rpg.lab04;

public class WoodenBox implements Destructible{
    private String name;
    private double durability;
    protected double maxDurability;
    private boolean isLock;
    private String whenOpen;

    public WoodenBox(String name,  double maxDurability, boolean isLock, String whenOpen) {
        this.name = name;
        this.durability = maxDurability;
        this.maxDurability = maxDurability;
        this.isLock = isLock;
        this.whenOpen = whenOpen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxDurability() {
        return maxDurability;
    }

    public void setMaxDurability(double maxDurability) {
        this.maxDurability = maxDurability;
    }

    public boolean isLock() {
        return isLock;
    }

    public void setLock(boolean lock) {
        isLock = lock;
    }

    public String getWhenOpen() {
        return whenOpen;
    }

    public void setWhenOpen(String whenOpen) {
        this.whenOpen = whenOpen;
    }

    public double getDurability() {
        return durability;
    }

    public void setDurability(double durability) {
        this.durability = durability;
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
        System.out.println(whenOpen);
    }

    public void displayBoxDetails() {
        System.out.println("\n      --- "+name+" ---");
        System.out.println("Durability: "+durability+"/"+maxDurability);
        System.out.println("Is lock: "+isLock);
    }
}
