import java.util.*;
class pattern24	
{
     public static void main(String arg[])
    {
        try{
            int n,i,j,k,c=0;
            Scanner t=new Scanner(System.in);
            System.out.println("Enter n");
            n=t.nextInt();
            for(i=1;i<n;i++)
             {
                   for(j=1;j>i;j--)
                    {
                                System.out.print(" ");
                    }
	    for (k=1;k<=i;k++)
	     {
	         if(k>i)
	           {
	               c-=1;
	             }
	             else{
	              c+=1;
		}
	        System.out.print(c);
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
