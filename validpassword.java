 import java.util.Scanner;
// class validpassword
// {
//    public static int fun(String str,int n)
//     {
//        int a=0;
//        int b=0;
//        if(n<4) return 0;
//        if(str.charAt(0)-'0'>=0 && str.charAt(0)-'0'<=9) return 0;
//        for(int i=0;i<n;i++)
//         {
//            if(str.charAt(i)==' ' || str.charAt(i)=='/') return 0;
//            if(str.charAt(i)>=65 && str.charAt(i)<=90) a++;
//            else if(str.charAt(i)-'0'>=0 && str.charAt(i)-'0'<=9) b++;
//        }
//          if(a>0&&b>0){
//             return 1;
//          }else{
//             return 0;
//          } 
//     }
           
//    public static void main(String args[])
//     {
//       Scanner sc=new Scanner(System.in);
//       System.out.print("Enter The Stirng-:");
//       String str=sc.nextLine();
//       int n=str.length();
//       int ans=fun(str,n);
//       System.out.println(ans);
//    }
// }



class validpassword
{
    public static int chkpsd(String str, int n) {
    int num = 0;int cap = 0;
    if (n < 4) {
        return 0;
    }
    if (Character.isDigit(str.charAt(0))) {
        return 0;
    }
    for (int i=0;i<n;i++) {
        char ch=str.charAt(i);
        if (ch ==' ' || ch =='/') {
            return 0;
        }
        if (Character.isUpperCase(ch)) {
            cap++;
        } else if (Character.isDigit(ch)) {
            num++;
        }
    }
    if (cap>0&&num>0){
        return 1;
     }
        return 0; 
 }
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter The Stirng-:");
      String str=sc.nextLine();
	    int n=str.length();
	    int ans=chkpsd(str,n);
	    System.out.println(ans);
	}
}