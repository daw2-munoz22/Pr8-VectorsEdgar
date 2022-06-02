package com.mycompany.pr8vectorsedgar;

class Burbuja {
    private int[] num;
    
    public Burbuja (int[] list){
      num = list;
    }
    
    public int[] Ordenar(){
        int last = num.length-1;
        while(last>0){
          int antes = 0;
          for(int i=0; i<last; i++){
            if(num[i]  >num[i + 1]){
              int auxiliar = num[i];
              num[i] = num[i + 1];
              num[i + 1] = auxiliar;
              antes = i;
            }
          }
          last = antes;
        }
    return num;
  }
}