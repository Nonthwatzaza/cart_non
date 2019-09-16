import java.io.OutputStream;
import java.io.PrintStream;

// BY Nonthwat (ZAZA) suwannachairop
public class main {

    public static void main(String[] args) {
        PrintStream originalStream = System.out;
        PrintStream dummyStream = new PrintStream(new OutputStream(){
            public void write(int b) {
                // NO-OP
            }
        });


        Toothpick toothpick = new Toothpick();
        Music_CD MCD = new Music_CD();
        BattleShip ship = new BattleShip();
        ship.setAge(3);

        Cart cart1 = new Cart();
        cart1.items[1] = toothpick;
        cart1.items[2] = ship;
        cart1.items[3] = MCD;
        System.out.println(cart1.sumPrice());
        System.out.println("THB");
    }
}
