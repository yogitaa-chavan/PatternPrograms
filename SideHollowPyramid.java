class SideHollowPyramid 
{
	public static void main(String[] args) 
	{
		int sp=3, st=1,n=5;

		for(int i=0;i<n;i++){
			for(int j=0;j<st;j++)
				if(i==j || j==0 || i+j==n-1)
					System.out.print("* ");
			    else
					System.out.print(" ");
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
