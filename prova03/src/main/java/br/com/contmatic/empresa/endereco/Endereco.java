package br.com.contmatic.empresa.endereco;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import br.com.contmatic.empresa.util.EnumTipoEndereco;

public class Endereco {
    
    private String uf;
    
    private String cidade;

    private String bairro;
    
    private EnumTipoEndereco tipo;
    
    private String logradouro;

    private String complemento;

    public Endereco(String uf, String cidade, String bairro, EnumTipoEndereco tipo, String logradouro, String complemento) {
        this.uf = uf;
        this.cidade = cidade;
        this.bairro = bairro;
        this.tipo = tipo;
        this.logradouro = logradouro;
        this.complemento = complemento;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public EnumTipoEndereco getTipo() {
        return tipo;
    }

    public void setTipo(EnumTipoEndereco tipo) {
        this.tipo = tipo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
    
}
