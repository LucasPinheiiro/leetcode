import solutions.Solution;

public class App {
    public static void main(String[] args) throws Exception {
        Solution sol = new Solution();
        int[] argument1 = new int[]{1,2,3,0,0,0};
        int size_argument1 = 3;
        int[] argument2 = {2, 5, 6};
        int size_argument2 = 3;
        sol.merge(argument1, size_argument1, argument2, size_argument2);
    }
}
