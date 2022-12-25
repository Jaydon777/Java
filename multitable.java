import java.util.*;
public class multitable
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n;
        n=in.nextInt();
        for(int i=1;i<11;i++)
        {
            System.out.println(n+"*"+i+"="+(n*i));
        }
    }
}