


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
    private int SumaEstrellas;
    private int TotalReviews;
    private ImageIcon ImagenDisco;
    
    public Song(int codigo,String nombre,double precio,ImageIcon ImagenDisco){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.ImagenDisco = ImagenDisco;
        SumaEstrellas = 0;
        TotalReviews =0;
        
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
    void AddStars(int stars){
            if(stars <= 5 && stars >= 0){
                SumaEstrellas += stars;
                TotalReviews++;
            }
        }
    public double SongRating(int stars, int total){
        if (TotalReviews == 0) {
            return 0.0;
        }
        return (double) SumaEstrellas / TotalReviews;
    }
}