package poo.videojuego;
import java.util.*;
import poo.videojuego.Ataque1;
import java.io.*;
import poo.videojuego.Item1;


public class Personaje1 implements Personaje{
	private String nombre;
	private int exp;
	private int energia;
	private Collection<Ataque1> ataques;
	

	public Ataque1 lanza(String nomAtaq){
		Iterator<Ataque1> it=ataques.iterator();
		Ataque1 element=null;
		if(ataques==null){
			System.out.println("No tienes ataque guardados");
			element=null;
		}
		else{
			int i=-1;
			while(it.hasNext()){
				element=it.next();
				i=i+1;
				if (element.equals(nomAtaq)){
					ataques.remove(i);
					
				
				}	
			}

		}
		return element;
	}

	public void recibeAtaque(Ataque1 atac){
		this.energia=this.energia-atac.getDanoQueCausa();
	}

	public void usa(Item item){
		this.energia=this.energia+item.getEnergiaQueAporta();
		this.exp=this.exp+item.getExperienciaQueAporta();
	}

	public void guarda(Ataque1 ataque){
		ataques.add(ataque);
	}



	public Collection<Ataque1> getAtaques(){
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

	public void guardaEnArchivo(String nomArch){
		// Este metodo falta por completo ......................
		File f;
		f = new File("personajes.txt");
		try{
		FileWriter w = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(w);
		PrintWriter wr = new PrintWriter(bw);   
		wr.append(getNombre()+"|"+getEnergia()+"|"+getExperiencia()); 
		wr.close();
		bw.close();
		}catch(IOException e){};

	}

	

}