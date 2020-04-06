import java.util.Scanner;
public class RemoveString
{
    
        Scanner s1= new Scanner(System.in);
       String m= s1.nextLine();
       int i=0,j=1;
       for(int k=0;k< m.length();k++)
       {
           if(m.charAt(i)=='a' || m.charAt(i)=='A')
           {
           m.setCharAt(i,'\0');
           System.out.println(m);
           }
           else if(m.charAt(j)=='a' || m.charAt(j)=='A')
           {
           m.setCharAt(j,'\0');
           System.out.println(m);
           }
           else
           {
           System.out.println(m);
           }
       }
       
    }
class Main
{
public static void main(String[] args)
 {
RemoveString rm=new RemoveString();
}
}

