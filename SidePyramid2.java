class SidePyramid2
{
	public static void main(String[] args) 
	{
		int n=7, sp=n/2, st=1;

		for(int i=0;i<n;i++){
			for(int j=0;j<sp;j++)
				System.out.print("  ");
			for(int j=0;j<st;j++)
				System.out.print("* ");
		
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
