package rpg.lab04;

public interface Destructible {
    void receiveDamage(double amount);
    boolean isDestroyed();
    void breakOpen();
}
