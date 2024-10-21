public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] a, int low, int high) {
        int n = 0;
        int i = low, j = high;
        int pivot = a[low];

        while (i <= j) {
            while (i <= high && a[i] <= pivot) {
                i++;
            }
            while (j >= low && a[j] > pivot) {
                j--;
            }
            if (i < j) {
                int t = a[j];
                a[j] = a[i];
                a[i] = t;
                i++;j--;
            }

        }

        int t = a[j];
        a[j] = pivot;
        a[low] = t;

        n = j;

        return n;
    }

    public static void main(String[] args) {
        int[] arr = { 34, 1, 4, 2, 26, 23 };

        System.out.println("Array Before Sorting: ");
        for (int a : arr)
            System.out.print(a + ", ");

        quickSort(arr, 0, arr.length - 1);

        System.out.println("\nArray after Sorting: ");
        for (int a : arr)
            System.out.print(a + ", ");
    }
}
