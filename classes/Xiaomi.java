package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import classes.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Xiaomi extends JFrame
{
	Mobile m1;
	private JButton b1,b2,b3,b4;
	private JComboBox cb1,cb2,cb3;
	private JLabel l1,l2;
	private JRadioButton r1,r2,r3;
	private JTextArea show;
	private ImageIcon img;
	private Container c;
	public Xiaomi()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Xiaomi Phones");
		c=this.getContentPane();
        c.setLayout(null);
		String phones[]=new String[]{"Select A Phone...","Xiaomi Redmi 10A","Xiaomi Redmi 10","Xiaomi Redmi Note 10 Pro","Xiaomi Redmi Note 11","Xiaomi Redmi Note 11S"};
		cb1=new JComboBox(phones);
		cb1.setBounds(150,120,200,30);
		l1=new JLabel("Please Select a Price Range");
		l1.setBounds(350,40,350,30);
		l1.setFont(new Font("Arial",Font.BOLD,22));
		this.add(l1);
		r1=new JRadioButton("Price Range 10k-25k");
		r1.setBounds(150,80,200,30);
		String phones1[]=new String[]{"Select A Phone...","Xiaomi Poco M3","Xiaomi Poco F4","Xiaomi Poco C40","Xiaomi Poco M4"};
		cb2=new JComboBox(phones1);
		cb2.setBounds(400,120,200,30);
		r2=new JRadioButton("Price Range 25k-40k");
		r2.setBounds(400,80,200,30);
		String phones2[]=new String[]{"Select A Phone...","Xiaomi 12 Pro","Xiaomi 11i","Xiaomi 11T"};
		cb3=new JComboBox(phones2);
		cb3.setBounds(650,120,200,30);
		r3=new JRadioButton("Price Range 40k+");
		r3.setBounds(650,80,200,30);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		b1= new JButton("Buy");
		b1.setBounds(405,472,70,30);
		b2=new JButton("Previous");
		b2.setBounds(710,5,90,20);
		b3=new JButton("Logout");
		b3.setBounds(805,5,80,20);
		l2=new JLabel("Specifications");
		l2.setBounds(370,240,350,30);
		l2.setFont(new Font("Arial",Font.BOLD,25));
		c.add(l2);
		l2.setForeground(Color.BLUE);
		l2.setBackground(Color.BLUE);
		show= new JTextArea(5,5);
		show.setBounds(250,285,380,163);
		try{
        img= new ImageIcon("images//xiaomi_last.jpg");}
		catch(NullPointerException npe)
		{
		    System.out.println("Image cannot be found!"+npe);
		    npe.printStackTrace();
		}
		JLabel j= new JLabel("",img,JLabel.CENTER);
		j.setBounds(0,0,900,900);
		this.add(j);
		j.add(r1);
		j.add(r2);
		j.add(r3);
		j.add(l1);
		j.add(l2);
		j.add(cb1);
		j.add(cb2);
		j.add(cb3);
		j.add(b1);
		j.add(b2);
		j.add(b3);
		j.add(show);
		this.setSize(900,900);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
        cb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
               if(cb1.getSelectedIndex()== 1)
			   {
			    show.setText("Xiaomi Redmi 10A\nDisplay:Full HD+ 1080*2400 pixels(405 ppi)\nBack Camera:Triple 32+8+2 Megapixel\nFront Camera:8 Megapixel\nOperating System:Android 11(MIUI 12.5)\nProcessor:MediaTek Helio G70(12nm)\nRam:4 GB\nRom:64 GB\nBattery:5000 mAh\nPrice:13,999(Tk)");
			    show.setFont(new Font("Arial", Font.BOLD,13));
			    show.setEditable(false);
			   }
			   else if(cb1.getSelectedIndex()== 2)
			   {
			    show.setText("Xiaomi Redmi 10\nDisplay:Full HD+ 1080*2400 pixels(405 ppi)\nBack Camera:Triple 48+8+2 Megapixel\nFront Camera:8 Megapixel\nOperating System:Android 11(MIUI 12.5)\nProcessor:MediaTek Helio G90(11nm)\nRam:4 GB\nRom:128 GB\nBattery:5000 mAh\nPrice:18,999(Tk)");
			    show.setFont(new Font("Arial", Font.BOLD,13));
			    show.setEditable(false);
			   }
			   else if(cb1.getSelectedIndex()== 3)
			   {
				show.setText("Xiaomi Redmi Note 10 Pro\nDisplay:Full HD+ 1080*2400 pixels(405 ppi)\nBack Camera:Quad 64+8+2+2 Megapixel\nFront Camera:16 Megapixel\nOperating System:Android 12(MIUI 12.5)\nProcessor:MediaTek Helio G95(12nm)\nRam:6 GB\nRom:128 GB\nBattery:5000 mAh\nPrice:21,999(Tk)");
			    show.setFont(new Font("Arial", Font.BOLD,13));
			    show.setEditable(false);
			   }
			   else if(cb1.getSelectedIndex()== 4)
			   {
				show.setText("Xiaomi Redmi Note 11\nDisplay:Full HD+ 1080*2408 pixels(411 ppi)\nBack Camera:Quad 64+8+5+2 Megapixel\nFront Camera:16 Megapixel\nOperating System:Android 12(MIUI 12.5)\nProcessor:MediaTek Dimensity 900(11nm)\nRam:6 GB\nRom:128 GB\nBattery:6000 mAh\nPrice:23,999(Tk)");
			    show.setFont(new Font("Arial", Font.BOLD,13));
			    show.setEditable(false);
			   }
			   else if(cb1.getSelectedIndex()== 5)
			   {
				show.setText("Xiaomi Redmi Note 11S\nDisplay:Full HD+ 1080*2408 pixels(413 ppi)\nBack Camera:Quad 48+8+2+2 Megapixel\nFront Camera:8 Megapixel\nOperating System:Android 12(MIUI 12.5)\nProcessor:Qualcomm Snapdragon 768G(7nm)\nRam:8 GB\nRom:256 GB\nBattery:6000 mAh\nPrice:24,999(Tk)");
			    show.setFont(new Font("Arial", Font.BOLD,13));
			    show.setEditable(false);
			   }

		    }});
			cb2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
                if(cb2.getSelectedIndex()== 1)
			   {
			    show.setText("Xiaomi Poco M3\nDisplay:Full HD+ 1080*2400 pixels(405 ppi)\nBack Camera:Quad 48+8+5+2 Megapixel\nFront Camera:16 Megapixel\nOperating System:Android 12(MIUI 12.5)\nProcessor:Qualcomm Snapdragon 868G(7nm)\nRam:6 GB\nRom:128 GB\nBattery:6000 mAh\nPrice:28,490(Tk)");
			    show.setFont(new Font("Arial", Font.BOLD,13));
			    show.setEditable(false);
			   }
			   else if(cb2.getSelectedIndex()== 2)
			   {
			    show.setText("Xiaomi Poco F4\nDisplay:Full HD+ 1080*2400 pixels(411 ppi)\nBack Camera:Quad 108+8+2+2 Megapixel\nFront Camera:32 Megapixel\nOperating System:Android 12(MIUI 12.5)\nProcessor:MediaTek Dimensity 9100(5nm)\nRam:6 GB\nRom:128 GB\nBattery:6000 mAh\nPrice:34,990(Tk)");
			    show.setFont(new Font("Arial", Font.BOLD,13));
			    show.setEditable(false);
			   }
			   else if(cb2.getSelectedIndex()== 3)
			   {
			    show.setText("Xiaomi Poco C40\nDisplay:Quad HD+ 1440*3120 pixels(431 ppi)\nBack Camera:Quad 108+8+2+2 Megapixel\nFront Camera:32 Megapixel\nOperating System:Android 12(MIUI 12.5)\nProcessor:MediaTek Dimensity 9100(5nm)\nRam:8 GB\nRom:256 GB\nBattery:6000 mAh\nPrice:38,590(Tk)");
			    show.setFont(new Font("Arial", Font.BOLD,13));
			    show.setEditable(false);
			   }
			   else if(cb2.getSelectedIndex()== 4)
			   {

			    show.setText("Xiaomi Poco M4\nDisplay:Full HD+ 1080*2400 pixels(411 ppi)\nBack Camera:Quad 48+8+2+2 Megapixel\nFront Camera:32 Megapixel\nOperating System:Android 12(MIUI 12.5)\nProcessor:MediaTek Dimensity 2100(6nm)\nRam:6 GB\nRom:128 GB\nBattery:6000 mAh\nPrice:30,990(Tk)");
			    show.setFont(new Font("Arial", Font.BOLD,13));
			    show.setEditable(false);
			   }
		    }});
		   cb3.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent ae)
			{
			 if(cb3.getSelectedIndex()== 1)
			   {
			    show.setText("Xiaomi 12 Pro\nDisplay:Quad HD+ 1440*3168 pixels(451 ppi)\nBack Camera:Quad 108+8+2+2 Megapixel\nFront Camera:32 Megapixel\nOperating System:Android 12(MIUI 12.5)\nProcessor:MediaTek Dimensity 9100(4nm)\nRam:8 GB\nRom:256 GB\nBattery:6000 mAh\nPrice:42,990(Tk)");
			    show.setFont(new Font("Arial", Font.BOLD,13));
			    show.setEditable(false);
			   }
             else if(cb3.getSelectedIndex()== 2)
			   {
			    show.setText("Xiaomi 11i\nDisplay:Quad HD+ 1440*3168 pixels(451 ppi)\nBack Camera:Quad 108+8+2+2 Megapixel\nFront Camera:32 Megapixel\nOperating System:Android 12(MIUI 12.5)\nProcessor:Qualcomm Snapdragon 8 Gen 1 5G(4nm)\nRam:12 GB\nRom:256 GB\nBattery:6000 mAh\nPrice:48,999(Tk)");
			    show.setFont(new Font("Arial", Font.BOLD,13));
			    show.setEditable(false);
			   }
			 else if(cb3.getSelectedIndex()== 3)
			   {
			    show.setText("Xiaomi 11T\nDisplay:Quad HD+ 1440*3168 pixels(433 ppi)\nBack Camera:Quad 108+8+5+2 Megapixel\nFront Camera:32 Megapixel\nOperating System:Android 12(MIUI 12.5)\nProcessor:Qualcomm Snapdragon 8 Gen 1 5G(4nm)\nRam:8 GB\nRom:256 GB\nBattery:6000 mAh\nPrice:45,499(Tk)");
			    show.setFont(new Font("Arial", Font.BOLD,13));
			    show.setEditable(false);
			   }
		    }});
			b1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae)
				{

	                 if ((cb1.getSelectedIndex()) == 1) {
					 JOptionPane.showMessageDialog(null,"Your Payment Code is P-1648");
				     Payment frame= new Payment();
				     frame.setVisible(true);
					 setVisible(false);

                } else if ((cb2.getSelectedIndex()) == 1) {
                    JOptionPane.showMessageDialog(null,"Your Payment Code is P-1648");
				     Payment frame= new Payment();
				     frame.setVisible(true);
					 setVisible(false);
                } else if ((cb3.getSelectedIndex()) == 1) {
                     JOptionPane.showMessageDialog(null,"Your Payment Code is P-1648");
				     Payment frame= new Payment();
				     frame.setVisible(true);
				     setVisible(false);
					 }

			     else if((cb1.getSelectedIndex()) == 2)
					{
				     JOptionPane.showMessageDialog(null,"Your Payment Code is P-1648");
				     Payment frame= new Payment();
				     frame.setVisible(true);
					 setVisible(false);
					}
					else if((cb2.getSelectedIndex()) == 2)
					{
					JOptionPane.showMessageDialog(null,"Your Payment Code is P-1648");
				    setVisible(false);
				    Payment frame= new Payment();
				    frame.setVisible(true);
					setVisible(false);
					}
					else if((cb3.getSelectedIndex()) == 2)
					{
					JOptionPane.showMessageDialog(null,"Your Payment Code is P-1648");
				    Payment frame=new Payment();
				    frame.setVisible(true);
				    setVisible(false);
					}
					else if((cb1.getSelectedIndex()) == 3)
					{
					JOptionPane.showMessageDialog(null,"Your Payment Code is P-1648");
				    Payment frame=new Payment();
				    frame.setVisible(true);
					setVisible(false);
					}
					else if((cb2.getSelectedIndex()) == 3)
					{
					JOptionPane.showMessageDialog(null,"Your Payment Code is P-1648");
				    Payment frame=new Payment();
				    frame.setVisible(true);
					setVisible(false);
					}
					else if((cb3.getSelectedIndex()) == 3)
					{
					JOptionPane.showMessageDialog(null,"Your Payment Code is P-1648");
				    Payment frame=new Payment();
				    frame.setVisible(true);
				    setVisible(false);
					}
					else if((cb1.getSelectedIndex()) == 4)
					{
					JOptionPane.showMessageDialog(null,"Your Payment Code is P-1648");
				    Payment frame=new Payment();
				    frame.setVisible(true);
					setVisible(false);
					}
					else if((cb2.getSelectedIndex()) == 4)
					{
					JOptionPane.showMessageDialog(null,"Your Payment Code is P-1648");
				    Payment frame=new Payment();
				    frame.setVisible(true);
					setVisible(false);
					}
					else if((cb1.getSelectedIndex()) == 5)
					{
					JOptionPane.showMessageDialog(null,"Your Payment Code is P-1648");
				    Payment frame=new Payment();
				    frame.setVisible(true);
					setVisible(false);
					}
				else
				{
					JOptionPane.showMessageDialog(null,"You have not selected any phone!");

				}

			}});
		    b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{

                setVisible(false);
				new Smartphones();

			}
		    });
		    b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				setVisible(false);
				new Login();
			}
		    });
	}
}













