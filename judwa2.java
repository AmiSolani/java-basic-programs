import java.util.Arrays;

class judwa2
{   
	static void removeDuplicates(int[] arrayWithDuplicates)
	{
		System.out.println("Array With Duplicates : ");
		
		for (int i = 0; i < arrayWithDuplicates.length; i++)
		{
			System.out.print(arrayWithDuplicates[i]+"\t");
		}
		
		//Assuming all elements in input array are unique
		
		int noOfUniqueElements = arrayWithDuplicates.length;
		
		//Comparing each element with all other elements
		
		for (int i = 0; i < noOfUniqueElements; i++) 
		{
			for (int j = i+1; j < noOfUniqueElements; j++)
			{
				//If any two elements are found equal
				
				if(arrayWithDuplicates[i] == arrayWithDuplicates[j])
				{
					//Replace duplicate element with last unique element
					
					arrayWithDuplicates[j] = arrayWithDuplicates[noOfUniqueElements-1];
					
					//Decrementing noOfUniqueElements
					
					noOfUniqueElements--;
					
					//Decrementing j
					
					j--;
				}
			}
		}
		
		//Copying only unique elements of arrayWithDuplicates into arrayWithoutDuplicates
		
		int[] arrayWithoutDuplicates = Arrays.copyOf(arrayWithDuplicates, noOfUniqueElements);
		
		//Printing arrayWithoutDuplicates
		
		System.out.println();
		
		System.out.println("Array Without Duplicates : ");
		Arrays.sort(arrayWithoutDuplicates);
		for (int i = 0; i < arrayWithoutDuplicates.length; i++)
		{
		
			System.out.print(arrayWithoutDuplicates[i]+"\t");
		}
		
		System.out.println();
		
		System.out.println("==============================");
	}
	
	public static void main(String[] args) 
	{		
		removeDuplicates(new int[] {4, 3, 2, 4, 9, 2,4});
		
	}	
}