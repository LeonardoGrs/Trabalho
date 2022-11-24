package Banco;

public class Cadastro {
    private int numero;
    private int tipo;
    private double saldo;
    private int agencia;
    private long cpfTitular;
    private String senha;

    public Cadastro(){
        numero = 0;
        tipo = 1;
        saldo = 0.0;
        agencia = 0001;
        cpfTitular = 00000000000;
        senha = "master";
    }
    
    public Cadastro(int numero, int tipo, double saldo, int agencia, long cpfTitular, String senha) {
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = saldo;
        this.agencia = agencia;
        this.cpfTitular = cpfTitular;
        this.senha = senha;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public long getCpfTitular() {
        return cpfTitular;
    }
    public void setCpfTitular(long cpfTitular) {
        this.cpfTitular = cpfTitular;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

}
