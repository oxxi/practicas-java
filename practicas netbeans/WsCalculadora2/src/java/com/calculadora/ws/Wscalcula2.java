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
@WebService(serviceName = "Wscalcula2")
public class Wscalcula2 {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "add")
    public int add(@WebParam(name = "j") int j, @WebParam(name = "i") int i) {
       int k = j+i;
        return k;
    }
}
