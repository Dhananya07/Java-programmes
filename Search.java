public class Search {

   /*  public static int linear(int arr[], int key){
        for (int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }*/

    public static int largest(int arr[]){
        int large= Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(large<arr[i]){
                large=arr[i];
            }
        } 
        return large;
    }


    public static void main (){

        int arr[]= {2,4,5,7,8,3,10};
        int key=8;

       /*  int index= linear(arr,key);
        if(index==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("the key is at index : " + index);
        }*/
       System.out.println(largest(arr));

     }
    
}
