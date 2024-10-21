class SelectionSort{
    public static void main(String[] args){
        
        int[] arr = { 20, 7, 1, 15, 13, 8 };

        System.out.println("Before sorting");

        for(int next : arr)
            System.out.print(next + ", ");
        
        int t = 0, temp = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            t = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[t]) {
                    t = j;
                }

            }

            if (t != i) {
                temp = arr[i];
                arr[i] = arr[t];
                arr[t] = temp;
            }
        }

         System.out.println("\nAfter sorting");

        for(int next : arr)
            System.out.print(next + ", ");
        
        
    }
}

//output
// Before sorting
// 20, 7, 1, 15, 13, 8,
// After sorting
// 1, 7, 8, 13, 15, 20,