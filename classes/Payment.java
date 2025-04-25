package classes;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Payment extends JFrame {


    private JLabel label1, label2, label3,imgLabel;
    private Font f1, f2, f3, f4, f5, f6;
    private ImageIcon logo, img1, img2;
    private JTextField tf1, tf2, tf3;
    private JPasswordField pf;
    private JButton b1, b2, b3;
    private Cursor cursor;
	private Container c;

    public Payment()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Payment");
        this.setSize(900,900);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));

        try{
        img1= new ImageIcon("images//titaniam1.jpg");}
        catch(NullPointerException npe)
        {
            System.out.println("Image cannot be found!"+npe);
            npe.printStackTrace();
        }
        JLabel j= new JLabel("",img1,JLabel.CENTER);
        j.setBounds(390,93,90,60);
		this.add(j);

        try{
        img2 = new ImageIcon("images//visa1.png");}
        catch(NullPointerException npe)
        {
            System.out.println("Image cannot be found!"+npe);
            npe.printStackTrace();
        }
        JLabel k= new JLabel("",img2,JLabel.CENTER);
        k.setBounds(490,93,90,60);
		this.add(k);

        f1 = new Font("Segoe UI Blue", Font.PLAIN,30);
        f2 = new Font("Segoe UI Semibold", Font.PLAIN,25);
        f3 = new Font("Segoe UI", Font.PLAIN, 20);
        f4 = new Font("Segoe UI", Font.PLAIN, 15);
        f5 = new Font("Segoe UI Black", Font.PLAIN, 15);
        f6 = new Font("Segoe UI Black", Font.PLAIN,16);

        label1 = new JLabel();
        label1.setText("Please Complete Payment");
        label1.setBounds(300,20,500,50);
        label1.setFont(f1);
        this.add(label1);


        label2 = new JLabel("Card Details");
        label2.setBounds(330,145, 500, 50);
        label2.setFont(f2);
		this.add(label2);


        label3 = new JLabel("Cardholder Name");
        label3.setBounds(282,180,250,50);
        label3.setFont(f3);
        this.add(label3);

        tf1 = new JTextField();
        tf1.setBounds(440,190,235, 30);
        tf1.setFont(f4);
        this.add(tf1);

        label3 = new JLabel("Card Number");
        label3.setBounds(282, 220, 500, 50);
        label3.setFont(f3);
        this.add(label3);

        tf2 = new JTextField();
        tf2.setBounds(410,230, 235, 30);
        tf2.setFont(f4);
        tf2.setHorizontalAlignment(JTextField.CENTER);
        this.add(tf2);

        label3 = new JLabel("Valid On");
        label3.setBounds(282,260,120,50);
        label3.setFont(f3);
        this.add(label3);

        tf3 = new JTextField();
        tf3.setBounds(370,270,100,30);
        tf3.setFont(f4);
        tf3.setHorizontalAlignment(JTextField.CENTER);
        this.add(tf3);

        label3 = new JLabel("CVV Code");
        label3.setBounds(480,260,200, 50);
        label3.setFont(f3);
        this.add(label3);

        pf = new JPasswordField();
        pf.setBounds(578,270,100,30);
        pf.setHorizontalAlignment(JPasswordField.CENTER);
        pf.setEchoChar('*');
        pf.setFont(f5);
        this.add(pf);

        cursor = new Cursor(Cursor.HAND_CURSOR);

        b1 = new JButton("Exit");
        b1.setBounds(455,380,80,35);
        b1.setFont(f6);
        b1.setCursor(cursor);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLUE);
        this.add(b1);

        b2 = new JButton("Back");
        b2.setBounds(362, 380,80,35);
        b2.setFont(f6);
        b2.setCursor(cursor);
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLUE);
        this.add(b2);

        b3 = new JButton("Make Payment");
        b3.setBounds(378, 325,160,35);
        b3.setFont(f6);
        b3.setCursor(cursor);
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.BLUE);
        this.add(b3);


        tf1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (tf1.getText().length() >= 10 )
                    e.consume();
            }
        });

        tf2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (tf2.getText().length() >= 19 )
                    e.consume();
            }
        });

        tf3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (tf3.getText().length() >= 15 )
                    e.consume();
            }
        });

        pf.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (pf.getText().length() >= 6 )
                    e.consume();
            }
        });

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        b2.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent ae)
              {
                   setVisible(false);
                   PhoneTypes frame= new PhoneTypes();
                   frame.setVisible(true);
              }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String nameOnCard = tf1.getText();
                String cardNumber = tf2.getText();
                String validOn = tf3.getText();
                String cvvCode = pf.getText();

                if (nameOnCard.isEmpty() || cardNumber.isEmpty() || validOn.isEmpty() || cvvCode.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    setVisible(false);
                    PaySuccess frame = new PaySuccess();
                    frame.setVisible(true);
                }
            }
        });
    }
}



