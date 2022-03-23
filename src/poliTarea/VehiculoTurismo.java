package poliTarea;

public class VehiculoTurismo extends Vehiculo{
	private int nPuertas;
	
	public VehiculoTurismo(int nPuerta, String matricula, String marca, String modelo) {
		super (matricula, marca, modelo);
		this.nPuertas = nPuertas;
	}
    public int getnPuertas() {
    	return nPuertas;
    }
    @Override
    public String mostrarDatos() {
    	return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo"+modelo+	
    	"\nNumero de puertas: " +nPuertas;

    }
}
