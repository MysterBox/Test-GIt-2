import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner AmbilUser = new Scanner (System.in);
        String Tai = AmbilUser.nextLine();
        System.out.println(Tai);
        AmbilUser.close();
    }

}
