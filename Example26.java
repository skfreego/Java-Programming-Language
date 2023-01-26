import java.util.Scanner;

public class Example26 {
    public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        System.out.println("Enter Employee Name: ");
        String name = e.nextLine();
        System.out.println("Enter Phone Number:");
        int number = e.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Phone: " + number);

    }
}