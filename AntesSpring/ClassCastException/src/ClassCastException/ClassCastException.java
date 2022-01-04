package ClassCastException;

public class ClassCastException {

	public static void main(String[] args) {
		Vehiculo v = new Vehiculo();
		System.out.println("Producimos el java.lang.ClassCastException, ya que no puede ser Casteado a su mismo tipo: ");
		Coche c = (Coche) v;
	}

}
