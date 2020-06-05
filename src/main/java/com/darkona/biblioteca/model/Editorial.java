package com.darkona.biblioteca.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.annotations.ResultCheckStyle;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Editorial")
@SQLDelete(sql = "UPDATE editorial SET active = false WHERE id = ?", check = ResultCheckStyle.COUNT)
@Where(clause ="active = true")
public class Editorial {

    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String nombre;

    @JsonIgnore
    private boolean active = true;

}
