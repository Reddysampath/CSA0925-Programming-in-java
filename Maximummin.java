class Maximummin
{
   public static void main(String arg[])
    {
       int arr[]={12,13,22,32,3,45};
       int len=arr.length;
       for(int i=0;i<len;i++)
         {
           for(int j=i+1;j<len;j++)
            {
               if(arr[i]>arr[j])
                {
                   int temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                }
            }
         } 
 int m=1,n=3;
 int max=arr[len-m];
 int min=arr[n-1];
 System.out.println(m+"maximum number"+max);
 System.out.println("\n" +n+"minimum number="+min);
 int sum=max+min;
 int Diff=max-min;
 System.out.println("\n Sum="+sum);
 System.out.println("\n Difference="+Diff);
   }
}