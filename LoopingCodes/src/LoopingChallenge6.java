import java.util.Scanner;
public class LoopingChallenge6
	{
		static int lowerBound = 0;
		static int upperBound = 0;
		static int sumOfNumbersInBounds = 0;
		public static void main(String[] args)
			{
				askForBounds();
				addNumbersInsideBounds();
			}
		public static void askForBounds()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Choose a lower bound.");
				lowerBound = userInput.nextInt();
				do
					{
						System.out.println("Please choose an upper bound that is greater than your lower bound.");
						upperBound = userInput.nextInt();
					}
				while (upperBound <= lowerBound);
			}
		public static void addNumbersInsideBounds()
			{
				for (int i = lowerBound; i <= upperBound; i++)
					{
						sumOfNumbersInBounds = sumOfNumbersInBounds + i;
					}
				System.out.println(sumOfNumbersInBounds);
			}
	}
