package com.dashboard.board.model;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table("APP_USER")
@Data

public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name="NAME", nullable=false)
    private String name;

    @Column(name="AGE", nullable=false)
    private Integer age;

    @Column(name="SALARY", nullable=false)
    private double salary;


}
