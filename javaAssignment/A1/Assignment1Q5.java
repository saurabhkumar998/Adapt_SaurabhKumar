
import java.util.Scanner;

class TaxAmount{
    public double calculateTaxAmount(int ctc){
        if(ctc >0 && ctc <= 180000){
            return 0;
        }
        else if(ctc > 180000 && ctc <=300000){
            return (ctc*10)/100;
        }
        else if(ctc>300000 && ctc <= 500000){
            return (ctc*20)/100;
        }
        else{
            return (ctc*30)/100;
        }
    }
}
public class Assignment1Q5 {
    public static void main(String args[]) {
        System.out.print("Please Enter your CTC: ");
        Scanner scanner = new Scanner(System.in);
        int ctc = scanner.nextInt();
        TaxAmount t = new TaxAmount();
        double tax = t.calculateTaxAmount(ctc);
        System.out.println("Your tax is:"+tax);
    }
}

