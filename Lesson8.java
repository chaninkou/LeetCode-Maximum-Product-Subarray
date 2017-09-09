package lesson8;

public class Lesson8 {
	public static void main(String[] args)
	{	
		int[] arraylist = {5, 4, 3, 2, 1, 1, 2, 3};
		findPairs(arraylist, 7);
		showList(arraylist);
	}
	
	// Showing the list
	public static void showList(int[] arraylist)
	{	
		for(int i = 0; i < arraylist.length; i++){
			System.out.print(arraylist[i] + " ");
		}
	}
	
	// finding the pairs that could add up to that number from main
	public static void findPairs(int[] arraylist, int expectedAnswer)
	{	
		for(int i = 0; i < arraylist.length; i++)
		{	
			for(int j = i + 1; j < arraylist.length; j++)
			{	
				if(arraylist[i] + arraylist[j] == expectedAnswer)
				{	
					System.out.println("The two elements at index " + i + " and " + j
						+ " are " + arraylist[i] + " and " + arraylist[j] + " is add up to " + expectedAnswer);
				}
			}
		}
	}
}
