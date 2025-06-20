
package reproductor_musica;

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
    int conteo = 0;
    public boolean addSong(int codigo, String nombre, double precio, ImageIcon imagenDisco){
        for(int i = 0; conteo <= i;i++)
    }
}