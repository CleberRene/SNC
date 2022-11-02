package Modelo;

public class Notificacao {

    private String nomecanal;
    private String mensagem;
    private String status;

    public String getNomecanal() {
        return nomecanal;
    }

    public void setNomecanal(String nomecanal) {
        this.nomecanal = nomecanal;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
