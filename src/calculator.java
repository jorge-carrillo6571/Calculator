import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator implements ActionListener {
    JFrame frame;
    // se crea un campo de texto  
    JTextField textField; 
    //instanciamos los botones 
    JButton[] numberButtons = new JButton[10]; 
    JButton[] functioButtons = new JButton[9]; 
    JButton addButton, subButton, mulButton, divButton; 
    JButton decButton, eqButton, delButton, clrButon,negButton; 
    //hacemos un panel 
    JPanel panel; 
    //creamos una font que se usara despues
    Font myFont = new Font("Inf Free", Font.BOLD,30); 
    double num1=0, num2=0, result=0; 
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
        negButton= new JButton("(-)"); 
        
        // adding the buttons to the button array 
        functioButtons[0] = addButton; 
        functioButtons[1] = subButton;
        functioButtons[2] = mulButton;
        functioButtons[3] = divButton;
        functioButtons[4] = decButton;
        functioButtons[5] = eqButton;
        functioButtons[6] = delButton;
        functioButtons[7] = clrButon;
        functioButtons[8] = negButton;


        //le ponemos una font 
        for(int i =0; i <9; i++){

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
        negButton.setBounds(50,430,100,50);
        delButton.setBounds(150,430,100,50);
        clrButon.setBounds(250,430,100,50); 
        panel = new JPanel(); 
        panel.setBounds(50,100,300,300 );
        panel.setLayout(new GridLayout(4,4,10,10));
        
        panel.add(numberButtons[1]); 
        panel.add(numberButtons[2]); 
        panel.add(numberButtons[3]); 
        panel.add(addButton); 
        panel.add(numberButtons[4]); 
        panel.add(numberButtons[5]); 
        panel.add(numberButtons[6]); 
        panel.add(subButton); 
        panel.add(numberButtons[7]); 
        panel.add(numberButtons[8]); 
        panel.add(numberButtons[9]); 
        panel.add(mulButton); 
        panel.add(decButton); 
        panel.add(numberButtons[0]); 
        panel.add(eqButton); 
        panel.add(divButton); 
        

        

        frame.add(panel); 
        frame.add(negButton); 
        frame.add(delButton); 
        frame.add(clrButon); 
        frame.add(textField); 
        
        frame.setVisible(true);
        // is just a comment

    }
    public static void main (String [] args){
        calculator calc = new calculator(); 


    }
    @Override
    public void actionPerformed(ActionEvent e){
        //checar is alguien presiona los botones 
        for (int i =0; i<10; i++){

            if(e.getSource() == numberButtons[i]){
                textField.setText(textField.getText().concat(String.valueOf(i))); 
            }
        }
        if(e.getSource()== decButton){
            textField.setText(textField.getText().concat("."));

        }
        if(e.getSource()== addButton){
            num1= Double.parseDouble(textField.getText()); 
            operator= '+'; 
            textField.setText("");


        }
        if(e.getSource()== subButton){
            num1= Double.parseDouble(textField.getText()); 
            operator= '-'; 
            textField.setText("");
            

        }
        if(e.getSource()== mulButton){
            num1= Double.parseDouble(textField.getText()); 
            operator= '*'; 
            textField.setText("");
        }
        if(e.getSource()== divButton){
            num1= Double.parseDouble(textField.getText()); 
            operator= '/'; 
            textField.setText("");
            

        }
        if(e.getSource()==eqButton){
            num2= Double.parseDouble(textField.getText()); 

            switch (operator) {
                case '+':
                    result=num1+num2; 
                    break;
                case '-':
                    result= num1-num2; 
                    break; 
                case '*': 
                    result=num1*num2; 
                    break; 
                case '/':
                    result=num1/num2; 
                    break; 
                default:
                    break;
            }
            textField.setText(String.valueOf(result));
            num1=result; 
        }
        if(e.getSource()== clrButon){
            textField.setText("");
     
            

        }
        if(e.getSource()== delButton){
            
            String string = textField.getText(); 
            textField.setText("");
            for(int i =0; i<string.length()-1; i++){
                textField.setText(textField.getText()+string.charAt(i));
            }


        }
        if(e.getSource()== negButton){
            
            double temp= Double.parseDouble(textField.getText()); 
            temp*=-1; 
            textField.setText(String.valueOf(temp));
    }

}
}