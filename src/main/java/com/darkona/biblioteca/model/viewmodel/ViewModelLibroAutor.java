package com.darkona.biblioteca.model.viewmodel;

import com.darkona.biblioteca.model.Author;
import com.darkona.biblioteca.model.Book;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.WordUtils;

@Data
public class ViewModelLibroAutor {

    private Long id;
    private String titulo;
    private Author author;

    public ViewModelLibroAutor(Book l){
        this.id = l.getId();
        this.titulo = WordUtils.capitalize(l.getTitle());
        this.author = l.getAuthor();
    }

    @Override
    public String toString(){
        return String.format("%s - %s, %s : %s", StringUtils.leftPad(this.getId().toString(), 5, "0"), author.getLastName(), author.getName(), titulo);
    }
}

