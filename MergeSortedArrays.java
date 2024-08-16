public class MergeSortedArrays {

    public static void main(String[] args) {
	    int[] a={1,2,4,20};
	    int[] b={3,6,9,15};
	    int n1=a.length;
	    int n2=b.length;
	    int[] tmp=new int[n1+n2];
	    int k=0;
	    int i=0;
	    int j=0;
	    while(i<n1 && j<n2){
	        if(a[i]<=b[j]){
	            tmp[k]=a[i];
	            i++;
	            k++;
	        }else{
	            tmp[k]=b[j];
	            j++;
	            k++;
	        }
	    }
              while (j < n2)
            {
              tmp[k++] = b[j++];
            }

             while (i < n1) 
	        {
                tmp[k++] = a[i++];
             }
	    
	     for (int item : tmp) 
         {
            System.out.print(" "+item);
         }
	}
}
