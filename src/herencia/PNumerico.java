package herencia;

public class PNumerico extends Primitivos  {
	private byte bits;
	private short corto; 
	private int  enetero;
	private int largo;

	public byte getBits() {
		return bits;
	}

	public void setBits(byte bits) {
		this.bits = bits;
	}

	public short getCorto() {
		return corto;
	}

	public void setCorto(short corto) {
		this.corto = corto;
	}

	public int getEnetero() {
		return enetero;
	}

	public void setEnetero(int enetero) {
		this.enetero = enetero;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public PNumerico() {
		//setNombre("byte");
		//System.out.println("El nombre es:" + getNombre());
		// TODO Auto-generated constructor stub
	}
	
}
