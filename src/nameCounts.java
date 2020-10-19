import java.util.*;


public class nameCounts {
	public static void main(String[] args) {
		Scanner Names = new Scanner(System.in);
		HashMap<String, Integer> nameCount = new HashMap<String, Integer>();

		while (true) {
			System.out.print("Input name: ");
			String A = Names.nextLine();
			if (A.equals("")) {
				break;
			} else if (!nameCount.containsKey(A)) {
				nameCount.put(A, 1);
			} else {
				if (nameCount.containsKey(A)) {
					Integer c = new Integer(nameCount.get(A));
					c++;
					nameCount.remove(A);
					nameCount.put(A,c);
				}
			}
		}
		System.out.println();
		System.out.println("Names and Values: ");
		for (String x : nameCount.keySet()) {
			System.out.println(x + ", " + nameCount.get(x));
		}
	}
}
