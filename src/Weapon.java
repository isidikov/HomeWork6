public class Weapon {
    private String nameWeapon;
    private String typeWeapon;

    public Weapon(String nameWeapon, String typeWeapon) {
        this.nameWeapon = nameWeapon;
        this.typeWeapon = typeWeapon;
    }

    public String getNameWeapon() {
        return nameWeapon;
    }

    public void setNameWeapon(String nameWeapon) {
        this.nameWeapon = nameWeapon;
    }

    @Override
    public String toString() {
        return "Weapon {" +
                "nameWeapon='" + nameWeapon +
                "\ntypeWeapon='" + typeWeapon + '\'' +
                '}';
    }

    public String getTypeWeapon() {
        return typeWeapon;
    }

    public void setTypeWeapon(String typeWeapon) {
        this.typeWeapon = typeWeapon;
    }
}