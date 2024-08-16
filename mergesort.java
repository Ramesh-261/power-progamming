 class mergesort {
    public static void divide(int arr[], int low, int high) {
         if (low >= high) {
             return;
         }
         int mid = (low + high) / 2;
         divide(arr, low, mid);
         divide(arr, mid + 1, high);
         conquer(arr, low, mid, high);
     }
     public static void conquer(int arr[], int low, int mid, int high) {
         int[] tmp = new int[high - low + 1];
         int i = low, j = mid + 1, k = 0;
         while (i <= mid && j <= high) {
             if (arr[i] <= arr[j]) {
                 tmp[k++] = arr[i++];
             } else {
                 tmp[k++] = arr[j++];
             }
         }
         while (i <= mid) {
             tmp[k++] = arr[i++];
         }
         while (j <= high) {
             tmp[k++] = arr[j++];
         }
         for (int l = 0; l < tmp.length; l++) {
             arr[low + l] = tmp[l];
         }
     }
     public static void main(String args[]) {
         int[] arr = {4, 2, 1, 33, 45, 22};
         divide(arr, 0, arr.length - 1);
         for (int num : arr) {
             System.out.print(num + " ");
         }
     }
 }
 