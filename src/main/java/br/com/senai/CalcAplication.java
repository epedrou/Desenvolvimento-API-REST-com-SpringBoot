package br.com.senai;

import br.com.senai.Service.Divisao;
import br.com.senai.Service.Multiplicacao;
import br.com.senai.Service.Soma;
import br.com.senai.Service.Subtracao;
import jakarta.xml.ws.Endpoint;


public class CalcAplication {

 public static void main(String[] args) {
     System.out.println("Publicando webservice...");
     Endpoint.publish("http://localhost:8080/calculadora/Soma",new Soma());
     Endpoint.publish("http://localhost:8080/calculadora/Multiplicacao",new Multiplicacao());
     Endpoint.publish("http://localhost:8080/calculadora/Subtracao",new Subtracao());
     Endpoint.publish("http://localhost:8080/calculadora/Divisao",new Divisao());
     System.out.println("Webservice SOMA publicado com sucesso!");
 }
}
