import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            int i, toplam=0;
            Scanner input=new Scanner(System.in);
            do {
                System.out.println("bir sayı giriniz:");
                i=input.nextInt();
                if (i%2==0&&i%4==0){
                    toplam =toplam+i;
                }
            }
            while (i%2==0);

            System.out.println("4 ve 2'nin kati sayilerin toplami:" +toplam);//4ve2 nin kati olan sayi toplami



    }
}
