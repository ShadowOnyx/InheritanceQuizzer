import java.util.*;
public class Questions
	{
	static int number;
	static String answer;
	static String question;
	public static ArrayList <Questions> qA = new ArrayList<Questions>();
	public Questions(int n, String a, String q)
		{
		number=n;
		answer=a;
		question=q;
		}
	public static void makeQs()
		{
		qA.add(new Questions(1,"6","What will num equal when A aB = new B(3)?"));
		qA.add(new Questions(1,"5","What will num equal when A aA = new A()?"));
		qA.add(new Questions(1,"5","What will num equal when A aAA= new A(5)?"));
		qA.add(new Questions(1,"25","What will num equal when A aC = new C(2)?"));
		qA.add(new Questions(1,"2","What will num equal when B bB = new B(1)?"));
		qA.add(new Questions(1,"25","What will num equal when C cC = new C(5)?"));
		qA.add(new Questions(1,"1","What will newNum() return when A aC = new C(5)?"));
		qA.add(new Questions(2,"T","If A cC = new C(5), will cC.newNum() equal 1?"));
		qA.add(new Questions(2,"T","If C had another subclass named D, could you declare an object as A aD = new D?"));
		qA.add(new Questions(2,"F","Could you declare an object as B aD = new A?"));
		}
	public static void doQuiz()
	{
	int counter=0;
	Scanner userInput = new Scanner(System.in);	
	Collections.shuffle(qA);
	String userAnswer;
	for(int i=0;i<qA.size();i++)
		{
		String trueAnswer=qA.get(i).getAnswer();	
		qA.get(i);
		if(qA.get(i).getNumber()==1)	
			{
			System.out.println(qA.get(i).getQuestion());	
			System.out.println("Enter the answer as a number");
			userAnswer=userInput.nextLine();
			System.out.println();
			if(trueAnswer.equals(userAnswer))
				{
				System.out.println("Correct!");	
				counter++;
				}
			else
				System.out.println("Incorrect, your answer was "+userAnswer+", correct answer was "+trueAnswer);
			}
		if(qA.get(i).getNumber()==2)
			{
			System.out.println(qA.get(i).getQuestion());	
			System.out.println("Enter the answer as 'T/F'");
			userAnswer=userInput.nextLine();
			System.out.println();
			if(trueAnswer.equals(userAnswer.toUpperCase()))
				{
				System.out.println("Correct!");	
				counter++;
				}
			else
				System.out.println("Incorrect, your answer was "+userAnswer.toUpperCase()+", correct answer was "+trueAnswer);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	public static int getNumber()
		{
			return number;
		}
	public static void setNumber(int number)
		{
			Questions.number = number;
		}
	public static String getAnswer()
		{
			return answer;
		}
	public static void setAnswer(String answer)
		{
			Questions.answer = answer;
		}
	public static String getQuestion()
		{
			return question;
		}
	public static void setQuestion(String question)
		{
			Questions.question = question;
		}
	public static ArrayList<Questions> getqA()
		{
			return qA;
		}
	public static void setqA(ArrayList<Questions> qA)
		{
			Questions.qA = qA;
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
}