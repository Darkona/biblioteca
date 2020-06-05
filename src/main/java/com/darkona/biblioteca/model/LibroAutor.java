package com.darkona.biblioteca.model;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.WordUtils;

@Data
public class LibroAutor {

    private Long id;
    private String titulo;
    private Autor autor;

    public LibroAutor(Libro l){
        this.id = l.getId();
        this.titulo = WordUtils.capitalize(l.getTitulo());
        this.autor = l.getAutor();
    }

    @Override
    public String toString(){
        return String.format("%s - %s, %s : %s", StringUtils.leftPad(this.getId().toString(), 5, "0"), autor.getApellido(), autor.getNombre(), titulo);
    }
}

