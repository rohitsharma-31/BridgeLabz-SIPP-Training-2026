import java.util.*;

public class EmployeeAttendanceRanking {
    public static int[] topKEmployees(int[] employeeIds, int[] attendance, int K) {
        int n = employeeIds.length;
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) idx[i] = i;
        Arrays.sort(idx, (a,b) -> {
            if (attendance[b] != attendance[a]) return Integer.compare(attendance[b], attendance[a]);
            return Integer.compare(employeeIds[a], employeeIds[b]);
        });
        int[] res = new int[K];
        for (int i = 0; i < K; i++) res[i] = employeeIds[idx[i]];
        return res;
    }

    public static void main(String[] args) {
        int[] employeeIds = {101,102,103,104,105};
        int[] attendance = {92,85,98,92,80};
        int K = 3;
        int[] top = topKEmployees(employeeIds, attendance, K);
        System.out.println(Arrays.toString(top));
    }
}
