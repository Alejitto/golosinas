/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author alexc
 */
public class Bolsa implements Iterable{
    private ArrayList lista = new ArrayList();
    private int tope;

    public Bolsa(int tope) {
        super();
        this.tope = tope;
    }
    
    public void add(Object objeto){
        if(lista.size()<=tope){
            lista.add(objeto);
        }else{
            throw new RuntimeException("no caben mas");
        }
    }
    
    public Iterator iterator(){
        return lista.iterator();
    }
}
