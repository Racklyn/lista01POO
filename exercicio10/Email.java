package exercicio10;

import java.util.Date;

public class Email {
    private String mensagem;
    private String origem;
    private String destino;
    private String titulo;
    private Date dataEnvio;

    

    public Email(String origem, String destino, String titulo, String mensagem) {
        this.origem = origem;
        this.destino = destino;
        this.titulo = titulo;
        this.mensagem = mensagem;
        this.dataEnvio = new Date();
    }
    public String getMensagem() {
        return mensagem;
    }
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    public String getOrigem() {
        return origem;
    }
    public void setOrigem(String origem) {
        this.origem = origem;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Date getDataEnvio() {
        return dataEnvio;
    }
    public void setDataEnvio(Date dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    
}
