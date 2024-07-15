import solutions.Solution;

public class App {
    public static void main(String[] args) throws Exception {
        Solution sol = new Solution();
        int[] argument = {1, 12, 123, 1234, 123456};
        System.out.println(sol.findNumbers(argument));
    }
}
