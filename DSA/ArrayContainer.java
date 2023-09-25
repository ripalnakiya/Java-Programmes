package DSA;

public class ArrayContainer {
    static int continer(int arr[]) {
        int area = 0, min, diff, result;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                min = arr[i] < arr[j] ? arr[i] : arr[j];
                diff = j - i;
                result = min * diff;
                if (result > area)
                    area = result;
            }
        }
        return area;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(continer(arr));
    }
}
