import java.util.Scanner;


public class ListOfNames 
{
	public static void main(String[] args) 
	{
		String arr[]={"Dave", "Ann", "George", "Sam", "Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan", "Dev", "Kity", "Meery", "Smith", "Johnson", "Bill", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson"};
	
		String name;
		
		System.out.println("Enter Name");
		Scanner s=new Scanner(System.in);
		name=s.nextLine();
		
		for(int i=0;i<arr.length;i++){
			if(name.equals(arr[i])){
				System.out.println(i);
			}
		}
		s.close();
		
	}

	public int countOfOccurrence(String[] names, String name) 
	{
		for(int i=0;i<names.length;i++)
		{
			if(name.equals(names[i]))
			{
				return i;
			}
		}
		return 0;
	}
}
