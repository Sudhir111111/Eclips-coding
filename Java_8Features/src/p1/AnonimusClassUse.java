package p1;

@FunctionalInterface
interface Lamda {
	void show();

	public String toString();

	public int hashCode();

	default void m1() {

	}

	static void m2() {

	}
}

//class B implements Lamda {
//
//	@Override
//	public void show() {
//System.out.println("show method");
//	}
//
//}

public class AnonimusClassUse {

	public static void main(String[] args) {

		Lamda b1 = new Lamda() {

			@Override
			public void show() {

			}
		};
		b1.show();
		System.out.println(b1);
		System.out.println(b1.hashCode());

	}

}
