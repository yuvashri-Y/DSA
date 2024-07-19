import java.util.*;
class main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("give no of elements in the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Give elements of array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("array elements are sorted in ascending order");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        }
    }