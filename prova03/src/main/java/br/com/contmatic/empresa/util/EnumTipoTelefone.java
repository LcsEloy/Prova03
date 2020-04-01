package br.com.contmatic.empresa.util;

public enum EnumTipoTelefone {
    
    CELULAR("Celular", 9),
    
    FIXO("Fixo", 8);
    
    private String descricao;
    
    private Integer tamanho;
    
    private EnumTipoTelefone(String descricao, Integer tamanho) {
        this.descricao = descricao;
        this.tamanho = tamanho;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getTamanho() {
        return tamanho;
    }

}
