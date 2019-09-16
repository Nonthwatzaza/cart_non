import java.util.Scanner;


public class Cart implements Priceable {
    private final static int MAX_PRODUCT = 30;
    int cout=0;
    int couter=0;
    byte se;
    int sum;
    float pickup;
    int extpic;
    Priceable[] items = new Priceable[MAX_PRODUCT];

    public int sumPrice() { // sum = sum of product
        pickup = 0 ;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < MAX_PRODUCT; i++) {
            int SRC;
            System.out.println("List");
            System.out.println("1 = Toothpick");
            System.out.println("2 = Battle ship");
            System.out.println("3 = Music CD");
            System.out.println("================");
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
            float CDIS = input.nextInt();
            if (CDIS > 70)
            {
                System.out.print("discount not allower discount mush Not over 70%] ");
                extpic+=pickup;
                pickup*= 0.30;
                extpic-=pickup;
                System.out.println(extpic);
                return extpic;
            }
            else
            {
                extpic+=pickup;
                pickup *= ((CDIS/100));
                extpic-=pickup;
                System.out.println(extpic);
                return extpic;
            }
        }
        pickup*= 0.90;
        extpic+=pickup;
        System.out.println(extpic);
        return extpic;
    }
    public int getPrice() {
        return sumPrice();
    }
}


