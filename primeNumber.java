package primenumber;
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int num = sc.nextInt();
        boolean isPrime = true;
        for(int i = 2;i<num;i++){
            if(num%i==0){
                isPrime = false;
                break;
            }    
            }
        if(isPrime){
System.out.println(num+" 2is a Prime number");
        }else{
            System.out.println(num+" is not a Prime number");
        }
    }
    
}
