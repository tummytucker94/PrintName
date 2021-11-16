import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("What's Your Name?");
            String name = scanner.nextLine();

            //concatenator operator
            System.out.println("Hello "+ name + " ,it's a pleasure to meet you!");
        }
        finally{
            scanner.close();
        }
        
    }
}
