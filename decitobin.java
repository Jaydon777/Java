import java.util.Scanner;
public class decitobin
{    
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n;
        n=in.nextInt();
        int arr[]=new int[n];
        int pos=0;    
        while(n>0)
        {    
           arr[pos++]=n%2;   
           n=n/2;    
        }    
        for(int i=pos-1;i>=0;i--)
        {    
           System.out.print(arr[i]);    
        }   
    }
}