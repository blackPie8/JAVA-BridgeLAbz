import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        int num = 1634;

        if(isArmstrong(num)){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
    }

    static boolean isArmstrong(int n){
        int temp,last=0,digits=0,sum = 0;
        temp = n;
        while(temp>0){
            temp /= 10;
            digits++;
        }
        temp = n;
        while(temp>0){
            last = temp % 10;
            sum += (Math.pow(last, digits));
            temp /=10;
        }
        if(n==sum){
            return true;
        }
        else return false;
    }
}
