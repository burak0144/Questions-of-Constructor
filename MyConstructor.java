package day28_constructor;

public class MyConstructor {
    int x=3;
    int y=5;
   //this. diyorsa instance (obje uzerindeki)variable'a bakiyoruz.mc1 objesi oldugundan deger update olur,farkli obje olursa instance,in ilk degerini alir
    MyConstructor(){                                     //   7.satir
        x+=1;                                            //   8.satir x instance degerini alir(3)+1=4
        System.out.println("-x"+x);                      //(1)9.SATIR YAZDIRILIR -x4 yazdirir
    }                                                    //   10.satir,dan sonra geldigi yere doner(7den oncesi)
    MyConstructor(int i){                                //   5.satir i=3
        this();                                          //   6.saatir parametresiz constructora git
                                                         //
        this.y=i;                                        //   11.satir y'ye i nin degerini(5.satir)3atamis y=3
        x+=y;                                            //   12.satir x scopeda atanmadigindan instance 8.satir(4)degeri alir ve y degerini ekledi4+3=7
        System.out.println("-x"+x);                      //(2)13.SATIR YAZDIRILIR -x7 yazdirir
    }                                                    //   14.satir'dan sonra geldigi yere doner(5den oncesi)
    MyConstructor(int i, int i2){
        //   3.satir  i=4  i2=3
        this(3);                                      //   4.satir 1 parametreli constructora git

        this.x-=4;                                      //    15.satir x scopeda atanmadigindan instance 12.satir(7) degerini alir ve 4 cikarir 7-4=3
        System.out.println("-x"+x);                     // (3)16.SATIR YAZDIRILIR -x3 yazdirir
    }                                                   //    17.satir
                                                        //
    public static void main(String[] args) {            //    1.satir'dan baslar
        MyConstructor mc1=new MyConstructor(4,3); //    2.satir, 2 parametreli constructor'a gider
    } }                                                 //    18.satir
/*
                                                         SONUC
                                                         -x4
                                                         -x7
                                                         -x3
*/