import java.util.Scanner;
public class binarystring {
    public static int fun(String s){
        int n=s.length();
        if(n==0) return -1;
        int res=s.charAt(0);
        for(int i=1;i<n;i+=2){
            char a=s.charAt(i);
            int b=s.charAt(i+1)-'0';
            if(a=='A') res &=b;
            else if(a=='B') res |=b;
            else   res ^=b;
        }
        return res;
    }
    public static void main(String args[]){
        System.out.print("Enter The String-:");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        //String s="1C0C1C1A0B1";//1
        int ans=fun(s);
        System.out.println(ans);
    }
}
