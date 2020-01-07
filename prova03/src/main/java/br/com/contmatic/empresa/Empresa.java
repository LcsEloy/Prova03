package br.com.contmatic.empresa;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Empresa {
    
    private String cnpj;
    
    private Endereco endereco;

    private String razaoSocial;
    
    private String nomeFantasia;
    
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
