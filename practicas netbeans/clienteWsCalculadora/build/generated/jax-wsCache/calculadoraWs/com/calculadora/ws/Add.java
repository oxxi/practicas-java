
package com.calculadora.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para add complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="add">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="i" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="j" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "add", propOrder = {
    "i",
    "j"
})
public class Add {

    protected int i;
    protected int j;

    /**
     * Obtiene el valor de la propiedad i.
     * 
     */
    public int getI() {
        return i;
    }

    /**
     * Define el valor de la propiedad i.
     * 
     */
    public void setI(int value) {
        this.i = value;
    }

    /**
     * Obtiene el valor de la propiedad j.
     * 
     */
    public int getJ() {
        return j;
    }

    /**
     * Define el valor de la propiedad j.
     * 
     */
    public void setJ(int value) {
        this.j = value;
    }

}
