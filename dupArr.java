public class dupArr {
    public static void main(String[] args) {
        int arr[] = {2,3,12,3,4,3,5,4,12};
        int count =0;

        for(int i =0;i<arr.length;i++){
         for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                System.out.println(arr[i]);
                break;
            }
         }
    }
}
}
