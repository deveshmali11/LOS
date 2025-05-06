package arrayyy;

public class S {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [][]a= {{10,20},{30,40},{50,60},{70,80}};
		
		
		for (int[] row: a)
		{
			for(int columnValue: row)
			{
				System.out.println(columnValue);
			}
		}
	}

}
