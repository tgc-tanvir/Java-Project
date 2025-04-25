package classes;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PaySuccess extends JFrame
{
    private JLabel label1;
    private Font f1, f2;
    private ImageIcon img;
    private JButton btn1, nBtn;
    private Cursor cursor;

    public PaySuccess()
	{
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("GsmMark");
        this.setSize(900,900);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        try{
        img=new ImageIcon("images//gsmmark_the_logo.jpeg");}
        catch(NullPointerException npe)
        {
            System.out.println("Image cannot be found!"+npe);
            npe.printStackTrace();
        }
		JLabel j=new JLabel("",img,JLabel.CENTER);
		j.setBounds(0,0,900,900);
		this.add(j);

        f1 = new Font("Segoe UI Black", Font.PLAIN, 30);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 30);

        label1 = new JLabel();
        label1.setText("Your Payment Has");
        label1.setBounds(180, 80, 500, 50);
        label1.setFont(f1);
        j.add(label1);

        label1 = new JLabel();
        label1.setText("Successfully Completed.");
        label1.setBounds(180, 130, 500, 50);
        label1.setFont(f1);
        j.add(label1);

        label1 = new JLabel();
        label1.setText("Thank You For Choosing GsmMark");
        label1.setBounds(180,180,600,50);
        label1.setFont(f1);
        j.add(label1);

        cursor = new Cursor(Cursor.HAND_CURSOR);

        btn1 = new JButton("Exit");
        btn1.setBounds(380,470,140,60);
        btn1.setFont(f2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#2E75B6"));
        j.add(btn1);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        j.add(nBtn);

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null,"Your phone will be delivered to you within two days");
                System.exit(0);
            }
        });
    }

    public static void main(String[] args)
	{

        new PaySuccess();

    }
}
