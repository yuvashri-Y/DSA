import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the number of elements in the array:");
            int n=sc.nextInt();
            System.out.println("enter the element to be searched:");
            int key=sc.nextInt();
            int []array = new int[n];
            boolean flag=true;
            System.out.println("enter the array elements:");
            for(int i=0;i<n;i++)
            {
                array[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                if(array[i]==key)
                {
                    System.out.println("key found at index :"+ i);
                    flag=false;
                    break;
                }
            }
            if(flag)
               System.out.println("key not found");
        }
    }
}
