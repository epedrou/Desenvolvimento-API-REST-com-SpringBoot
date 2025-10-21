import br.com.senai.Service.Divisao;
import br.com.senai.Service.Multiplicacao;
import br.com.senai.Service.Soma;
import br.com.senai.Service.Subtracao;

void main() {
    Soma soma = new Soma();
    soma.mensagem(15, 13);
    System.out.println(soma.simboloDaOperacao());
    System.out.println(soma.nomeDaOperacao());
    System.out.println(soma.calcular(15, 13));

    Subtracao subtracao = new Subtracao();
    subtracao.mensagem(15, 13);
    System.out.println(subtracao.simboloDaOperacao());
    System.out.println(subtracao.nomeDaOperacao());
    System.out.println(subtracao.calcular(15, 13));

    Divisao divisao = new Divisao();
    divisao.mensagem(8, 2);
    System.out.println(divisao.simboloDaOperacao());
    System.out.println(divisao.nomeDaOperacao());
    System.out.println(divisao.calcular(8, 2));

    Multiplicacao multiplicacao = new Multiplicacao();
    multiplicacao.mensagem(15, 13);
    System.out.println(multiplicacao.simboloDaOperacao());
    System.out.println(multiplicacao.nomeDaOperacao());
    System.out.println(multiplicacao.calcular(5, 5));
    }
