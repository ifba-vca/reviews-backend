package com.frameworks.sistemaavaliacao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Questionarios")
public class Questionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "codPergunta")
    private Pergunta codPergunta;

    @ManyToOne
    @JoinColumn(name = "codSemestre")
    private Semestres codSemestre;

    // Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    // Getter e Setter para o atributo 'codPergunta'
    public Pergunta getCodPergunta() {
        return codPergunta;
    }

    public void setCodPergunta(Pergunta codPergunta) {
        this.codPergunta = codPergunta;
    }

    // Getter e Setter para o atributo 'codSemestre'
    public Semestres getCodSemestre() {
        return codSemestre;
    }

    public void setCodSemestre(Semestres codSemestre) {
        this.codSemestre = codSemestre;
    }
}
