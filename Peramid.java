class Peramid 
{
	public static void main(String[] args) 
	{
		int sp=2;
		int st=1;
		int n=3;
		for(int i=1;i<=n;i++){
			for(int j=0;j<n-i;j++){
			System.out.print(" ");	
			}
			for(int k=0;k<st;k++){
				System.out.print("*");
			}
			sp--;
			st+=2;
			System.out.println();
		}
		
	}
}
