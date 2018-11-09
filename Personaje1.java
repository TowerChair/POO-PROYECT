import java.util.Enumeration;


public class Personaje1 implements Personaje{
	private String nombre;
	private int exp;
	private int energia;
	private Collection<Ataque> ataques;
	Iterator it=ataques.iterator();

	public Ataque lanza(String nomAtaq){
		if(ataques==NULL){
			System.out.println("No tienes ataque guardados");
			break;
		}
		else{
			while(it.hasNext){
				Ataque element=it.next();
				if (element.equals(nomAtaq)){
					//Falta borrar el ataque que se lanza de la collection "ataques"
					return element;

				}	
			}

		}

	}

	public void recibeAtaque(Ataque atac){
		this.energia=this.energia-atac.getDanoQueCausa();
	}

	public void usa(Item item){
		this.energia=this.energia+atac.getEnergiaQueAporta();
		this.exp=this.exp+atac.getExperienciaQueAporta();
	}

	public void guarda(Ataque ataque){
		ataques.add(ataque);
	}



	public Collection<Ataque> getAtaques(){
		return this.ataques;
	}

	public int getExperiencia(){
		return this.exp;
	}

	public int getEnergia(){
		return this.energia;
	}

	public String getNombre(){
		return this.nombre;
	}

	public guardaEnArchivo(String nomArch){
		// Este metodo falta por completo ......................

	}

	

}