class SidePyramid 
{
	public static void main(String[] args) 
	{
		int sp=3, st=1,n=7;

		for(int i=0;i<n;i++){
			for(int j=0;j<st;j++)
				System.out.print("* ");
			for(int j=0;j<sp;j++)
				System.out.print(" ");
		
			System.out.println();
		
			if(i<n/2)
			{
				sp--;
				st++;
			}
			else{
				sp++;
				st--;
			}
			}

	}
}
