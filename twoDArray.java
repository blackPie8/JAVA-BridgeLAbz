import java.util.*;
public class twoDArray {
    public static void main(String[] args) {
        int twoD_arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){
                twoD_arr[i][j] = sc.nextInt();
            }
        }

        // for(int i =0;i<3;i++){
        //     for(int j =0;j<3;j++){
        //         System.out.print(twoD_arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        int sum =0;
        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){
                sum += twoD_arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
