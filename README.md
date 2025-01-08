# ARRAY:
<p>     An array is the collection of items of same data type which stored in a contiguous memory location. The index of the array starts from '0'.Array is mutable and the elements of the array can be accessed by its index.Array is a linear data structure.</p>
<img src="https://static.javatpoint.com/ds/images/ds-array2.png"></img>
<h3>Declaration:</h3>
<p> The size of the array must be defined during its declaration in most programming languages</p>
<p><b>type[] arrayName; or type arrayName[];</b>      here the type can be int,float,char or string</p>
  <ul><li>c: int arr[5];</li>
    <li>java: int[] arr;</li>
    <li>python: arr=[]</li></ul>
<h3>Initialization:</h3>
<p>Assigning values to an array after its declaration.</p>
<ul><li>C: int arr[5] = {1, 2, 3, 4, 5};</li>
<li>Java: int[] arr = {1, 2, 3, 4, 5};</li>
<li>Python: arr = [1, 2, 3, 4, 5] </li></ul>
<h3>Creating dynamically during runtime:</h3>
<ul><li>C: int arr[100];</li>
  <li>Java: int[] arr = new int[5];</li></ul>
<h3>Getting input from user:</h3>
<ul><li>c: 
<pre><code>
#include <stdio.h>
int main() {
    int n;
    scanf("%d", &n); 
    int arr[100]; 
    // Input elements into the array
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    return 0;
   }
    </code></pre>
</li>
<li>Java:<pre>
<code>
import java.util.Scanner;
public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}</code></pre>
</li></ul>
