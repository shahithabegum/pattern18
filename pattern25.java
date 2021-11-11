import java.util.*;
class pattern25
{
     public static void main(String arg[])
    {
        try{
            int n,i,j,k,v=0;
            Scanner t=new Scanner(System.in);
            System.out.println("Enter n");
            n=t.nextInt();
            for(i=1;i<=n;i++)
             {
                   for(j=i;j<n;j++)
                    {
                                System.out.print(j);
                    }
	    
                     System.out.println();
	  }
               }
       
       catch(Exception e)
	{
	   System.out.println(e);
	 }
       }
}
