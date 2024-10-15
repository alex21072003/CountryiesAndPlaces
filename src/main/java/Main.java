import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            System.out.println("Enter your numbers");
            int number = new Scanner(System.in).nextInt();
            int number1 = new Scanner(System.in).nextInt();
            int number2 = new Scanner(System.in).nextInt();
            int number3 = new Scanner(System.in).nextInt();
            int number4 = new Scanner(System.in).nextInt();
            if(number<=number1&&number<=number2&&number<=number3&&number<=number4){
            System.out.println("your number " + number + " is the smallest");
        }
         if(number>= number1&&number>=number2&&number>=number3&&number>=number4){
             System.out.println("your number " + number + " is the biggest");
         }
                if (number1<=number &&number1<=number2&&number1<=number3&&number1<=number4) {
                    System.out.println("your number " + number1 + " is the smallest");
                }
                if(number1>= number&&number1>=number2&&number1>=number3&&number1>=number4){
                    System.out.println("Your number " + number1 + " is the biggest");
                }
                if(number2<=number && number2<=number1 && number2<= number3 && number2<=number4) {
                    System.out.println("your number " + number2 + " is the smallest");
                }
                if(number2 >= number && number2>= number1 && number2 >= number3 && number2 >=number4){
                    System.out.println("your number " + number2 + " is the biggest");
                }
                if(number3<=number && number3<= number1 && number3<= number2 && number3<=number4) {
                    System.out.println("your number " + number3 + " is the smallest");
                }
                if(number3 >= number && number3>= number1&& number3 >= number2 && number3 >= number4){
                    System.out.println("your number " + number3 + " is biggest");
                }
                if(number4 <= number&& number4<=number3 && number4<=number2 && number4<= number1) {
                    System.out.println("your number " + number4 + " is the smallest");
                }
                if(number4 >= number && number4 >= number1 && number4>= number2&& number4>= number3){
                    System.out.println("your number " + number4 + " is the biggest");
                }
        }
    }