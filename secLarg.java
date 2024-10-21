import java.util.*;
public class secLarg {
    public static void main(String[] args) {
        int arr[] = {1,5,8,3,4,9,12};
        int n = arr.length;

        Arrays.sort(arr);

        for(int i = n-2;i>=0;i--){
            if(arr[i]!=arr[n-1]){
                System.out.println(arr[i]);
                break;
            }
            else{
                System.out.println("No Second Largest");
            }
        }
    }
}
