import java.util.Scanner;
public class ASALSAYI {
    public static void main(String[] args) {
        int sonuc,n,x;
        System.out.println("1-100 arası asal sayılar;");
        System.out.println("2\n"+"3\n"+"5\n"+"7");
        for(int i=1;i<=100;i++){
            n=i;
            if(n<=100 && n>1) {
                if(n%5!=0 && n%7!=0) {
                    if (n % 2 != 0 && n % 3 != 0) {

                        System.out.println(n);

                    }
                }
            }
        }
    }
}
