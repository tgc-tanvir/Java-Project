package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static javax.swing.JOptionPane.showMessageDialog;
public class Login{
    private JFrame f;
	private JTextField tf1;
    private JPasswordField pf;
    private JButton b1,b2,b3,b4,b5;
	private JLabel l1;
	private JLabel l2;
	private Container c;
	private ImageIcon img;
	User u1,u2,u3,u4;
	User users[];
    public Login()
	{
        u1=new User("Sifat","7802");
		u2=new User("Alif","4802");
		u3=new User("Mahmud","pass");
		u4=new User("jr","1234");

		users=new User[4];
		users[0]=u1;
		users[1]=u2;
		users[2]=u3;
		users[3]=u4;
		f= new JFrame("Login Page");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c=f.getContentPane();
		c.setLayout(null);
		l1 = new JLabel("Username");
		l1.setBounds(280,220,150,20);
		l1.setFont(new Font("Arial",Font.PLAIN,20));
		l2 = new JLabel("Password");
		l2.setBounds(280,260,150,20);
		l2.setFont(new Font("Arial",Font.PLAIN,20));
        tf1=new JTextField();
        tf1.setBounds(380,220,150,25);
		tf1.setFont(new Font("Arial",Font.PLAIN,15));
		c.add(tf1);
        tf1.setForeground(Color.BLACK);
        tf1.setBackground(Color.WHITE);
		pf=new JPasswordField();
        pf.setBounds(380,260,150,25);
		pf.setFont(new Font("Arial",Font.PLAIN,15));
        c.add(pf);
		pf.setForeground(Color.BLACK);
		pf.setBackground(Color.WHITE);
        b1=new JButton("Login");
        b1.setBounds(290,300,90,30);
        c.add(b1);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLUE);
        b2=new JButton("Forgot Password");
		b2.setBounds(400,300,150,30);
		c.add(b2);
	    b2.setForeground(Color.WHITE);
		b2.setBackground(Color.BLUE);
		try{
		img=new ImageIcon("images//front.png");}
		catch(NullPointerException npe)
		{
		    System.out.println("Image cannot be found!"+npe);
		    npe.printStackTrace();
		}
		JLabel j=new JLabel("",img,JLabel.CENTER);
		j.setBounds(0,0,900,900);
		f.add(j);
		//img= new ImageIcon("Gsmmark_last.png");
		//f.setIconImage(img.getImage());
		b3=new JButton("Sign Up");
		b3.setBounds(290,340,90,30);
		c.add(b3);
		b3.setForeground(Color.WHITE);
		b3.setBackground(Color.BLUE);
		b4=new JButton("Exit");
		b4.setBounds(380,387,70,30);
		c.add(b4);
		b4.setForeground(Color.WHITE);
		b4.setBackground(Color.BLUE);
	    b5=new JButton("Admin Login");
		b5.setBounds(400,340,150,30);
		c.add(b5);
		b5.setForeground(Color.WHITE);
		b5.setBackground(Color.BLUE);




		j.add(l1);
		j.add(l2);
        j.add(tf1);
        j.add(pf);
		j.add(b1);
		j.add(b2);
		j.add(b3);
		j.add(b4);
		j.add(b5);
        f.setSize(900,900);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setVisible(true);
        b1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae)
		{
            String user = tf1.getText();
		    String pass = pf.getText();
		    int flag = 0;

		    for(int i = 0; i<users.length; i++)
		    {

				if(user.equals(users[i].getUsername()) && pass.equals(users[i].getPassword()))
				{
					flag = 1;
					break;

				}
		    }
			if (flag == 1)
			{

				f.setVisible(false);
				PhoneTypes frame = new PhoneTypes();
                frame.setVisible(true);

			}
			else
			{
				showMessageDialog(null, "Invalid Username or Password!");
			}
		}
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
             {
                 f.setVisible(false);
                 SignUp frame= new SignUp();
                 frame.setVisible(true);
             }
        });

		b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

			 System.exit(0);
            }
        });
		b5.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae)
		{
            f.setVisible(false);
			new AdminLogin();

        }
        });
	}
}















