/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casacambio;
import java.util.Date;

/**
 *
 * @author Victória
 * @author Caroline
 */
public class Cotacao {
    String moeda;
    Date data;
    double valorCompra;
    double valorVenda;

    public void lerCotacao()
    {
        
    }
    
    public void mostrarCotacao()
    {
    }    
    
    /* Operacoes matematicas ... Caroline Resende */
    
    /* SOBRECARGA de METODOS */
    public float mediaCompra (float x1, float x2) {
        return (x1+x2)/2;
    }
    
    public float mediaVenda (float x1, float x2) {
        return (x1+x2)/2;
    }
    
    public float mediaCompra (float x1, float x2, float x3) {
        return (x1+x2+x3)/3;
    }
    
    public float mediaVenda (float x1, float x2, float x3) {
        return (x1+x2+x3)/3;
    }
    
    /* FUNCAO COM LISTA DE ARGUMENTOS DE COMPRIMENTO VARIAVEL - MEDIA */
    public float mediaVenda(float... x){
        float media=0;
        
        for(float valor: x){
            media +=valor;
        }
        
        return media/x.length;
    }

    public float mediaCompra(float... x){
        float media=0;
        
        for(float valor: x){
            media +=valor;
        }
        
        return media/x.length;
    }
    
    //Operacoes matemáticas finalizadas - Caroline 19/10/2016
        
}