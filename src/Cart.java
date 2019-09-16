import java.util.Scanner;


public class Cart implements Priceable {
    private final static int MAX_PRODUCT = 30;

    byte se;
    int sum;
    int pickup;
    Priceable[] items = new Priceable[MAX_PRODUCT];
    public int sumPrice() { // sum = sum of product
        pickup = 0 ;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < MAX_PRODUCT; i++) {
            int SRC;
            System.out.println("Select Product");
            SRC = input.nextInt();
            System.out.println("How many?");
            sum = input.nextInt();
            System.out.println(items[SRC]);
            if (items[SRC] != null) {
                System.out.println("Total");
                sum *= items[SRC].getPrice(); // จำนวน+สินค้า
                pickup+=sum;
                System.out.println(pickup);
                System.out.println("BUY NOW?");
                se = input.nextByte();
                if (se==1)
                    i+=MAX_PRODUCT;
            }
        }
        sum -= sumPriceWithDiscount();
        return sum;
    }


    public int sumPriceWithDiscount() {
        System.out.print("Add a custom discount? [ 1=Yes 0=No]");
        Scanner input = new Scanner(System.in);
        int Dis = input.nextInt();

        if (Dis == 1) {
            System.out.print("How many Discount [%] ?");
            int CDIS = input.nextInt();
            if (CDIS > 70)
            {
                System.out.print("discount not allower discount mush Not over 70%] ");
                pickup*= 0.30;
                System.out.println(pickup);
                return 0;
            }
            else
            {
                pickup*= (CDIS%1000);
                System.out.println(pickup);
                return 0;
            }
        }
        pickup*= 0.90;
        System.out.println(pickup);
        return 0;
    }
    public int getPrice() {
        return sumPrice();
    }
}


