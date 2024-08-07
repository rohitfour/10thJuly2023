class DigitOfSum 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		int num = 251025, rem = 0,sum=0,temp ;
		temp = num;
		while (num > 0)
		{
			rem = num % 10;
			sum = sum + rem;
			num = num/10;
		}
	System.out.println("The Sum of Digits of "+temp+" is "+sum);
	}
}
