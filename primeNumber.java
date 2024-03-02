import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        boolean asallik = true;        

        if (sayi<=1){
            asallik = false;
        }else{
            for (int i =2; i<=Math.sqrt(sayi); i++){
                if (sayi %i ==0){
                    asallik= false;
                    break;
                }
            }
        }
        if(asallik){
            System.out.print("Bu sayı asal sayıdır: "+sayi);
        }else{
            System.out.print("Bu sayı asal sayı değildir: "+sayi);
        }
        scanner.close();  
    }
}