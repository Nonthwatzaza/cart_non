public class Music_CD implements Priceable {
    int years = 2019;
    int originalPrice = 500;
    private String Artist = "Tatsuro yamashita";
    private String Type = "City-pop";
    int Re_date = 1989;
    int OLD;
    int deprecation;
    int finold = 500;

    public int getPrice() {
        if (Re_date != 2019)
        {
            deprecation = ((years - Re_date)); //โดย 1 แผ่นราคา 500 บาท หากเป็นซีดีเพลงที่ไม่ได้ออกในปีปัจจุบัน ให้ราคาลดลงปีละ 10% แต่ราคาต่ำสุดคือ 100 บาท - เขียนส่วนการทดสอบการทำงานทั้งหมดในเมธอด main
            OLD += 500;
            OLD *= ((deprecation) * 10); // หาปี 500 *= ((1)*10);
            OLD /= 100;              // 5000/100
            finold -= OLD;
            if (finold <= 100)
            {
                return Math.max(originalPrice, 100);
            }
        }
        return Math.max(originalPrice, finold);
    }
}
