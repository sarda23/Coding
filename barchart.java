import java.util.*;
public class barchart{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int max=arr[0];
        for(int i=1;i<n;i++)   
            if(max<arr[i])
                max=arr[i];

        for(int i=max;i>=1;i--){
            for(int j=0;j<n;j++){
                if(arr[j]>=i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}