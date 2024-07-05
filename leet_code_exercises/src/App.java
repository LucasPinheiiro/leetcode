import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
        public List<String> fizzBuzz(int n) {
        //Create
        List<String> result = new ArrayList<>();
        for (int i = 0; i <= n; i++){
            if((n%3==0) && (n%5==0)){
                result.add("FizzBuzz");
            }else if(n%3==0){
                result.add("FizzBuzz");
            }else if(n%5==0){
                result.add("FizzBuzz");
            }else{
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}
