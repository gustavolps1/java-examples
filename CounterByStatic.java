package examples;

public class CounterByStatic {
	static int count = 0;// will get memory each time when the instance is created

	CounterByStatic() {
		count += 2;// incrementing value
		System.out.println(count);
	}

	public static void main(String args[]) {
		// Creating objects
		CounterByStatic c1 = new CounterByStatic();
		System.out.println(CounterByStatic.count);
		CounterByStatic c2 = new CounterByStatic();
		System.out.println(CounterByStatic.count);
		CounterByStatic c3 = new CounterByStatic();
		System.out.println(CounterByStatic.count);
	}
}
