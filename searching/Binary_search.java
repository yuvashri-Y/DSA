import java.util.Arrays;
import java.util.Scanner;
class Main{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements in the array:");
        int n=sc.nextInt();
        System.out.println("enter the element to be searched:");
        int key=sc.nextInt();
        int start=0;
        int end=n-1;
        boolean flag=true;
        int []array=new int[n];
        System.err.println("enter the array elements:");
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(array[mid]==key)
            {
                System.out.print("element found at index:"+mid);
                flag=false;
                break;
            }
            else if(key>array[mid])
                start=mid+1;
            else
                end=mid-1;
        }
        if(flag)
           System.err.println("element not found");
    }
}