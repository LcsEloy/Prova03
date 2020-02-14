package br.com.contmatic.empresa.departamento;

import java.util.Set;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import br.com.contmatic.empresa.funcionario.Funcionario;

public class Departamento {
    
    private String setor;

    private Integer ramal;
    
    private Set<Funcionario> funcionarios;
    
    public Departamento(String setor, Integer ramal, Set<Funcionario> funcionarios) {
        this.setor = setor;
        this.ramal = ramal;
        this.funcionarios = funcionarios;
    }
    
    public Set<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Set<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Integer getRamal() {
        return ramal;
    }

    public void setRamal(Integer ramal) {
        this.ramal = ramal;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    @Override
    public boolean equals(Object that) {
        Departamento other = (Departamento) that;
        return new EqualsBuilder().append(ramal, other.ramal).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ramal).toHashCode();
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }

}
