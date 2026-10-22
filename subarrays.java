public class subarrays {

    /*public static void subarray(int arr[]){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                sum=0;
                for(int k=i; k<=j; k++){
                    sum+=arr[k];
                }
                if(sum>max){
                    max=sum;}
            }
        }
        System.out.println(max);
    }*/

    /*ublic static void maxsum1(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];

        for(int i=0; i<prefix.length; i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                currsum= i==0? prefix[j]: prefix[j]- prefix[i-1];
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println(maxsum);
    }*/

    public static void maxsum2(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            currsum+=arr[i];
            if(currsum>maxsum){
                maxsum=currsum;
            }
            if (currsum<0){
                currsum=0;
            }
        }
        System.out.println(maxsum);
    }

    public static void main(String args[]){
        int arr[]={2,4,6,8,10};

        maxsum2(arr);
    }
    
}
