public class apattr {
    public static void main(String[] args) {
        int i,j,n;
        n = 8;

        for(i=0;i<=n;i++){
            for(j=0;j<=n/2;j++){
                if((j==0 || j==n/2)&& i!=0 || (i ==0 && j != n) || i==n/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
