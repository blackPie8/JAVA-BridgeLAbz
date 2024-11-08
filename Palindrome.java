public class Palindrome {
    public static void main(String[] args) {
        int num = 1231;
        if(num == isPal(num)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }

    static int isPal(int n){
        int rev_num = 0;
        while(n>0){
            rev_num = ((rev_num*10) + (n%10));
            n/=10;
        }
        return rev_num;
    }
}
