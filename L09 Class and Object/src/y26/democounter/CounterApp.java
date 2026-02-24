package y26.democounter;

public class CounterApp {
	void main() {
		Counter c1 = new Counter("Dark blue");
		Counter c2 = new Counter("Red", 10);
		IO.println("Test c1: " + c1);
		IO.println("Test c2: " + c2);
		IO.println();

		c1.click();
		c1.click();
		c2.click();
		IO.println();

		IO.println("Test c1: " + c1);
		IO.println("Test c2: " + c2);
		IO.println();

		c1.reset();
		IO.println();

		IO.println("Test c1: " + c1);
		IO.println();

		IO.println("Color of c1 is " + c1.getColor());
		IO.println("Count of c1 is " + c1.getCount());
		IO.println("Color of c2 is " + c2.getColor());
		IO.println("Count of c2 is " + c2.getCount());
		IO.println();

		c1.setCount(200);
		IO.println("Count of c1 is " + c1.getCount());
	}
}
