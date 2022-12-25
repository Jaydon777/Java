import java.util.*;
class InvalidMarksException  extends Exception
{
    public InvalidMarksException(String s)
    {
        super(s);
    }
}
class cat
{
    String rn;
    String name;
    public int marks[]=new int[5];
    Scanner in;
    cat(Scanner i)
    {
        in=i;
        read();
    }
    private void read()
    {
        rn=in.next();
        name=in.next();
        for(int i=0;i<5;i++)
        {
            marks[i]=in.nextInt();
        }
    }
    public void check() throws InvalidMarksException{
        for(int i =0;i<5;i++){
            if(marks[i]<0 || marks[i] > 30){    
                throw new InvalidMarksException("Mark is not valid");
            }
        }
    }
    public void print()
    {
        System.out.println("Regno:"+rn);
        System.out.println("Name:"+name);
        boolean ch=true;
        for(int i = 0; i < 5; i++)
        {
            if (ch==false)
            {
                marks[i]=0;
            }
            System.out.println("Mark"+(i+1)+":" +marks[i]);
            if (marks[i]>30 || marks[i]<0)
            {
                ch=false;
            }
        }
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner i=new Scanner(System.in);
        cat c=new cat(i);
        try     
        {
            c.check();
        }
        catch(InvalidMarksException e)
        {
            System.out.println("InvalidMarksException: Invalid Marks - Marks must be within the range 0 to 30"); 
        }
        c.print();
    }
}
