import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap vao so thu hai");
        int num2 = sc.nextInt();
        for (int i = 1; i < num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println(i);
            }
        }
    }
}