
class Armstrong{
    public int armstrongOrNot(int n){
        int sum = 0;
        int temp = n;
        while(temp != 0){
            int rem = temp%10;
            sum = sum + (rem*rem*rem);
            temp = temp/10;
        }
        return sum;
    }
}

public class Assignment1Q2{
    public static void main (String [] args) {

       Armstrong a =  new Armstrong();

        for(int i=100; i<1000; i++){
            int arm = a.armstrongOrNot(i);
            if(arm == i){
                System.out.print(i+" ");
            }
        }


    }
}