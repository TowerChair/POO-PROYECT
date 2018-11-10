public class Ataque1 implements Ataque{
	private	int experienciaQueAporta;
	private	int danoQueCausa;
	private	int experienciaNecesaria;
	private	String nombreAtaq;

    
    public Ataque1(String nombre,int experienciaA,int dano,int experienceN){
    	this.nombreAtaq=nombre;
    	this.experienciaQueAporta=experienciaA;
    	this.danoQueCausa=dano;
    	this.experienciaNecesaria=experienceN;
    }

	public int getExperienciaQueAporta(){
		return this.experienciaQueAporta;
	}

	public int getDanoQueCausa(){
		return this.danoQueCausa;
	}

	public int getExperienciaNecesaria(){
		return this.experienciaNecesaria;
	}

	public String getNombre(){
		return this.nombreAtaq;
	}
}