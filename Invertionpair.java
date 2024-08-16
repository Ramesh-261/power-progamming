public class Invertionpair
{
	public static void main(String[] args) {
	    int[] arr={1,20,6,4,5};
	    int cnt=0;
	    int n=arr.length;
	    for(int i=0;i<n;i++){
	        for(int j=i+1;j<n;j++){
	            if(arr[i]>arr[j]){
	                cnt++;
	            }
	        }
	    }
		System.out.println("Invertion Pair :"+cnt);
	}
}