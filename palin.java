public class palin {
    public static void main(String[] args) {
        int num = 121;
        int temp = num;

        int rev_num = 0;

        while(temp > 0){
            rev_num = ((rev_num*10) + (temp%10));
            temp/=10;
        }
        if(num == rev_num){
        System.out.println("Palindrome");
    }
    else{
        System.out.println("Not Palindrome");
    }
}}
