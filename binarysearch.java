public class binarysearch {
    
    public static int binary(int arr[], int key){
        int first=0;
        int last=arr.length-1;
        while(first<=last){
            int mid = (last+first)/2;
            if(arr[mid]<key){
                first=mid+1;
            }
            else if(arr[mid]>key){
                last=mid-1;
            }
            else{
                return mid;
            }
        }
            return -1;
    }

    public static void main(String args[]){
        int arr[]={2,3,4,5,6,7,8};
        int key=6;
        int result = binary(arr,key);
        System.out.println("index "+ result);
    }
    
}
