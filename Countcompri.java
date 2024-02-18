class Countcompri
 {
    public static void main(String arg[])
      {
        int arr[] = {2, 3, 4, 3, 2, 33, 222};
        int com = 0, pri = 0;

        for (int i = 0; i < arr.length; i++) 
         {
            int count = 0;
            for (int j = 2; j <= arr[i]; j++)
            {
                if (arr[i] % j == 0)
                    count++;
            }

            if (count > 1)
            {
                com++;
            } 
            else
            {
                pri++;
            }
        }

        System.out.println("Composite number:" + com);
        System.out.println("Prime number:" + pri);
    }
}
