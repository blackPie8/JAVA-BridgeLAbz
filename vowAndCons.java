public class vowAndCons {
    public static void main(String[] args) {
        String str = "Ashray";

       int vowCnt = 0, consCnt = 0;
       char ch;
       String ref = "aeiouAEIOU";
        for(int i = 0;i < str.length();i++){
            ch = str.charAt(i);
            if((ch >= 'A' && ch <= 'Z') || (ch >='a' && ch <= 'z')){
                if(ref.indexOf(ch)!=-1){
                    vowCnt++;
                }
                else{
                    consCnt++;
                }
            }
        }
        System.out.println("Vowels - " + vowCnt + " Consonants - " + consCnt);
    }
}
