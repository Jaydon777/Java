import java.util.*;
public class frequency{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        char str[] = s1.toCharArray();
        int freq = str.length;
        int count = 0;
        for(int i = 0; i<freq;i++){
            count = 0;
            for(int j = 0; j<freq;j++){
                if(i!=j && str[j]!='*'){
                    if(str[i] == str[j]){
                        str[j]='*';
                        count++;
                    }
            }
        }
        if(str[i]!='*' && str[i]!=' '){
            System.out.println(str[i]+": "+(count+1));
        }
    }

}
}