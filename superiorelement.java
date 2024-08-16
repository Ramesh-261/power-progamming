public class superiorelement
 {
    public static void main(String args[]){
        int[] arr={7,9,5,2,8,7};
        int cnt=0;
        int sup=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>sup){
               sup=arr[i];
               cnt++;
            }
        }
        System.out.println(cnt);
    }
}
