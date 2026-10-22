import java.util.*;

public class Arrays{

    public static void pairs(int arr[]){
        for(int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                System.out.print(arr[i]+""+ arr[j]+" ");
            }
            System.out.println(" ");
        }
    }

    public static void reverse(int arr[]){
        int first=0;
        int last=arr.length-1;
        while (first<last){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;

            first++;
            last--;
        }
    }


    public static  void hello (int arr[], int key){

        for(int i=0; i<arr.length ;i++){
            if (arr[i]==key){
                System.out.println(i);
            }
        }

    }
    public static void main(String args[]){
        int arr[]={1,2,5,3,7,4};
        int key=3;

        hello(arr, key);

        pairs(arr);

        reverse(arr);

        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}