package herencia;

public class Principal {
	private static PNumerico bits = new  PNumerico();
	private static PNumerico corto = new  PNumerico();
	private static PNumerico enetero = new  PNumerico();
	private static PNumerico largo = new  PNumerico();
	
	public static void main(String[] args) {
		bits.setNombre("Byte");
		bits.setLongitud("0-127");
		bits.setDescripcion("Es el entero mas pequeño");
		bits.setPrimitivo("si");
		bits.setBits((byte)10);
		System.out.println(bits.getNombre()+""+ bits.getLongitud());
		
		// TODO Auto-generated method stub

	}

}
