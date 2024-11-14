public class binSearch {
    public static void main(String[] args) {
        int arr[] = {2,5,8,12,16,23,35};
        int target  = 23;

        int result = binarySearch(arr,target);
        if(result == -1){
            System.out.println("Target not found");
        }
        else{
            System.out.println("Target found at index " + result);
        }
    }

    public static int binarySearch(int arr[], int target){
        int left = 0;
        int right = arr.length-1;

        while(left <= right){
            int mid = left+(right-left)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid] > target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return -1;
    }
}
