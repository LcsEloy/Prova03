package br.com.contmatic.empresa;

import java.util.Set;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.hibernate.validator.constraints.br.CNPJ;
import org.joda.time.DateTime;

public class Empresa {
    
    @CNPJ
    @NotNull
    private String cnpj;
    
    private Endereco endereco;

    private String razaoSocial;
    
    private String nomeFantasia;

    private Set<Telefone> telefone;
    
    private DateTime dataDeAbertura;
    
    public Empresa(String cnpj, Endereco endereco, String razaoSocial, String nomeFantasia, Set<Telefone> telefone, DateTime dataDeAbertura) {
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.telefone = telefone;
        this.dataDeAbertura = dataDeAbertura;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public Set<Telefone> getTelefone() {
        return telefone;
    }

    public void setTelefone(Set<Telefone> telefone) {
        this.telefone = telefone;
    }

    public DateTime getDataDeAbertura() {
        return dataDeAbertura;
    }

    public void setDataDeAbertura(DateTime dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }

    @Override
    public boolean equals(Object that) {
        Empresa other = (Empresa) that;
        return new EqualsBuilder().append(cnpj, other.cnpj).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cnpj).toHashCode();
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
