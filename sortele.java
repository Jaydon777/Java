import java.util.*;
public class sortele{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char temp = 0;
        char arr[] = str.toCharArray();
        
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }   
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        
    }
}