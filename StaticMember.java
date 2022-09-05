package day28_constructor;

public class StaticMember {
    static int x;
    int y;

    StaticMember(){                            //3.satir                      7.satir
        x+=2;                                  //4.satir x=0+2=2 static       8.satir x=2+2=4 static
        y++;                                   //5.satir y=0+1=1 sm1 instance 9.satir y=0+1=1 sm2 instance
    }
    static int getSquare(){                    //11.satir
        return x*x;                            //12.satir x static deger 4 =>4*4=16
    }                                          //13.satir

    public static void main(String[] args) {   //1.satir
        StaticMember sm1=new StaticMember();   //2.satir
        StaticMember sm2=new StaticMember();   //6.satir

        int z=sm1.getSquare();                //10.satir

        System.out.println("-x"+z+"-y"+sm2.y); //14.satir  -x16-y1
    }}                                         //15.satir
/*
                                                SONUC
                                                -x16-y1
 */
