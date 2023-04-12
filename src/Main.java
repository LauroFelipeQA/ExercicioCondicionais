import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        calcularOperacoes(2.0,3.0);
        System.out.println("%n");
        verificarTurno(19);
        System.out.println("%n");
        calcularImposto(1980);
    }
    public static void calcularOperacoes(double valor1, double valor2){
        double soma = valor1 + valor2;
        double subtracao = valor1 - valor2;
        double multiplicacao = valor1 * valor2;
        double divisao = valor1 / valor2;
        System.out.printf("O valor da soma é %.2f, da subtração é %.2f, da multiplicação é %.2f e da divisão é %.2f", soma,subtracao,multiplicacao,divisao);
    }
    public static void verificarTurno(int hora){
        if(hora>=6 && hora<12){
            System.out.println("É manha");
        } else if (hora>=12 && hora<18) {
            System.out.println("É tarde");
        } else {
            System.out.println("É madrugada");
        }
    }

    public static void calcularImposto(double valorSolicitado){
            if(valorSolicitado<1000.00){
                valorSolicitado = valorSolicitado *1.2;
            } else if (valorSolicitado>= 1000 && valorSolicitado<5000) {
                valorSolicitado = valorSolicitado *1.5;
            } else {
                valorSolicitado =valorSolicitado *1.9;
            }
        System.out.println(valorSolicitado);
    }
}