import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter your place");
            String place = new Scanner(System.in).nextLine();
            System.out.println("Enter your country");
            String country = new Scanner(System.in).nextLine();
            if (place.equals("Red square") && country.equals("Russia")) {
                System.out.println("you can go there");
            } else if (place.equals("Elbrus") && country.equals("USA")) {
                System.out.println("You are in sanctions.But you can go there in the other airport");
            } else if (place.equals("Niagara Falls") && country.equals("USA")) {
                System.out.println("You are in sanctions.But you can go there in the other airport");
            } else if (place.equals("Grand Canyon") && country.equals("Usa")) {
                System.out.println("You are in sanctions.But you can go there in the other airport");
            } else if (place.equals("Louvre") && country.equals("France")) {
                System.out.println("You are in sanctions.But you can go there in the other airport");
            } else if (place.equals("Hermitage") && country.equals("Russia")) {
                System.out.println("You can go there");
            } else {
                System.out.println("you are wrong. Go and look on the map");
            }
        }
    }
}