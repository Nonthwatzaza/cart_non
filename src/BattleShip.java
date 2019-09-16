public class BattleShip implements Priceable {

    int originalPrice = 1000000;
    int age = 0;

    public void setAge(int year) {
        age = year;
    }

    public int getPrice() {
        int deprecation = age * 100000;
        return Math.max(originalPrice - deprecation, 10000);
    }
}

