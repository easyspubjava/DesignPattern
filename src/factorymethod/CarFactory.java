package factorymethod;

public class CarFactory {

	
	enum carType {SONATA, GRANDEUR, GENESIS, TOUSAN, SANTAFE};
	
	public static void main(String[] args) {
		System.out.println(carType.GENESIS);
	}
}
