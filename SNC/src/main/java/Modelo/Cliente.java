package Modelo;

public class Cliente {

    private String nomeCliente;
    private String numeroBanco;
    private String numeroAgencia;
    private String numeroConta;

    public String getNomecliente() {
        return nomeCliente;
    }

    public void setNomecliente(String nomecliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumerobanco() {
        return numeroBanco;
    }

    public void setNumerobanco(String numerobanco) {
        this.numeroBanco = numeroBanco;
    }

    public String getNumeroagencia() {
        return numeroAgencia;
    }

    public void setNumeroagencia(String numeroagencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNumeroconta() {
        return numeroConta;
    }

    public void setNumeroconta(String numeroconta) {
        this.numeroConta = numeroConta;
    }
}
