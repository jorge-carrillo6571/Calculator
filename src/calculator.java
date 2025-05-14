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
        // vamo a hacer los botones 
        addButton= new JButton("+");
        subButton= new JButton("-");
        mulButton= new JButton("*");
        divButton= new JButton("/");
        decButton= new JButton(".");
        eqButton= new JButton("=");
        delButton= new JButton("Delete"); 
        clrButon= new JButton("Clear");
        
        // adding the buttons to the button array 
        functioButtons[0] = addButton; 
        functioButtons[1] = subButton;
        functioButtons[2] = mulButton;
        functioButtons[3] = divButton;
        functioButtons[4] = decButton;
        functioButtons[5] = eqButton;
        functioButtons[6] = delButton;
        functioButtons[7] = clrButon;

        //le ponemos una font 
        for(int i =0; i <8; i++){

            functioButtons[i].addActionListener(this);
            functioButtons[i].setFont(myFont);
            functioButtons[i].setFocusable(false);
        }

        for (int i =0; i<10; i++){
            numberButtons[i]=new JButton(String.valueOf(i)); 
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }
        delButton.setBounds(50,430,145,50);
        clrButon.setBounds(205,430,145,50); 
        panel = new JPanel(); 
        panel.setBounds(50,100,300,300 );
        panel.setLayout(new GridLayout(4,4,10,10));
        panel.setBackground(Color.GRAY);


        

        frame.add(panel); 
        frame.add(delButton); 
        frame.add(clrButon); 
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
