import java.util.*;

public class Arrays{


    public static  void hello (int num[], int key){

        for(int i=0; i<num.length ;i++){
            if (num[i]==key){
                System.out.println(i);
            }
        }

    }
    public static void main(String args[]){
        int num[]={1,2,5,3,7,4};
        int key=3;

        
        hello(num,key);

    }
}