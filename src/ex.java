import java.util.Scanner;

public class ex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayofweek = scanner.nextInt();

        switch (dayofweek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println(" tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("not in range");
                break;


        }
    }

}
