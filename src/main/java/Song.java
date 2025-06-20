


import javax.swing.ImageIcon;

/**
 *
 * @author gaat1
 */

class Song{
    private final int codigo;
    private final String nombre;
    private final double precio;
    private int SumaEstrellas;
    private int TotalReviews;
    private final ImageIcon ImagenDisco;
    
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
    public double SongRating(){
        if (TotalReviews == 0) {
            return 0.0;
        }
        return (double) SumaEstrellas / TotalReviews;
    }
}