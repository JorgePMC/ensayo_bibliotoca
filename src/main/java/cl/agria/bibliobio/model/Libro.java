package cl.agria.bibliobio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //genera getters, toString, equals, hashCode y un constructor con los campos requeridos.
@AllArgsConstructor //genera un constructor con todo los campos
@NoArgsConstructor //Genera un constructor con todos los campos vacio

public class Libro {

    private int id, fechaPublicacion;
    private String isbn, titulo, editorial, autor;

}
