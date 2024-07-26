class AssignmentOper
{
	public static void main (String [] args)
	{
		int p=4,q=4;
		
		System.out.println("Value of p:"+p);
		System.out.println("Value of q:"+q);
		
		p=p+q;
		//p+=q;
		System.out.println("p=p+q :"+p);
		
		p=p-q;
		//p-=q;
		System.out.println("p=p-q :"+p);
		
		p=p*q;
		//p*=q;
		System.out.println("p=p*q :"+p);
		
		p=p/q;
		//p/=q;
		System.out.println("p=p/q :"+p);
		
		p=p%q;
		//p%=q;
		System.out.println("p=p%q :"+p);
	}
}