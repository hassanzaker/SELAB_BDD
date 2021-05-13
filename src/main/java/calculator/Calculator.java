package calculator;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int operation(int a, int b, String opt){
        if (opt.equals("/")){
            return a / b;
        }
        else if (opt.equals("^")){
            int res = 1;
            for (int i = 0; i < b; i++) {
                res *= a;
            }
            return res;
        }
        else {
            return 0;
        }
    }
}
