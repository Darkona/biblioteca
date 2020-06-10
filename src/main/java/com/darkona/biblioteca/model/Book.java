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
@Entity(name = "Book")
@Table(name = "Book")
@SQLDelete(sql = "UPDATE book SET active = false WHERE id = ?", check = ResultCheckStyle.COUNT)
@Where(clause = "active = true")
public class Book {

    @Id
    @NonNull
    @Column(name = "id", updatable = false, nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", length = 1024)
    @NotBlank(message = "NO PUEDE SER UN TITULO EN BLANCO PUTO")
    private String title;

    private String ISBN;

    private int edition;

    private int year;

    @ManyToOne
    private Editorial editorial;

    @ManyToOne
    private Author author;

    @JsonIgnore
    @Column(name = "active", columnDefinition = "boolean default true")
    private boolean active = true;

    @ManyToOne
    private Genre genre;

    @Override
    public String toString(){
        return author.getLastName() + ", " + author.getName() +": " + title + ", " + edition + " edition (" + year + ")";
    }

}
