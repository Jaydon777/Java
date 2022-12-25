import java.util.*;
public class zerotobegx {
    public static void main(String args[]){
        int n,a=0;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = s.nextInt();
        if(arr[i]==0){
            a+=1;
        }
        }
        for(int i=0;i<a;i++)
        {
            System.out.print(0+" ");
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {   
                System.out.print(arr[i]+" ");
            }
        }
        
    }
}