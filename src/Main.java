import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int count = 0;
        int i =2;
        System.out.println("nhập vào số lượng số nguyên tố: ");
        n = scanner.nextInt();
        while (count<n){
            if (checkPrime(i)){
                System.out.print(i+" ");
                count++;
            }
            i++;
        }
    }

    public static boolean checkPrime(int n) {
        if (n<2){
            return false;
        }for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
