
public class B extends A
	{
	public B(int n)
		{
		num=n*2;
		}
	public B()
		{
		num+=num;
		}
	public int newNum()
		{
		super.newNum();
		return num;
		}
	}

