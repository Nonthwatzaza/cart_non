import jdk.jfr.Unsigned;

public class Music_CD implements Priceable {
    int years = 2019;
    int originalPrice = 500;
    private String Artist = "Tatsuro yamashita";
    private String Type = "City-pop";
    int Re_date = 1989;
    int deprecation;
    public int getPrice() {
        if (Re_date != 2019)
        {
            deprecation = (years - Re_date); //โดย 1 แผ่นราคา 500 บาท หากเป็นซีดีเพลงที่ไม่ได้ออกในปีปัจจุบัน ให้ราคาลดลงปีละ 10% แต่ราคาต่ำสุดคือ 100 บาท - เขียนส่วนการทดสอบการทำงานทั้งหมดในเมธอด main
            if (deprecation >8)
            {
                originalPrice -=400;
                return Math.max(originalPrice, 100);
            }
            else {
                originalPrice *= ((deprecation) * 10); // หาปี 500 *= ((1)*10);
                originalPrice /= 100;// 5000/100
            }
        }
        return Math.max(originalPrice, originalPrice);
    }
}
