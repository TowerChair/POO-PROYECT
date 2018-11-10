

public class Item1 implements Item{
	private String nombre;
	private int experienciaQueAporta;
	private int energiaQueAporta;

	public Item1(String nombre,int experience,int energy){
		this.nombre=nombre;
		this.experienciaQueAporta=experience;
		this.energiaQueAporta=energy;

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