package br.com.senai.Service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface Operacoes {

    @WebMethod
    String nomeDaOperacao();
    @WebMethod
    String simboloDaOperacao();

    @WebMethod
    double calcular(double x, double y);
    @WebMethod
    void mensagem(double x, double y);
}
