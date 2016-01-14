
public class C extends A
	{
	public C(int n)
		{
		super();
		num=super.newNum();
		}
	public int newNum()
		{	
		super.newNum();
		num=1;
		return num;
		}
	}
