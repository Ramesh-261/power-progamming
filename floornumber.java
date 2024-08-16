public class floornumber {
    public static void main(String args[]){
        int n=101;
        int ans=0;
        while(n>9){
            if(n%2==0){
                ans=(int)Math.floor((n-2)/2);
            }else{
                 ans=(int)Math.floor(n/2);
            }  
            n=ans; 
        }
        System.out.println(ans);
    }
    
}
