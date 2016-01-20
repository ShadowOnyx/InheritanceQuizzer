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
		qA.add(new Questions(2,"T","T/F, object A cC = new C(5), will cC.newNum() equal 1?"));
		qA.add(new Questions(2,"T","T/F, If C had another subclass named D, could you declare an object as A aD = new D?"));
		qA.add(new Questions(2,"F","T/F, Could you declare an object as B aD = new A?"));
		qA.add(new Questions(2,"F","T/F, object A aA = new B(10), will aB.newNum() returns 10?"));
		qA.add(new Questions(2,"F","An abstract class MUST contain abstract methods"));
		qA.add(new Questions(2,"T","If a class contains abstract methods it MUST be declared abstract"));
		qA.add(new Questions(2,"F","An interface is never abstract"));
		qA.add(new Questions(2,"T","A class can have only one superclass, thus Java is a single-inheritence model"));
		qA.add(new Questions(2,"T","An overridden method has the same parameters as the original method"));
		qA.add(new Questions(2,"F","A subclass has access to the methods but not the fields of its superclass"));
		qA.add(new Questions(3,"Final","What is the keyword that would be used to create a non-extendable class?"));
		qA.add(new Questions(3,"Extends","What keyword shows a class inherits from another?"));
		qA.add(new Questions(3,"Protected","What access modifier is most commonly seen in inheritence? (No cheating :^ ) )"));
		qA.add(new Questions(3,"Overloaded","This type of method has the same name but different parameters (Overloaded/Overridden)"));
		qA.add(new Questions(3,"Overridden","This type of method has the same name and the same parameters (Overloaded/Overridden)"));
		qA.add(new Questions(3,"Overloaded","newNum() and newNum(int n) in C are an example of an ___ method"));
		qA.add(new Questions(3,"Overridden","newNum() and newNum() in A and B respectively are an example of an ___ method"));
		qA.add(new Questions(3,"Overloaded","substring is an example of an ___ method"));
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
			if(qA.get(i).getNumber()==3)
				{
				System.out.println(qA.get(i).getQuestion());	
				System.out.println("Enter the answer as a single word");
				userAnswer=userInput.nextLine();
				System.out.println();
				if(trueAnswer.toUpperCase().equals(userAnswer.toUpperCase()))
					{
					System.out.println("Correct!");	
					counter++;
					}
				else
					System.out.println("Incorrect, your answer was "+userAnswer.substring(0,1).toUpperCase()+", correct answer was "+trueAnswer);
			}
			}
		System.out.println();
		Scanner playAgainInput = new Scanner(System.in);
		System.out.println("You scored "+counter+" out of  "+qA.size()+" possible points");
		System.out.println("Play again? Y/N");
		String playAgain=playAgainInput.nextLine();
		if(playAgain.toUpperCase().equals("Y"))
			{
			doQuiz();
			}
		else
			{
			System.out.println("Thanks for playing");
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

	
	
	
	
	
	
	
	
	
	
	
	
	
}