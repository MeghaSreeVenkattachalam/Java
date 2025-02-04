Deletion in the same Array.

import java.util.Scanner;

class Deletion_In_Same_Array
{
    public static void main (String[] args) 
    {
        int[] array = new int[100]; // Initial array
        array[0] = 2;
        array[1] = 4;
        array[2] = 6;
        array[3] = 8;
        array[4] = 10;
        int size = 5; // Current size of the array
		
		
		System.out.println("The Array before deletion: ");
		for(int i=0;i<size;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();

        int positionToDelete = 2; // Index of the element to delete

        // Shift elements to fill the gap left by the deleted element
		
        for (int i = positionToDelete; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
		
		
		
		System.out.println("The Size of the array before deletion is "+size);
        size--; // Update the size of the array
		System.out.println("The Size of the array after deletion is "+size);
		
        // Print the updated array
		System.out.println("The array after deletion: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
