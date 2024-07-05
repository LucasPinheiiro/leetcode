import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Solution sol = new Solution();
        List<String> response = new ArrayList<String>(sol.fizzBuzz(3));
        for(String s : response){
            System.out.println(s);
        }
    }
}
