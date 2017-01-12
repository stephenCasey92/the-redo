public class uniqueNumberB {
	public int uniqueSum(int x, int y, int z) {

		int sum = x + y + z;

		if (x == y) {

			System.out.println(+z);
			return z;

		}

		else if (z == x) {

			System.out.println(+y);
			return y;

		}

		else if (y == z) {

			System.out.println(+x);
			return x;

		}

		else if (x != y && y != z && z != x) {

			System.out.println(+sum);
			return sum;

		} else if (x == y && y == z && z == x) {

			System.out.println("All number are the same");
			return 0;

		}
		return 0;

	}

	public static void main(String[] args) 
	{
		uniqueNumberB myClass = new uniqueNumberB();
		int answer = myClass.uniqueSum(3, 4, 5);
		System.out.println(answer);

	}

}
