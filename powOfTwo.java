import java.util.*;
public class powOfTwo {

    public static int powOf_two(int power){
        if(power==0){
            return 1;
        }
        return 2*powOf_two(power-1);
    }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int power = sc.nextInt();
        while(power>=0){
        int result = powOf_two(power);
        System.out.println(result);
        power--;
        }
    }
}
