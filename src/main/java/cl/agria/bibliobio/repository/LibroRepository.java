package cl.agria.bibliobio.repository;

import cl.agria.bibliobio.model.Libro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class LibroRepository {
    
    //Arreglo que guarda todos los libros
    private List<Libro> listaLibros= new ArrayList<>();
    //Metodo que retorna todo los libros
    public List<Libro> obtenerLibros(){
        return listaLibros;
    }
    //Buscar libro por su id
    public Libro buscarPorId(int id){
        for (Libro libro : listaLibros){
            if (libro.getId() == id){
                return libro;
            }
        }
        return null;
    }
    //Buscar libro por su isbn
    public Libro buscarPorIsbn(String isbn){
        for (Libro libro : listaLibros){
            if (libro.getIsbn().equals(isbn)){
                return libro;
            }
        }
        return null;
    }
    //Guardar libro
    public Libro guar(Libro lib){
        listaLibros.add(lib);
        return lib;
    }
    //Actualizar libro
    public Libro actu(Libro lib){
        int id= 0;
        int idPos= 0;

        for (int i= 0; i <listaLibros.size(); i++){
            if (listaLibros.get(i).getId() == lib.getId()){
                id = lib.getId();
                idPos= i;
            }
        }
        Libro libro1= new Libro();
        libro1.setId(id);
        libro1.setTitulo(lib.getTitulo());
        libro1.setAutor(lib.getAutor());
        libro1.setFechaPublicacion(lib.getFechaPublicacion());
        libro1.setEditorial(lib.getEditorial());
        libro1.setIsbn(lib.getIsbn());

        listaLibros.set(idPos, libro1);
        return libro1;
    }
    //Eliminar por id
    public void elim(int id){
        //#1
        Libro libro = buscarPorId(id);
        if (libro != null){
            listaLibros.remove(libro);
        }
        //#2
        /*int idPosi= 0;
        for (int i= 0; i< listaLibros.size(); i++){
            if (listaLibros.get(i).getId()== id){
                idPosi= i;
                break;
            }
        }
        if (idPosi> 0){
            listaLibros.remove(idPosi);
        }*/
        //#ALTERNO
        //listaLibros.removeIf(x -> x.getId()== id);
    }
}
