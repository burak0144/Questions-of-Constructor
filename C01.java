package day28_constructor;

public class C01 {
    static int sayi=10;
    int rakam=5;

    public static void main(String[] args) {

        C01 obj1=new C01();
        System.out.println("obj1'in rakam degeri :"+obj1.rakam);   //5
        System.out.println("obj1'in sayi degeri :"+ sayi);     //10

        obj1.rakam+=1;  //5+1=6     obj'nin yeni degeri
        sayi+=1;        //11        statik variable'i direkt arttiririz

        System.out.println("obj1'in rakam degeri :"+obj1.rakam);   //6
        System.out.println("obj1'in sayi degeri :"+ sayi);         //11

        C01 obj2 = new C01();
        System.out.println("obj1'in rakam degeri :"+obj1.rakam);    //5  yeni obje olustugundan instance'in ilk degerini alir
        System.out.println("obj1'in sayi degeri :"+sayi);           //11 statik class'ta son degeri gecerlidir

        obj2.rakam++;
        sayi++;

        System.out.println("obj1'in rakam degeri :"+obj1.rakam);    //6
        System.out.println("obj1'in sayi degeri :"+sayi);           //12
    }
}
