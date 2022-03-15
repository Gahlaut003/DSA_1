class Reversal_array_rotation {

    public void reverseRotation(int arr[], int n, int num) {

        int start = n;
        int end = num;
        while (start < end) {
            int temp = arr[start];

            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }

    }

    public void leftRotate(int arr[], int d) {
        int n = arr.length;
        if (d == 0)
            return;

        d = d % n;
        reverseRotation(arr, 0, d - 1);
        reverseRotation(arr, d, n - 1);
        reverseRotation(arr, 0, n - 1);

    }

    public void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        Reversal_array_rotation revRotation = new Reversal_array_rotation();
        // revRotation.reverseRotation(arr, 2);
        revRotation.leftRotate(arr, 2);
        revRotation.printArray(arr);

    }

}
