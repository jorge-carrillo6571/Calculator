import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator implements ActionListener {
    JFrame frame;
    // se crea un campo de texto  
    JTextField textField; 
    //instanciamos los botones 
    JButton[] numberButtons = new JButton[10]; 
    JButton[] functioButtons = new JButton[8]; 
    JButton addButton, subButton, mulButton, divButton; 
    JButton decButton, eqButton, delButton, clrButon; 
    //hacemos un panel 
    JPanel panel; 
    //creamos una font que se usara despues
    Font myFont = new Font("Inf Free", Font.BOLD,30); 
    double num1=0, nume2=0, result=0; 
    char operator; 

    calculator(){
        //hacemos una ventana o frame
        frame = new JFrame("Calculator");
        //hace que cuando la cierres se termine el programa
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        //tamanio de la ventana 
        frame.setSize(420, 550);

        frame.setLayout(null);
        //esto para el espacio en donde se puede escrubir
        textField= new JTextField(); 
        textField.setBounds(50,25,300,50);
        textField.setFont(myFont);
        textField.setEditable(false);


       
       
       
       
        frame.add(textField); 
        frame.setVisible(true);

    }
    public static void main (String [] args){
        calculator calc = new calculator(); 


    }
    @Override
    public void actionPerformed(ActionEvent e){

    }

}
