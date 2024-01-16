public class Main {
    public static void main(String[] args) {
        Weapon b1 = new Weapon("ak-47", "rush");
        Boss boss = new Boss("Boss", 500, 50, b1);
        System.out.println(boss);
    }
}