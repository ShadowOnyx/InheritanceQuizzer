
public class B extends A
	{
	public B(int n)
		{
		num=n*2;
		}
	public int newNum()
		{
		super.newNum();
		return num;
		}
	}
