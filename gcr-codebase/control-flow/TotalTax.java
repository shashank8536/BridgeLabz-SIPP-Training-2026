
import java.util.Scanner;

public class TotalTax{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        double totalTax =0;
        for(int i:arr){
            if(i<10000){
                System.out.println("amount:"+i+"tax"+(0.05*i));
                totalTax+=(double)0.05*i;
            }else if(i>=10000 && i<50000){
                System.out.println("amount:"+i+"tax"+(0.15*i));
            }else{
                System.out.println("amount:"+i+"tax"+(0.3*i));
            }
        }
    
}

}
