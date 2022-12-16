package edu.cpp.exam_backend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name="employee")
public class employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    private String name;
    private String title;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "department_id", nullable = false)
    private department department;
}
