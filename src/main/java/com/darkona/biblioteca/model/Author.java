package com.darkona.biblioteca.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.ResultCheckStyle;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table
@SQLDelete(sql = "UPDATE autor SET active = false WHERE id = ?", check = ResultCheckStyle.COUNT)
@Where(clause = "active = true")
@XmlRootElement
public class Author {

    @Id
    @NonNull
    @Column(name = "id", updatable = false, nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    private String name;
    @NotBlank
    private String lastName;

    @JsonIgnore
    @Column(name = "active", columnDefinition = "boolean default true")
    private boolean active = true;

    @Override
    public String toString(){
        return String.format("ID: %d, %s %s", id , name, lastName);
    }


}
