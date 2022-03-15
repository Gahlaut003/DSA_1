class REVERSE_1 {

    public static void rvereseArray(int arr[]) {

        for (int i = arr.length - 1; i >= 0; i--) {

            System.out.println(arr[i]);

        }

    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6 };
        // printArray(arr, 6);
        rvereseArray(arr);
        System.out.println("Reversed array is ");
        // printArray(arr, 6);

    }
}