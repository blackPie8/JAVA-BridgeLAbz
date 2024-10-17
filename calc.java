import java.util.*;
public class calc {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char operator;
        double result;
        double num1 = sc.nextInt();
        double num2 = sc.nextInt();

        System.out.println("Choose an operation ->  - + * /");
        operator = sc.next().charAt(0);

        switch(operator){
            case '+':
            result = num1 + num2;
            System.out.println(result);
            break;

            case '-':
            result = num1 - num2;
            System.out.println(result);
            break;

            case '*':
            result = num1 * num2;
            System.out.println(result);
            break;

            case '/':
            result = num1 / num2;
            System.out.println(result);
            break;

            default:
            System.out.println("Invalid Operator");
        }


    }
}
