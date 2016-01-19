
public class C extends A
	{
	public C(int n)
		{
		num=super.newNum();
		}
	public C()
		{
		num=newNum(1)+1;	
		}
	public int newNum()
		{	
		super.newNum();
		num=1;
		return num;
		}
	public int newNum(int n)
		{	
		num=1;
		return num;
		}
	}
