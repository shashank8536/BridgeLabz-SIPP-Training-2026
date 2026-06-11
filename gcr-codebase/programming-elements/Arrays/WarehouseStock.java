package Arrays;

import java.util.Scanner;

public class WarehouseStock {
    public static void min_max(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
    public static void Total(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("total"+ sum);
    }
    public static void search(int[] arr,int k){
        boolean found = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                System.out.println("Item found"+ i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Not found");
        }
    }
    public static void FindDuplicate(int[] arr){
        System.out.println("Duplicates:");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
    public static void rotate(int[] arr,int k){
        int n= arr.length;
        int[] result = new int[n];

        for(int i=0;i<n;i++){
            int newIndex = (i+k)%n;
            result[newIndex]=arr[i];
        }
        for(int i=0; i<n; i++){
            System.out.print(result[i] + " ");
        }
        System.out.println();
        // if return then arrays.toString(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] stock = {45,20,60,20,90,15,60};
        min_max(stock);
        Total(stock);
        search(stock, 20);
        FindDuplicate(stock);
        rotate(stock, 2);
    }
}
