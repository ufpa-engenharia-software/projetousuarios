package br.ufpa.bdii.service.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * A DTO for the {@link br.ufpa.bdii.domain.Usuario} entity.
 */
public class UsuarioDTO implements Serializable {

    private Long id;

    private String nome;

    private String cpf;

    private LocalDate dataNascimento;

    private ZonedDateTime criacao;

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public ZonedDateTime getCriacao() {
        return criacao;
    }

    public void setCriacao(ZonedDateTime criacao) {
        this.criacao = criacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UsuarioDTO)) {
            return false;
        }

        UsuarioDTO usuarioDTO = (UsuarioDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, usuarioDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "UsuarioDTO{" +
            "id=" + getId() +
            ", nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", dataNascimento='" + getDataNascimento() + "'" +
            ", criacao='" + getCriacao() + "'" +
            "}";
    }
}
