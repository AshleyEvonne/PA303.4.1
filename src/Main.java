import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x = 7;
      //int x = 15;

        if (x < 10) {
            System.out.println("Less Than 10");

        }else System.out.println("Greater than 10");

        int y = 15;
      //int y = 50;

        if (y < 10) {
            System.out.println("less than 10");
        }else if (20 > y & y > 10) {
            System.out.println("Between 10 and 20");
        }else {
            System.out.println("Equal to or Greater than 20");
        }
         int z = 15;
        //int z = 5;
        if (z < 10 | z > 20) {
            System.out.println("Out of Range");
        } else {
            System.out.println("In Range");
        }

        int g = 95;

        if (g > 90){
            System.out.println('A');
        } else if (g > 80 & g < 89) {
            System.out.println('B');
        } else if (g > 70 & g < 79) {
            System.out.println('C');
        } else if (g > 60 & g< 69) {
            System.out.println('D');
        }else {
            System.out.println('F');
        }

        int dow = 5;

        Scanner scanner = new Scanner(System.in);

        switch (dow < 1 & dow > 7) {

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Out of Range");
                break;
        }
    }
}