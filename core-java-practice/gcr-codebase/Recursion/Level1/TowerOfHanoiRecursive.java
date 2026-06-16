public class TowerOfHanoiRecursive {
    public static void solve(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }
        solve(n - 1, from, aux, to);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        solve(n - 1, aux, to, from);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println("Tower of Hanoi moves for " + n + " disks:");
        solve(n, 'A', 'C', 'B');
    }
}
