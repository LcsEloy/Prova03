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
import br.com.contmatic.empresa.endereco.Endereco;
import br.com.contmatic.empresa.telefone.Telefone;

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
        this.cpf = setCpf(cpf);
        this.nome = setNome(nome);
        this.email = setEmail(email);
        this.endereco = setEndereco(endereco);
        this.telefone = setTelefone(telefone);
        this.dataNascimento = setDataNascimento(dataNascimento);
    }

    public String getCpf() {
        return cpf;
    }

    public @NotBlank String setCpf(String cpf) {
        return this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public @NotBlank String setNome(String nome) {
        return this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public @Email String setEmail(String email) {
        return this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Endereco setEndereco(Endereco endereco) {
        return this.endereco = endereco;
    }

    public Set<Telefone> getTelefone() {
        return telefone;
    }
    
    public Set<Telefone> setTelefone(Set<Telefone> telefone) {
        return this.telefone = telefone;
    }

    public DateTime getDataNascimento() {
        return dataNascimento;
    }

    public DateTime setDataNascimento(DateTime dataNascimento) {
        return this.dataNascimento = dataNascimento;
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
