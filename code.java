import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        int r;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number colors: ");
        r = input.nextInt();
        switch (r) {
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Orange");
                break;
            case 3:
                System.out.println("Yellow");
                break;
            case 4:
                System.out.println("Green");
                break;
            case 5:
                System.out.println("Blue");
                break;
            case 6:
                System.out.println("Indigo");
                break;
            case 7:
                System.out.println("Violet");
                break;
            default:
                System.out.println("Invalid colors");
        }
    }
}
