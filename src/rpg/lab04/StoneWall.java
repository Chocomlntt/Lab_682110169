package rpg.lab04;

public class StoneWall implements Destructible {
    private String location;
    private double durability;
    private double maxDurability;
    private String type;

    public StoneWall(String location, double maxDurability, String type) {
        this.location = location;
        this.type = type;
        this.maxDurability = maxDurability;
        this.durability = maxDurability;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void displayWallDetails() {
    }

    @Override
    public void receiveDamage(double amount) {

    }

    @Override
    public boolean isDestroyed() {
        return false;
    }

    @Override
    public void breakOpen() {

    }
}
