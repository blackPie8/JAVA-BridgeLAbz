public class revStr {
    public static void main(String[] args) {
        String str = "Hello, Welcome to BL";

        char ch;
        String newStr = "";
        for(int i=0;i<str.length();i++){
            ch = str.charAt(i);
            newStr = ch + newStr;
        }
        System.out.println(newStr);
    }
}
