/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculadora.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Oxxi
 */
@WebService(serviceName = "calculadoraWs")
public class calculadoraWs {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "add")
    public int add(@WebParam(name = "i") int i, @WebParam(name = "j") int j) {
        int a = i+j;
        return a;
    }
}
