import solutions.Solution;

public class App {
    public static void main(String[] args) throws Exception {
        Solution sol = new Solution();
        int[] argument1 = new int[]{0, 1, 3, 5, 7, 0, 0, 0};
        int size_argument1 = 5;
        int[] argument2 = {2, 4, 6};
        int size_argument2 = 3;
        sol.merge(argument1, size_argument1, argument2, size_argument2);
    }
}
