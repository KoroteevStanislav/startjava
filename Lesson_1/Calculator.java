public class Calculator {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 4;
        char sign = '^';
        int result = 0;

        if(num1 > 0 && num2 > 0) {
            if(sign == '+') {
                result = num1 + num2;
            } else if(sign == '-') {
                result = num1 - num2;
            } else if(sign == '*') {
                result = num1 * num2;
            } else if(sign == '/') {
                result = num1 / num2;
            } else if(sign == '%') {
                result = num1 % num2;
            } else if(sign == '^') {
                result = 1;
                for(int i = num2; i != 0; i--) {
                    result *= num1;
                }
            }
        }
        System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    }
}