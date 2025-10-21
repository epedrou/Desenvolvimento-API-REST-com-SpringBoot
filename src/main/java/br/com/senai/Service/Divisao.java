package br.com.senai.Service;
import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.senai.Service.Operacoes")
public class Divisao implements Operacoes {

    @Override
    public String nomeDaOperacao() {
        return "Divisao";
    }

    @Override
    public String simboloDaOperacao() {
        return "/";
    }

    @Override
    public double calcular(double x, double y) {
        return x / y;
    }

    @Override
    public void mensagem(double x, double y) {

        System.out.println("O cálculo de " + nomeDaOperacao() + " entre " + x + " e " + y + ":\n"
                + x + " " + simboloDaOperacao() + " " + y + "\n"
                + "Resultado: " + calcular(x, y) + ".");

    }
}
