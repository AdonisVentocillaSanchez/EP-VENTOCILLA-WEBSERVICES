/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteWS;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author AUTONOMA
 */
@WebService(serviceName = "ServiciosWeb")
@Stateless()
public class ServiciosWeb {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CalculaLadoPerimCuadrado")
    public String CalculaLadoPerimCuadrado(@WebParam(name = "area") double area, @WebParam(name = "medida") String medida) {
        //TODO write your implementation code here:
        String respuesta = "";
        double lado = 0;
        lado = Math.sqrt(area);
        double perimetro = 0;
        perimetro = lado*4;
        respuesta = "El LADO del cuadrado es : " + lado + " " + medida
                + "\n y su PERIMETRO  es : " + perimetro + " " + medida;
        return respuesta;
    }


    /**
     * Web service operation
     */
    @WebMethod(operationName = "CalculaPerimAreaTriangulo")
    public String CalculaPerimAreaTriangulo(@WebParam(name = "base") double base, @WebParam(name = "altura") double altura, @WebParam(name = "medida") String medida) {
        //TODO write your implementation code here:
        String respuesta = "";
        double area = 0;
        area = (base*altura)/2;
        double lado = 0;
        lado = Math.sqrt(Math.pow(base/2,2)+Math.pow(altura,2));
        double perimetro = 0;
        perimetro = (2*lado)+base;
        respuesta = "El PERIMETRO del triangulo es : " + perimetro + " " + medida
                + "\n y su ÁREA  es : " + area + " " + medida;
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CalculaBasePerimAreaRectangulo")
    public String CalculaBasePerimAreaRectangulo(@WebParam(name = "diagonal") double diagonal, @WebParam(name = "altura") double altura, @WebParam(name = "medida") String medida) {
        //TODO write your implementation code here:
        String respuesta = "";
        double base = 0;
        base = Math.sqrt(Math.pow(diagonal,2)-Math.pow(altura,2));
        double perimetro = 0;
        perimetro = 2*(altura+base);
        double area = 0;
        area = (base*altura);
        respuesta = "La BASE del rectangulo es : " + base + " " + medida 
                + "\n su PERIMETRO es : " + perimetro + " " + medida
                + "\n y su ÁREA es : "+ area + " " + medida + "²";
        return respuesta;
    }

}
