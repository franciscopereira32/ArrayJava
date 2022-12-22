import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Array{
    private static Scanner s;
    public static void main(String args[]){
        
        s = new Scanner(System.in);
        
        ArrayList<Times> listaTimes = new ArrayList<Times>();

        for (int i=1; i<5; i++){
            Times time = new Times();
            System.out.println("Digite um time: ");
            time.nome = s.next();    
            listaTimes.add(time);
        }
        
        System.out.println(listaTimes);
        
    }
    
}


