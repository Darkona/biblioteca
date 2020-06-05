package com.darkona.biblioteca.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.ResultCheckStyle;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table
@SQLDelete(sql = "UPDATE genero SET active = false WHERE id = ?", check = ResultCheckStyle.COUNT)
@Where(clause = "active = true")

public class Genero {

    @Id
    @NonNull
    @Column(name = "id", updatable = false, nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    private String nombre;

    @JsonIgnore
    private boolean active = true;

    @Override
    public String toString(){
        return String.format("Id: %d , %s", id, nombre);
    }
}
