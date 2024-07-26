import solutions.Solution;

public class App {
    public static void main(String[] args) throws Exception {
        Solution sol = new Solution();
        int[] testArray5 = {0, 1, 1, 2, 2, 2, 2, 3};
        System.out.println(sol.removeDuplicates2(testArray5));
    }
}
