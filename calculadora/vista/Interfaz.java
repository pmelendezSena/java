import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Interfaz extends JFrame {
    public JButton jButton0;
    public JButton jButton1;
    public JButton jButton2;
    public JButton jButton3;
    public JButton jButton4;
    public JButton jButton5;
    public JButton jButton6;
    public JButton jButton7;
    public JButton jButton8;
    public JButton jButton9;
    public JButton jButtonSum;
    public JButton jButtonRes;
    public JButton jButtonMul;
    public JButton jButtonDiv;
    public JButton jButtonMm;
    public JButton jButtonPunto;
    public JButton jButtonC;
    public JButton jButtonCE;
    public JButton jButtonInv;
    public JButton jButtonTot;
    
    public JTextField txtpantalla;
    
      public Interfaz() {
        txtpantalla = new JTextField();
        jButton0 = new JButton();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jButton6 = new JButton();
        jButton7 = new JButton();
        jButton8 = new JButton();
        jButton9 = new JButton();
        jButtonSum = new JButton();
        jButtonRes = new JButton();
        jButtonMul = new JButton();
        jButtonDiv = new JButton();
        jButtonMm = new JButton();
        jButtonPunto = new JButton();
        jButtonC = new JButton();
        jButtonCE = new JButton();
        jButtonInv = new JButton();
        jButtonTot = new JButton();
          
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);         
        this.setBounds(10,10,280,250);
        this.setVisible(true);
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);  
          
        Font fuente = new Font("Arial", 0, 16);    
        txtpantalla.setBounds(10, 5, 260, 50);
        txtpantalla.setFont(fuente);
        txtpantalla.setHorizontalAlignment(JTextField.RIGHT); 
        add(txtpantalla);  
        }
}
