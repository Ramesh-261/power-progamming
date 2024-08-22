public class strdecode
{
       public static void main(String[] args) {
	   String s="10111011";
	   int cnt=0;
	   String ans="";
	   for(int i=0;i<s.length();i++){
	       if(s.charAt(i)=='1'){
	           cnt++;
	       }else{
	          ans+=(char)('A'+cnt-1);
	          cnt=0;
	       }
	   }
	    ans+=(char)('A'+cnt-1);
	   System.out.println(ans);
	}
}