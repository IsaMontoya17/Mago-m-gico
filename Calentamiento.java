
package calentamiento;

import java.util.Scanner;

public class Calentamiento {

public static void main(String[] args) {
        
        int n;
        Scanner pedir = new Scanner(System.in);
        
        n=pedir.nextInt();
        
        while(n%2==0){
            n=pedir.nextInt();
        }
        
        int M = n*((n*n)+1)/2; 
        
        int mat[][]=new int[n][n];
        
        int fila = (n-1)/2;
        int numero=2;
        
        mat[fila][mat[0].length-1]=1;
        
        int j = mat[0].length-1;
        
        
        while(numero<=(n*n)){
            
            if((j+1)>mat[0].length-1 && (fila-1)>=0){
                if(mat[fila-1][0]==0){
                    mat[fila-1][0]=numero;
                    
                    fila--;
                    j=0;
                }                
            }
            else{
                if((j+1)<=mat[0].length-1 && (fila-1)<0){
                    
                    if (mat[mat.length-1][j+1] == 0) {
                        mat[mat.length-1][j+1] = numero;
                        
                        j++;
                        fila=mat.length-1;
                    }
                }
                else{
                    if((j+1)<=mat[0].length-1 && (fila-1)>=0){
                        if (mat[fila - 1][j+1] == 0) {
                            mat[fila - 1][j+1] = numero;
                            
                            fila--;
                            j++;
                        } 
                        else {
                            if((j-1)>=0){
                                mat[fila][j - 1] = numero;

                                j--;
                            } else {
                                mat[fila][mat[0].length-1] = numero;

                                j = mat[0].length-1;
                            }                          
                        }
                    }else{
                        if((j+1)>mat[0].length-1 && (fila-1)<0){
                            
                                mat[fila][j-1] = numero;
                                j--;

                        }
                    }
                }
            }
            numero++;
            
        }
        
        for(int i=0; i<n; i++){
            for(int x=0; x<n; x++){
                
                System.out.print(" " + mat[i][x] + " ");
            }
            System.out.println("");
        }
    }
    

    
}
