package classes;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class PhoneTypes extends JFrame {

    private Container c;
    private ImageIcon icon;
    private JLabel label1, imgLabel;
    private Font f1, f2, f3;
    private ImageIcon logo;
    private JButton btn1, btn2, btn3, nBtn;
    private Cursor cursor;
    private JRadioButton smartphone, iphone;
    private ButtonGroup radioButtonGroup;
    private int defPack = 0;

    public PhoneTypes()
    {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("GsmMark");
        this.setSize(900,900);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c= this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));

        //icon= new ImageIcon();
        //this.setIconImage(icon.getImage());

          try{
          logo = new ImageIcon("images//gsmmark_the_logo.jpeg");}
          catch(NullPointerException npe)
          {
              System.out.println("Image cannot be found!"+npe);
              npe.printStackTrace();
          }
          imgLabel = new JLabel("",logo,JLabel.CENTER);
          imgLabel.setBounds(0,0,900,900);
          c.add(imgLabel);

         f1 = new Font("Segoe UI Black", Font.BOLD,27);
         f2 = new Font("Arial",Font.BOLD,23);
         f3 = new Font("Arial",Font.BOLD,23);

        cursor = new Cursor(Cursor.HAND_CURSOR);

        label1 = new JLabel();
        label1.setText("Choose Phone Type");
        label1.setBounds(330,70,300,50);
        label1.setFont(f1);
        imgLabel.add(label1);

        smartphone= new JRadioButton("Android");
        smartphone.setBounds(360,140,120,30);
        smartphone.setFont(f2);
        smartphone.setCursor(cursor);
        smartphone.setBackground(Color.decode("#F2F2F2"));
        imgLabel.add(smartphone);

        iphone= new JRadioButton("iOS");
        iphone.setBounds(360,180,120,30);
        iphone.setFont(f2);
        iphone.setCursor(cursor);
        iphone.setBackground(Color.decode("#F2F2F2"));
        imgLabel.add(iphone);

        radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(smartphone);
        radioButtonGroup.add(iphone);

        btn1 = new JButton("Exit");
        btn1.setBounds(812,5,70,30);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#C00000"));
        imgLabel.add(btn1);

        btn2 = new JButton("Previous");
        btn2.setBounds(713,5,90,30);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#2E75B6"));
        imgLabel.add(btn2);

        btn3 = new JButton("Next");
        btn3.setBounds(365,240,130,30);
        btn3.setFont(f3);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#2E75B6"));
        imgLabel.add(btn3);

        nBtn = new JButton("");
        nBtn.setBounds(0,0,0,0);
        imgLabel.add(nBtn);

        Handler handler = new Handler();
        smartphone.addActionListener(handler);
        iphone.addActionListener(handler);

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                 new Login();
                setVisible(false);
            }
        });

        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (defPack == 1) {
                    Smartphones frame = new Smartphones();
                    frame.setVisible(true);
                    setVisible(false);
                    dispose();
                } else if (defPack == 2) {
                    Iphones frame = new Iphones();
                    frame.setVisible(true);
                    setVisible(false);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Please Select Phone Type.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    class Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == smartphone)
			{
                defPack = 1;
            }
			else if (e.getSource() == iphone)
			{

                defPack = 2;
            }
        }
    }

    public static void main(String[] args) {

        PhoneTypes frame = new PhoneTypes();
        frame.setVisible(true);
    }
}
