import java.util.*;
class Insertion{
    public static void main(String args[]){ 
        Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
        int n=in.nextInt();
		System.out.println("Enter the array elements: ");
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println("Enter the position: ");
		int pos=in.nextInt();
		int index = pos-1;
		System.out.println("Enter the element to be insert: ");
		int ele=in.nextInt();

		//creating new array
		int new_arr[] = new int[n+1];
		//inserting element before the index 
		for(int i=0;i<index;i++){
			new_arr[i] = arr[i];
		}
		//inserting element at index
		new_arr[index]=ele;
		//inserting element after the index
		for(int i=index;i<arr.length;i++){
			new_arr[pos]=arr[i];
			pos++;
		}
		System.out.println("The Array after insertion: ");
		for(int i=0;i<new_arr.length;i++){
		System.out.print(new_arr[i]+" ");
		}
	}
}

OUTPUT:

Enter the size of the array:
5
Enter the array elements:
1 2 3 5 6
Enter the position:
4
Enter the element to be insert:
4
The Array after insertion:
1 2 3 4 5 6
