package br.com.contmatic.empresa.telefone;

public enum TipoTelefone {
    
    CELULAR("Celular", 9),
    
    FIXO("Fixo", 8);
    
    private String descricao;
    
    private Integer tamanho;
    
    private TipoTelefone(String descricao, Integer tamanho) {
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
