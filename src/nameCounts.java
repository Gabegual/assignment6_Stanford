import java.util.*;

/*
 * Created By: Robert Johns Jr.
 */
public class nameCounts {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<String, Integer> nameCount = new HashMap<String, Integer>();

		while (true) {
			System.out.print("Input name: ");
			String n = s.nextLine();
			if (n.equals("")) {
				break;
			} else if (!nameCount.containsKey(n)) {
				nameCount.put(n, 1);
			} else {
				if (nameCount.containsKey(n)) {
					Integer c = new Integer(nameCount.get(n));
					c++;
					nameCount.remove(n);
					nameCount.put(n,c);
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
