package com.mycompany.pr8vectorsedgar;
public class HexaDecimal {
    int n;
    
    public HexaDecimal(int dn){
      n = dn;
    }
    public String ToHexa(){
    String listaH = "0123456789ABCDEF";
    String resultado = "";
    
    while(n>0){
        int residuo = n%16;
        resultado = listaH.charAt(residuo)+ resultado;
        
    }
    return resultado;
  }
    
}
