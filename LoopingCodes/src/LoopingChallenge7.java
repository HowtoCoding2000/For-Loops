import java.util.Scanner;

public class LoopingChallenge7
	{
		static int lowerBound = 0;
		static int upperBound = 0;
		static int sumOfNumbersInBounds = 0;
		public static void main(String[] args)
			{
				askForBounds();
				addNumbersDivisibleByThreeInsideBounds();
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
		public static void addNumbersDivisibleByThreeInsideBounds()
			{
				for (int i = lowerBound; i <= upperBound;)
					{
						if (i % 3 == 0)
							{
								sumOfNumbersInBounds = sumOfNumbersInBounds + i;
								i = i++;
							}
					}
				System.out.println(sumOfNumbersInBounds);
			}
	}
