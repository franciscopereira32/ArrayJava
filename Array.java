import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Array{
    public static void main(String args[]){
                
        ArrayList<Times> listaTimes = new ArrayList<Times>();

        for (int i=1; i<5; i++){
            Times time = new Times();
            time.nome = JOptionPane.showInputDialog("Digite o nome do time" );    
            listaTimes.add(time);
        }
        JOptionPane.showMessageDialog(null, listaTimes);
        System.out.println(listaTimes);
        
    }
    
}


