package br.com.contmatic.empresa;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.joda.time.DateTime;

public class Funcionario {

    private String cpf;

    private String nome;

    private String cargo;

    private Double salario;
    
    private DateTime dataAdmissao;

    private DateTime dataNascimento;
    
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public DateTime getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(DateTime dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public DateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(DateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public boolean equals(Object that) {
        Funcionario other = (Funcionario) that;
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
