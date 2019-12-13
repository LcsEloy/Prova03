package br.com.contmatic.empresa;

import org.joda.time.DateTime;

import br.com.caelum.stella.bean.validation.CPF;

import javax.validation.constraints.*;
import org.hibernate.validator.*;

public class Cliente {
    
    @NotBlank
    private String nome;
    
    private DateTime dataNascimento;
    
    @NotBlank
    @CPF
    private String cpf;
    
    private String email;
    
    private Telefone telefone;
    
    private Endereco endereco;
    

}
