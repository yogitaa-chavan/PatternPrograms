class PyramidSide2
{
	public static void main(String[] args) 
	{
		int n=5,sp=n/2, st=1;

		for(int i=n;i>=1;i--){
			for(int j=0;j<sp;j++)
				System.out.print(" ");
			for(int j=0;j<st;j++)
				
					System.out.print("* ");
		
			System.out.println();
		
			if(i>n/2)
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
