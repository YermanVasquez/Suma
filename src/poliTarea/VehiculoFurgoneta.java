package poliTarea;

public class VehiculoFurgoneta  extends Vehiculo{
     private int nCarga;
	
	public VehiculoTurismo(int nPuerta, String matricula, String marca, String modelo) {
		super (matricula, marca, modelo);
		this.nCarga = nCarga;
	}
    public int getnPuertas() {
    	return nCarga;
    }
    @Override
    public String mostrarDatos() {
    	return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo"+modelo+	
    	"\nCarga: " + nCarga;

    }
}

}
