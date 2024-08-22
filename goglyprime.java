// public class goglyprime {
    
// }
public class goglyprime
{
    public static boolean prime(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
	    int num=42;
	    int ans=num%9;
	    System.out.print(ans+" ");
		System.out.print(prime(num));
	}
}