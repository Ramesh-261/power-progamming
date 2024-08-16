import java.util.Scanner;
public class oddsumarr {
    public static int fun(int[] arr){
        int oddsum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                oddsum+=arr[i];
            }
        }
        return oddsum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(fun(arr));
    }
}
