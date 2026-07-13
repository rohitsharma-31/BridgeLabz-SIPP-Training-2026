import java.util.Arrays;

public class CountingSortGenres {
    // Assumes genre codes in range [minCode, maxCode] inclusive (1..20 typical)
    public static void countingSort(int[] arr, int minCode, int maxCode) {
        if (arr == null || arr.length == 0) return;
        int range = maxCode - minCode + 1;
        int[] count = new int[range];
        for (int v : arr) count[v - minCode]++;
        int idx = 0;
        for (int i = 0; i < range; i++) {
            while (count[i]-- > 0) arr[idx++] = i + minCode;
        }
    }

    public static void main(String[] args) {
        int[] genres = {5, 2, 20, 1, 5, 3, 2, 10, 20, 1};
        System.out.println("Genres before: " + Arrays.toString(genres));
        countingSort(genres, 1, 20);
        System.out.println("Genres after:  " + Arrays.toString(genres));
    }
}
