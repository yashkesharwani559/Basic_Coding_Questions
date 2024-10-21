//quick sort using median of three approach to make the quick sort time complexity O(nlogn) in the worst case also

public class QuickSort2 {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivotIndex = mid(arr, low, high);
        int pivot = arr[pivotIndex];

        int i = low, j = high;

        while (i < j) {
            while (i <= high && arr[i] <= pivot) {
                i++;
            }
            while (j >= low && arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                if (arr[i] == pivot)
                    pivotIndex = j;
                else if(arr[j] == pivot)
                    pivotIndex = i;
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;

                i++;
                j--;
            }
        }

        int t = arr[j];
        arr[j] = arr[pivotIndex];
        arr[pivotIndex] = t;

        return j;
    }

    public static int mid(int[] arr, int low, int high) {
        int mid = (low + high) / 2;

        if (arr[low] <= arr[mid] && arr[mid] <= arr[high] || arr[high] <= arr[mid] && arr[mid] <= arr[low])
            return mid;
        else if(arr[mid] <= arr[high] && arr[high] <= arr[low] || arr[low] <= arr[high] && arr[high] <= arr[mid])
            return high;

        else
            return low;
    }

    public static void main(String[] args) {
        int[] arr = { 34, 1, 19, 5, 10 };

        System.out.println("Array Before Sorting: ");
        for (int a : arr)
            System.out.print(a + ", ");

        quickSort(arr, 0, arr.length - 1);

        System.out.println("\nArray After Sorting: ");
        for (int a : arr)
            System.out.print(a + ", ");

    }
}
