

public class Item1 implements Item{
	private String nombre;
	private int experienciaQueAporta;
	private int energiaQueAporta;

	public Item1(String nombre){//Terminar el constructor
		this.nombre=nombre;

	}

	public String getNombre(){
		return this.nombre();
	}

	public int getEnergiaQueAporta(){
		return this.experienciaQueAporta;
	}

	public int getExperienciaQueAporta(){
		return this.energiaQueAporta;
	}
}