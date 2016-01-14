import java.util.*;
public class Questions
	{
	static int number;
	static String answer;
	static String question;
	static boolean trueFalse;
	ArrayList <Questions> qA = new ArrayList<Questions>();
	public Questions(int n, String a, String q, boolean t)
		{
		number=n;
		answer=a;
		question=q;
		trueFalse=false;
		}
	qA.add(new Questions(1," "," "));

	}