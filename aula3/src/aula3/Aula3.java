/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

/**
 *
 * @author laura.cyriaco
 */
public class Aula3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int[] listnum = {1, 2, 3, 4};
    int resp = 3;
    if(listnum[0] + listnum[1] == resp){
        System.out.println("resposta 0,1 correta");
    }
        if(listnum[0] + listnum[2] == resp){
           System.out.println("resposta 0,2 correta"); 
        }
            if(listnum[0] + listnum[3] == resp){
                System.out.println("resposta 0,3 correta");
            }  
                if(listnum[1] + listnum[2] == resp){
                System.out.println("resposta 1,2 correta");
                } 
                if(listnum[1] + listnum[3] == resp){
                    System.out.println("resposta 1,3 correta");
                    } 
                    if(listnum[2] + listnum[3] == resp){
                        System.out.println("resposta 2,3 correta");
}
                    else{
                        System.out.println("error");
}
    
    }
    
}
