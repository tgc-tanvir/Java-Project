package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminLogin
{
    private JFrame f;
	private JButton b1,b2,b3;
	private JLabel l1,l2;
	private JTextField tf1;
	private JPasswordField pf1;
	private Container c;
	private ImageIcon img;
	User u1,u2,u3,u4;
	User users[];
	public AdminLogin()
	{
		f=new JFrame("Admin Login Page");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(900,900);
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		f.setVisible(true);
		u1=new User("Tanvir","7802");
		u2=new User("Tushar","7694");
		u3=new User("Parvez","4422");
		u4=new User("Sayem","1219");
		users=new User[4];
		users[0]=u1;
		users[1]=u2;
		users[2]=u3;
		users[3]=u4;
		c=f.getContentPane();
		c.setLayout(null);
		l1= new JLabel("Username");
		l1.setBounds(310,330,120,23);
		l1.setFont(new Font("Arial",Font.PLAIN,20));
		l2= new JLabel("Password");
		l2.setBounds(310,370,120,23);
		l2.setFont(new Font("Arial",Font.PLAIN,20));
		tf1=new JTextField();
        tf1.setBounds(410,330,150,25);
        tf1.setFont(new Font("Arial",Font.PLAIN,15));
		c.add(tf1);
        tf1.setForeground(Color.BLACK);
        tf1.setBackground(Color.WHITE);
		pf1=new JPasswordField();
        pf1.setBounds(410,370,150,25);
        pf1.setFont(new Font("Arial",Font.PLAIN,15));
        c.add(pf1);
		pf1.setForeground(Color.BLACK);
        pf1.setBackground(Color.WHITE);
		img= new ImageIcon("images//admin_I.png");
		JLabel j= new JLabel("",img,JLabel.CENTER);
		j.setBounds(0,0,900,900);
		f.add(j);
		b1=new JButton("Login");
        b1.setBounds(320,410,90,30);
        c.add(b1);
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.BLUE);
        b2=new JButton("Forgot Password");
        b1.setFont(new Font("Arial",Font.PLAIN,15));
		b2.setBounds(435,410,160,30);
		c.add(b2);
	    b2.setForeground(Color.BLACK);
		b2.setBackground(Color.BLUE);
		b2.setFont(new Font("Arial",Font.PLAIN,15));
		b3=new JButton("Previous");
		b3.setBounds(790,5,90,23);
		c.add(b3);
		b3.setForeground(Color.WHITE);
		b3.setBackground(Color.BLACK);
		j.add(l1);j.add(l2);
		j.add(tf1);j.add(pf1);
		j.add(b1);j.add(b2);j.add(b3);
        f.setSize(900,900);
		f.setLocationRelativeTo(null);
		f.setLayout(null);
		f.setResizable(false);
		f.setVisible(true);
		b1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae)
		{
            String user = tf1.getText();
		    String pass = pf1.getText();
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
				new AdminPanel();

			}
			else
			{
				JOptionPane.showMessageDialog(null, "Invalid Username or Password!");
			}
		}
        });
		b3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae)
		{
            f.setVisible(false);
			new Login();

        }
        });
	}
}







