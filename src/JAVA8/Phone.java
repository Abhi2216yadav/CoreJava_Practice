package JAVA8;

public interface Phone {
	default void turnOn() {
		System.out.println("Mobike is re starting");
		
	}
}
