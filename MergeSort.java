public class MergeSort{
  
    public static void partition(int a[], int l, int h) {
        int mid = (l + h) / 2;
        if (l < h) {
            partition(a, l, mid);
            partition(a, mid + 1, h);
            merge(a, l, mid, h);
        }
    }
    
    public static void merge(int a[], int l, int mid, int h) {
        
        int[] arr = new int[h-l+1];

        int i = l, j = mid + 1, k = 0;

        while (i <= mid && j <= h) {
            if (a[i] <= a[j]) {
                arr[k++] = a[i++];
            } else {
                arr[k++] = a[j++];
            }
        }

        while (i <= mid) {
            arr[k++] = a[i++];
        }

        while (j <= h) {
            arr[k++] = a[j++];
        }

        int t=0;
        for (int m = l; m <= h; m++) {
            a[m] = arr[t++]; 
        }

    }
    
    public static void main(String[] args) {

        int[] arr = { 34, 54, 8, 19, 2, 1 };

        System.out.println("Array Before sorting: ");
        for(int a: arr)
            System.out.print(a + ", ");
        
        partition(arr, 0, arr.length - 1);

        System.out.println("\n Array after sorting: ");
        for(int a: arr)
            System.out.print(a + ", ");

    }
}