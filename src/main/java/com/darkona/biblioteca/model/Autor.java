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
@SQLDelete(sql = "UPDATE autor SET active = false WHERE id = ?", check = ResultCheckStyle.COUNT)
@Where(clause = "active = true")
public class Autor {

    @Id
    @NonNull
    @Column(name = "id", updatable = false, nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String apellido;

    @JsonIgnore
    private boolean active = true;

    public String ToString(){
        return String.format("ID: %d, %s %s", id , nombre , apellido);
    }


}
