
package reproductor_musica;

import java.util.Arrays;
import javax.swing.ImageIcon;

/**
 *
 * @author gaat1
 */
public class Reproductor_Musica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
}
class Song{
    private int codigo;
    private String nombre;
    private double precio;
    private int sumaEstrellas;
    private int totalReviews;
    private ImageIcon ImagenDisco;
    
    public Song(int codigo,String nombre,double precio,ImageIcon ImagenDisco){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.ImagenDisco = ImagenDisco;
        sumaEstrellas = 0;
        totalReviews =0;
        
        }
    public int getCodigo(){
            return codigo;
       } 
    public String getNombre(){
            return nombre;
       } 
    public double getPrecio(){
            return precio;
       }
    public ImageIcon getImagenDisco(){
            return ImagenDisco;
       }
    void addStars(int stars){
            if(stars <= 5 && stars >= 0){
                sumaEstrellas += stars;
                totalReviews++;
            }
        }
     void songRating(int stars, int total){
        double rating = stars/total;
    }
}
class JTunes{
    
    private Song[] canciones;

   
    public JTunes(int tamano) {
        canciones = new Song[tamano];
    }

    public boolean addSong(int codigo, String nombre, double precio, ImageIcon imagenDisco) {
        for (Song c : canciones) {
            if (c != null && c.getCodigo() == codigo) {
                return false; 
            }
        }

        // Buscar un espacio vacío en el arreglo
        for (int i = 0; i < canciones.length; i++) {
            if (canciones[i] == null) {
                canciones[i] = new Song(codigo, nombre, precio, imagenDisco);
                return true; // agregado correctamente
            }
        }

        return false; // no hay espacio
    }
}
class MainJTunes{
    
}