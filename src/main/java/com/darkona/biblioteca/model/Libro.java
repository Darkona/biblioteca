package com.darkona.biblioteca.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@NoArgsConstructor
@Entity(name = "Libro")
@Table(name = "Libro")
public class Libro  {

    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo", length = 1024)
    private String titulo;
    private String ISBN;
    private String genero;
    private int edicion;
    private int year;

    @ManyToOne
    private Editorial editorial;

    @ManyToOne
    private Autor autor;


    public Libro(Long id){
        setId(id);
    }

    @Override
    public String toString(){
        return autor.getApellido() + ", " + autor.getNombre() +": " + titulo + ", " + edicion + " edicion (" + year + ")";
    }


}
