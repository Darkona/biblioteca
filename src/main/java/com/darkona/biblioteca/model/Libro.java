package com.darkona.biblioteca.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.ResultCheckStyle;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity(name = "Libro")
@Table(name = "Libro")
@SQLDelete(sql = "UPDATE libro SET active = false WHERE id = ?", check = ResultCheckStyle.COUNT)
@Where(clause = "active = true")
public class Libro  {

    @Id
    @NonNull
    @Column(name = "id", updatable = false, nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo", length = 1024)
    @NotBlank(message = "NO PUEDE SER UN TITULO EN BLANCO PUTO")
    private String titulo;

    private String ISBN;

    private int edicion;

    private int year;

    @ManyToOne
    private Editorial editorial;

    @ManyToOne
    private Autor autor;

    @JsonIgnore
    @Column(name = "active", columnDefinition = "boolean default true")
    private boolean active = true;

    @ManyToOne
    private Genero genero;

    @Override
    public String toString(){
        return autor.getApellido() + ", " + autor.getNombre() +": " + titulo + ", " + edicion + " edicion (" + year + ")";
    }

}
