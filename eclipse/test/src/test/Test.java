package test;

public class Test {

	public static void main(String[] args) {
		int j[] = new int[10];
		try {
			for (int i = 0; i <= 10; i++)
				j[i]=10;
			for(int k=0; k<=10; k++)
				System.out.println(k);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
