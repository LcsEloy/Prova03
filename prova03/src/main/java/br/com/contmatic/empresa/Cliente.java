package br.com.contmatic.empresa;

import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.joda.time.DateTime;

import br.com.caelum.stella.bean.validation.CPF;

public class Cliente {

    @CPF
    @NotBlank
    private String cpf;
    
    @NotBlank
    private String nome;
    
    @Email
    private String email;
    
    private Endereco endereco;
    
    private Set<Telefone> telefone;
    
    private DateTime dataNascimento;
    
    public Cliente(String cpf, String nome, String email, Endereco endereco, Set<Telefone> telefone, DateTime dataNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Set<Telefone> getTelefone() {
        return telefone;
    }
    
    public void setTelefone(Set<Telefone> telefone) {
        this.telefone = telefone;
    }

    public DateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(DateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public boolean equals(Object that) {
        Cliente other = (Cliente) that;
        return new EqualsBuilder().append(cpf, other.cpf).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cpf).toHashCode();
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
