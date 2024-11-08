public class namePattern {
    public static void main(String[] args) {
        String word = "ASHRY";
        for(int i=0;i<5;i++){
            for(int j=0;j<word.length();j++){

                char ch = word.charAt(j);

                switch (ch) {
                    case 'A':
                        printA(i);
                        break;
                
                        case 'S':
                        printS(i);
                        break;

                        case 'H':
                        printH(i);
                        break;

                        // case 'R':
                        // printR(i);
                        // break;

                        // case 'Y':
                        // printY(i);
                        // break;

                    default:
                        break;
                }
                System.out.print("  ");

            }
            System.out.println();
        }
    }

    static void printA(int row){
        if(row == 0){
            System.out.print("  * ");
        }
        else if(row == 2){
            System.out.print("****");
        }
        else{
            System.out.print("*  *");
        }
    }

    static void printS(int row){
        if(row==0 || row==2 || row==4){
            System.out.print("****");
        }
        else if (row==1){
            System.out.print("*");
        }
        else{
            System.out.print("   *");
        }
    }

    static void printH(int row){
        if(row==)
    }

}
