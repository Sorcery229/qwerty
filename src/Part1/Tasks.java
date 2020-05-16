package Part1;

public class Tasks {

    public static int remainder(int firstNum, int secondNum)
    {
        return firstNum % secondNum;
    }

    public static double triArea(double base, double height)
    {
        return base * height / 2;
    }

    public static int animals(int chickensCount, int cowsCount, int pigsCount)
    {
        return chickensCount * 2 + cowsCount * 4 + pigsCount * 4;
    }

    public static boolean profitableGamble(double prob, double prize, double bet)
    {
        return prob * prize > bet;
    }

    public static String operation(int result, int num1, int num2)
    {
        if (num1 + num2 == result) return "added";
        if (num1 - num2 == result) return "substracted";
        if (num1 * num2 == result) return "multiplied";
        if (num1 / num2 == result && num1 / num2 == (double)num1 / num2) return "divided";
        return "none";
    }

    public static int ctoa(char character)
    {
        return character;
    }

    public static int addUpTo(int number)
    {
        int result = 0;
        for (int i = 1; i <= number; i++)
        {
            result += i;
        }
        return result;
    }

    public static int nextEdge(int firstSide, int secondSide)
    {
        return firstSide + secondSide - 1;
    }

    public static int sumOfCubes(int[] array)
    {
        int result = 0;

        for (int number : array)
        {
            result += number * number * number;
        }
        return result;
    }

    public static boolean abcmath(int a, int b, int c)
    {
        for (int i = 0; i < b; i++)
        {
            a += a;
        }

        return a % c == 0;
    }
}
