package poo.videojuego;
import java.util.Collection;

public interface Personaje{

	public Ataque lanza(String nomAtaq);

	public void recibeAtaque(Ataque atac);

	public void usa(Item item);

	public void guarda(Ataque ataque);

	public Collection<Ataque> getAtaques();

	public int getExperiencia();

	public int getEnergia();

	public String getNombre();

	public void guardaEnArchivo(String nomArch);

}