/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp
 */

import javax.swing.ImageIcon;

public class JTunes {
    private Song[] Canciones;
    
    public JTunes(int Tamano) {
        Canciones = new Song[Tamano];
    }
    
    /*
        Metodo para agregar una cancion
    */
    public boolean AddSong(int Codigo, String Nombre, double Precio, ImageIcon ImagenDisco) {
        //Validar que el codigo sea unico
        if (SearchSong(Codigo) != null) {
            return false; //El codigo ya existe
        }
        
        //Buscar un espacio libre en el arreglo
        for (int i = 0; i < Canciones.length; i++) {
            if (Canciones[i] == null) {
                Canciones[i] = new Song(Codigo, Nombre Precio, ImagenDisco);
                return true;
            }
        }
        
        return false; //No hay espacio libre
    }
    
    /*
        Metodo para buscar una cancion por codigo
    */
    public Song SearchSong(int Codigo) {
        for (Song Cancion : Canciones) {
            if (Cancion != null && Cancion.getCodigo() == Codigo) {
                return Cancion;
            }
        }
        return null;
    }
    
    /*
        Metodo para calificar una cancion
    */
    public void RateSong(int Codigo, int Stars) {
        Song Cancion = SearchSong(Codigo);
        if (Cancion != null) {
            Cancion.AddStars(Stars);
        }
    }
    
    /*
        Metodo para obtener todas las canciones existentes
    */
    public Song[] GetAllSongs() {
        //Contar canciones no nulas
        int Contador = 0;
        for (Song Cancion : Canciones) {
            if (Cancion != null) {
                Contador++;
            }
        }
        
        //Crear arreglo del tamano exacto
        Song[] CancionesExistentes = new Song[Contador];
        int Indice = 0;
        for (Song Cancion : Canciones) {
            if (Cancion != null) {
                CancionesExistentes[Indice] = Cancion;
                Indice++;
            }
        }
        return CancionesExistentes;
    }
}
