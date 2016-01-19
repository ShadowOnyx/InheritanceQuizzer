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
		qA.add(new Questions(1,"What will num equal when A aB = new B(3)"," "));
		qA.add(new Questions(1,"What will num equal when A aA = new A();"," "));
		qA.add(new Questions(1,"What will num equal when A aAA= new A(5);"," "));
		qA.add(new Questions(1,"What will num equal when A aC = new C(2);"," "));
		qA.add(new Questions(1,"What will num equal when B bB = new B(1);"," "));
		qA.add(new Questions(1,"What will num equal when C cC = new C(5);"," "));
		}
	public static void doQuiz()
	{
	int counter=0;
	Scanner userInput = new Scanner(System.in);	
	int random=(int)Math.random()*qA.size();
	String userAnswer;
	for(Object i:qA)
		{
		String trueAnswer=qA.get(random).getAnswer();	
		qA.get(random);
		if(qA.get(random).getNumber()==1)	
			{
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
		if(qA.get(random).getNumber()==2)
			{
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