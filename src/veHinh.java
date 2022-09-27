import java.util.Scanner;

public class veHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("**************MENU***************");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left,top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");

            System.out.println("Your choice is: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 8; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 2:
                    System.out.println("1. The corner is square at top-left");
                    System.out.println("2. The corner is square at top-right");
                    System.out.println("3. The corner is square at botton-left");
                    System.out.println("4. The corner is square at botton-right");
                    System.out.println("Your choice is: ");
                    int veTamGiacVuong = scanner.nextInt();
                    switch (veTamGiacVuong){
                        case 1:
                            for (int i = 5; i >0 ; i--) {
                                for (int j = 0; j < i; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println("\n");
                            }
                            break;
                        case 2:
                            for (int i = 0; i < 5; i++) {
                                for (int k = 0; k <= i; k++) {
                                    System.out.print("  ");
                                }
                                for (int j = 0; j < (5 - i); j++) {
                                    System.out.print("* ");
                                }
                                System.out.println("\n");
                            }
                            break;
                        case 3:
                            for (int i = 0; i < 5; i++) {
                                for (int j = 0; j <= i ; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println("\n");
                            }
                            break;
                        case 4:
                            for (int i = 1; i <= 5; i++) {
                                for (int j = 5; j >i ; j--) {
                                    System.out.print(" ");
                                }
                                for (int k = 1; k <= i; k++) {
                                    System.out.print("*");
                                }
                                System.out.println("\n");
                            }
                            break;
                        default:
                            System.out.println("Please choose 1-4");
                    }
                    break;
                case 3:
                    for (int i = 0; i <5; i++) {
                        for (int j = 0; j <(5-i-1);j++) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k <=i ; k++) {
                            System.out.print("* ");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please choose 1-3");
            }
        } while (true);
    }
}
