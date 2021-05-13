//import java.util.ArrayList;

/**
 * Veiculo
 */
public class Veiculo {
 private String modelo = " ";
 private String marca = " ";
 private int fabricacao;
 private double valorMercado;
 private String placa = " "; 
 private String TCombustivel[] = {"álcool", "gasolina", "flex", "GNV", "diesel"} ;
 
 public String getPlaca() {
    return placa;
}
public Veiculo(String modelo,String marca,int fabricacao,double valorMercado,String placa,String TCombustivel[] ){

this.modelo = modelo;
this.marca = marca;
this.fabricacao = fabricacao;
this.valorMercado = valorMercado;
this.placa = placa;
this.TCombustivel = TCombustivel;

}
public double calcularImposto() {
    double imposto = 0.0 ;
    int[] valoresInteiros = new int[TCombustivel.length];
    int x;
    for (x = 0; x < TCombustivel.length; x++) {
	valoresInteiros[x] = Integer.parseInt(TCombustivel[x]);
	}
    if (fabricacao < 1999) {
        imposto = 0.0;     
    } 
    else if  (x < 3){
        double valorOriginal = this.valorMercado;
        double percentual = 4.0 / 100.0; 
        double valorFinal = valorOriginal + (percentual * valorOriginal);
        imposto = valorFinal;  
    }
    else{
        double valorOriginal = this.valorMercado;
        double percentual = 3.0 / 100.0; 
        double valorFinal = valorOriginal + (percentual * valorOriginal);
        imposto = valorFinal;  
    }
    
    
    return imposto; }

public String imprimir(){return modelo + marca + fabricacao + valorMercado + placa + TCombustivel;}



}
