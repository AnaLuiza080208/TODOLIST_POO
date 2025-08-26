package br.edu.ifpr.todo.demo.model;
import java.time.LocalDateTime;

import jakarta.persistence.*;                                                                                                                                                                                                                                           
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Tarefas")// só se a tabela tiver um nome diferente do nome da classe
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 120)
    private String nome;

    private String descricao;
    @Enumerated(EnumType.STRING)
    
    private Status status;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataPrazo;

    public Tarefa(Long id, String nome, String descricao, Status status, LocalDateTime dataCriacao,
            LocalDateTime dataPrazo) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
        this.dataCriacao = dataCriacao;
        this.dataPrazo = dataPrazo;
    }

    public Tarefa() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDateTime getDataPrazo() {
        return dataPrazo;
    }

    public void setDataPrazo(LocalDateTime dataPrazo) {
        this.dataPrazo = dataPrazo;
    }

}
