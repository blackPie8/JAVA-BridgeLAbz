public class cntWords {
    public static void main(String[] args) {
        String str  = "Java is a High level language";
        String [] new_arr = str.split(" ");
        int length = new_arr.length;

        System.out.println(length);
    }
}
