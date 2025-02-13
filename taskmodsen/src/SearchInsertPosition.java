public class SearchInsertPosition {
    public static int findInsertPosition(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left; // Возвращаем место для вставки
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6, 7};
        int targetValue = 7;
        System.out.println(findInsertPosition(numbers, targetValue));
    }
}