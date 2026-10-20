public class linearsearch {
    
    public static int linear(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if (arr[i]==key){
                return i;
            }

        }
        return -1;
    }

        public static int largest(int arr[], int key){
            int largest=Integer.MIN_VALUE;
            for (int i=0; i<arr.length; i++){
                if (arr[i]>largest){
                    largest=arr[i];
                }
            }
            return largest;
        }

        public static int smallest(int arr[], int key){
            int smallest=Integer.MAX_VALUE;
            for (int i=0; i<arr.length; i++){
                if (arr[i]<smallest){
                    smallest=arr[i];
                }
            }
            return smallest;
        }


    public static void main(String args[]){
        int arr[]= {2,5,3,7,0,8};
        int key = 3;

      
       int result=largest(arr,key);
       System.out.println("The largest integer is "+ result);
       int results =smallest(arr,key);
       System.out.println("The smallest is "+ results);


    }
}