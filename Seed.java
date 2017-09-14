import java.util.*;
public class Seed
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
      String st=s.nextLine();
        String[] str=st.split("");
        int n=Integer.parseInt(st);
        int temp=0;
        int []arr=new int[str.length];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=Integer.parseInt(str[i]);
        }
        for(int j=0;j<arr.length;j++)
        {
            temp=temp+(n*arr[j]);
        }
        System.out.print(temp);
}
}
