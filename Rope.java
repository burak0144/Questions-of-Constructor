package day28_constructor;

public class Rope {
    public static void swing(){                 //6.satir      14.satir
        System.out.print("Swing ");           //7.SATIR "Swing " YAZDIRILIR  15.SATIR "Swing " YAZDIRILIR
    }                                           //8.satir 6.satirdan oncesine gider   16.satir
    public void climb(){
        System.out.println("climb ");
    }
    public static  void play(){                //4.satir      12.satir
        swing();                               //5.satir      13.satir
 //  climb(); //static'ten obje cagirma        //9.satir CTE hatasi verir ve 4.ten oncesine gider   17.satir
 //  icin obje olusturulmalidir bu yuzden CTE hatasi verir
    }                                                                                               //18.satir

    public static void main(String[] args) {  //1.satir
        Rope rope=new Rope();                 //2.satir rope diye obje olusturmus.rope const. olmadigindan default const.calisir
        rope.play();                          //3.satir play metoduna gider
        Rope rope2=null;                      //10.satir rope2 objesine null  degerini atamis
        rope.play();                          //11.satir play metoda tekrar gider

    }                                                                                               //19.satir
}                                                                                                   //20.satir
/*SONUC
Swing Swing
 */