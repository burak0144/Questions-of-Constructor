package day28_constructor;

public class Deneme1 {
    int x;
    static int y;

    Deneme1(int i){                            //3.satir  i=2                            7.satir i=3
        x+=i;                                  //4.satir  x=0 x=0+2=2 isimsiz instance   8.satir x=0 x=0+3=3 dnm instance
        y+=i;                                  //5.satir  y=0 y=0+2=2 static             9.satir y=2 y=2+3=5 static
    }

    public static void main(String[] args) {   //1.satir
        new Deneme1(2);                     //2.satir  1 parametreli cons. git

        Deneme1 dnm=new Deneme1(3);         //6.satir 1 parametreli cons. git

        System.out.println(dnm.x+","+dnm.y);  //10.satir dnm.x=3(dnm instance) dnm.y=5(static)
    }
    /*
                                               SONUC
                                               3,5
     */
}
