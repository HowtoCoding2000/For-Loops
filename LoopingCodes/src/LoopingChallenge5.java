
public class LoopingChallenge5
	{
		public static void main(String[] args)
			{
				int sumOfMultiplesOfFive = 0;
				for (int i = 5; i <= 100; i = i + 5)
					{
						sumOfMultiplesOfFive = sumOfMultiplesOfFive + i;
					}
				System.out.println(sumOfMultiplesOfFive);
			}
	}
