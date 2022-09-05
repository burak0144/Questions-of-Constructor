package day28_constructor;

public class Deneme {
    static int count=0;

    public void increment(){                       //5.satir
        count++;                                   //6.satir count static oldugundan void'den direkt ulasildi obj1=0+1=1
                                                   //9.satirla 6.satirla ayni satirda obj2=1+1=2(static deger guncel kalir)

    }                                              //7.satir

    public static void main(String[] args) {      //1.satir
        Deneme obj1 = new Deneme();               //2.satir
        Deneme obj2 = new Deneme();               //3.satir

        obj1.increment();                         //4.satir increment metoduna gider
        obj2.increment();                         //8.satir increment metoduna gider  6.satira geri gider
        
        System.out.println("obj1 = " + obj1.count);  //10.satir static degerin guncel hali 2'dir  (9.satirda)
        System.out.println("obj2 = " + obj2.count);  //11.satir  2
    }
}
/*
                                                          SONUC
                                                            2
                                                            2
 */