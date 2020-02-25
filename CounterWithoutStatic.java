package examples;

public class CounterWithoutStatic {
	int count = 0;// will get memory each time when the instance is created

	CounterWithoutStatic() {
		count += 2;// incrementing value
		System.out.println(count);
	}

	public static void main(String args[]) {
		// Creating objects
		CounterWithoutStatic c1 = new CounterWithoutStatic();
		System.out.println(c1.count);
		CounterWithoutStatic c2 = new CounterWithoutStatic();
		System.out.println(c2.count);
		CounterWithoutStatic c3 = new CounterWithoutStatic();
		System.out.println(c3.count);
	}
}
