public class Boss extends GameEntity{
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return getName() +
                "\nhealth = " + getHealth() +
                "\ndamage = " + getDamage() +
                "\n" + getWeapon();
    }

    public Boss(String name, int health, int damage, Weapon weapon) {
        super(name, health, damage);
        this.weapon = weapon;
    }
}