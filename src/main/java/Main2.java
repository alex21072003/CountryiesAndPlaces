import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter your number");
            int num_list = new Scanner(System.in).nextInt();

                if (num_list % 2 == 0) {
                    System.out.println("this is your number");
                } else {
                    System.out.println("this is not your number");
                }

            }
        }
    }