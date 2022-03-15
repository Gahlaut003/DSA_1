
class REVERSE_1 {

    public void rotateArray(int arr[], int ele) {

        for (int j = 0; j < 2; j++) {
            int temp = arr[0];

            for (int i = 0; i < 6 - 1; i++) {
                System.out.println(arr[i]);
                arr[i] = arr[i + 1];
            }
            arr[6 - 1] = temp;

        }
    }

    public void printArray(int arr[], int n) {

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6 };

        REVERSE_1 rev = new REVERSE_1();
        rev.rotateArray(arr1, 2);

        rev.printArray(arr1, 6);
    }
}