import java.util.Scanner;
class ArmstrongOrNot {
    public boolean armstrongCheck(int num) {
        int temp = num;
        int sum = 0;
        while (temp != 0) {
            int rem = temp % 10;
            sum = sum + (rem * rem * rem);
            temp = temp / 10;
        }
        if (sum == num) {
            return true;
        } else {
            return false;
        }
    }
}

    public class Assignment1Q1 {
        public static void main(String[] args) {
            ArmstrongOrNot a = new ArmstrongOrNot();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a Number: ");

            int num = scanner.nextInt();
            boolean res = a.armstrongCheck(num);
            System.out.print(res);

        }
    }