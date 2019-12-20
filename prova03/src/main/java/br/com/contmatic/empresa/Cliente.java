package br.com.contmatic.empresa;

import org.joda.time.DateTime;

import br.com.caelum.stella.bean.validation.CPF;

import javax.validation.constraints.*;
import org.hibernate.validator.*;

public class Cliente {

    @CPF
    @NotBlank
    private String cpf;
    
    @NotBlank
    private String nome;
    
    private String email;
    
    private Telefone telefone;
    
    private Endereco endereco;
    
    private DateTime dataNascimento;

}
