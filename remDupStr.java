public class remDupStr {
    public static void main(String[] args) {
        String str = "Ashray Stan";
        char ch1; char ch2;
        String newStr = "";
        for(int i=0;i<str.length();i++){
            ch1 = str.charAt(i);
            for(int j=1;j<str.length();j++){
                ch2 = str.charAt(j);
                if(ch1 != ch2){
                    newStr += ch1;
                }
                // else{
                    
                // }
            }
        }
        System.out.println(newStr);
    }
}
