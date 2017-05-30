
public class Sorting {

	public static void main( String[] args ){
	
		int[] arr = { 45, 87, 39, 32, 93, 86, 12, 44, 75, 50 };

		// Display the original (unsorted values)
		
		System.out.print("before: ");
		for ( int i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();

		// Swap the values around to put them ascending order.
		
		for ( int i=0;i<arr.length ; i++)
		{
			for ( int j=0;j<arr.length-1 ; j++ )
			{
				if (arr[j+1] < arr[j])
				{
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j]= temp;
					
				}
			}
		}
		

		// Display the values again, now (hopefully) sorted.
		System.out.print("after : ");
		for ( int i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();
	}

}
