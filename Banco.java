package Banco;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Banco {
    private String nome;
    private ArrayList<Cadastro> registro;

    public Banco(){
        nome = "Sem nome";
        registro = new ArrayList<Cadastro>();
        acoes();
    }
    public void acoes(){
        while(true){
            System.out.println("0- Encerrar Programa\n1- Criar nova conta\n2- Fazer login");
            int x = scInt();
            if(x==0) break;
            switch(x){
                case(1):
                    criarConta();
                    break;
                case(2):
                    verificacao();
                    break;
            }
        }
    }

    public void criarConta(){
        System.out.println("Digite cpf do titular");
        long cpf = scLong();

        System.out.println("Digite sua senha");
        String senha = scString();

        System.out.println("Digite o numero indicado para:\n1) Conta Corrente\n2) Conta Poupanca ");
        int tipo = scInt();

        int numero = generateInt(100000, 999999);
        int ag = generateInt(1000, 9999);
        double saldo = 0.0;
        
        Cadastro cadastro = new Cadastro(numero, tipo, saldo, ag, cpf, senha);
        registro.add(cadastro);
    }

    public void verificacao(){
        System.out.println("Informe cpf do titular e dps a senha");
        long cpf = scLong();
        String se = scString();
        for (Cadastro cd : registro) {
            if(cd.getCpfTitular()==cpf && cd.getSenha().equals(se)){
                while(true){
                    System.out.println("0- Sair\n1- Depositar\n2- Sascar\n3- Extrato");
                    int x = scInt();
                    if(x==0) break;
                    switch(x){                            
                        case(1):
                            depositar(cd);
                            break;
                        case(2):
                            sacar(cd);
                            break;
                        case(3):
                            extrato(cd);
                            break;
                    }
                }
            }
        }
    }

    public void depositar(Cadastro cd){
        System.out.println("Entre com o valor de deposito");
        int dp = scInt();
        cd.setSaldo(cd.getSaldo()+dp);
        extrato(cd);
    }
    public void sacar(Cadastro cd){
        System.out.println("Digite valor de saque");
        int sq = scInt();
        cd.setSaldo(cd.getSaldo()-sq);
        extrato(cd);
    }
    public void extrato(Cadastro cd){
        System.out.println("Aqui esta o seu saldo\n"+cd.getSaldo());
    }

    public int scInt(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public long scLong(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLong();
    }

    public String scString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    public int generateInt(int min, int max){
        Random random = new Random();
        int rd = random.nextInt((max-min)+1)+min;
        return rd; 
    }

}
