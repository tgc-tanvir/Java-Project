package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class OnePlus extends JFrame
{
	private JButton b1,b2,b3;
	private JCheckBox c1,c2,c3,c4,c5,c6,c7,c8;
	private JLabel l1,l2;
	private JRadioButton r1,r2,r3;
	private JTextArea ta1;
	private ImageIcon img;
	private Container c;
	public OnePlus()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("OnePlus Phones");
		c=this.getContentPane();
		c.setLayout(null);
		try{
        img= new ImageIcon("images//oneplus_logo.png");}
        catch(NullPointerException npe)
        {
            System.out.println("Image cannot be found!"+npe);
            npe.printStackTrace();
        }
		JLabel j= new JLabel("",img,JLabel.CENTER);
		j.setBounds(0,0,900,900);
		this.add(j);
		l1=new JLabel("Please Select a Price Range");
		l1.setBounds(50,50,350,30);
		l1.setFont(new Font("Arial",Font.BOLD,22));
		c.add(l1);
		l1.setForeground(Color.decode("#006aff"));
		l1.setBackground(Color.BLACK);
		j.add(l1);
		c1=new JCheckBox("OnePlus Nord CE 2 5G");
		c1.setBounds(50,130,230,30);
		j.add(c1);
		c2=new JCheckBox("OnePlus Nord 2 5G");
		c2.setBounds(50,170,230,30);
		j.add(c2);
		c3=new JCheckBox("OnePlus Nord N10 5G");
		c3.setBounds(50,210,230,30);
		j.add(c3);
		c4=new JCheckBox("OnePlus 8T");
		c4.setBounds(50,250,230,30);
		j.add(c4);
		c5=new JCheckBox("OnePlus 8");
		c5.setBounds(50,290,230,30);
		j.add(c5);
		c6=new JCheckBox("OnePlus 10 Pro 5G");
		c6.setBounds(297,130,230,30);
		j.add(c6);
		c7=new JCheckBox("OnePlus 8 Pro");
		c7.setBounds(297,170,230,30);
		j.add(c7);
		c8=new JCheckBox("OnePlus 7 Pro");
		c8.setBounds(297,210,230,30);
		j.add(c8);
		ButtonGroup bg1 =new ButtonGroup();
		bg1.add(c1);
		bg1.add(c2);
		bg1.add(c3);
		bg1.add(c4);
		bg1.add(c5);
		bg1.add(c6);
		bg1.add(c7);
		bg1.add(c8);
		r1=new JRadioButton("Price Range 30k-70k",true);
		r1.setBounds(50,100,230,30);
		r2=new JRadioButton("Price Range 70k+",true);
		r2.setBounds(297,100,230,30);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		j.add(r1);
		j.add(r2);
		ta1= new JTextArea(5,5);
		ta1.setBounds(50,365,380,163);
		j.add(ta1);
		b1=new JButton("Buy");
		b1.setBounds(180,556,80,30);
		j.add(b1);
		b2=new JButton("Previous");
		b2.setBounds(710,0,90,20);
		j.add(b2);
		b3=new JButton("Logout");
		b3.setBounds(805,0,80,20);
		j.add(b3);
		l2=new JLabel("Specifications");
		l2.setBounds(165,320,350,35);
		l2.setFont(new Font("Serif",Font.BOLD,25));
		j.add(l2);
		this.setSize(900,900);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		c1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("OnePlus Nord CE 2 5G\nDisplay:Full HD+ 1080*2400 pixels(409 ppi)\nBack Camera:Triple 64+8+2 Megapixel\nFront Camera:16 Megapixel\nOperating System:Android 11(OxygenOS 11)\nProcessor:MediaTek Dimensity 900 5G(6nm)\nRam:8 GB\nRom:128 GB\nBattery:Lithium-polymer 4500 mAh\nPrice:34,990(Tk)");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("OnePlus Nord 2 5G\nDisplay:Full HD+ 1080*2400 pixels(409 ppi)\nBack Camera:Triple 50+8+2 Megapixel\nFront Camera:32 Megapixel\nOperating System:Android 11(OxygenOS 11.3)\nProcessor:MediaTek Dimensity 1200 5G(6nm)\nRam:12 GB\nRom:256 GB\nBattery:Lithium-polymer 4500 mAh\nPrice:44,990(Tk)");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("OnePlus Nord N10 5G\nDisplay:Full HD+ 1080*2400 pixels(406 ppi)\nBack Camera:Quad 64+8+2+2 Megapixel\nFront Camera:16 Megapixel\nOperating System:Android 10(OxygenOS 10.5)\nProcessor:Qualcomm Snapdragon 690 5G(8nm)\nRam:6 GB\nRom:128 GB\nBattery:Lithium-polymer 4300 mAh\nPrice:34,990(Tk)");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("OnePlus 8T\nDisplay:Full HD+ 1080*2400 pixels(402 ppi)\nBack Camera:Quad 48+16+5+2 Megapixel\nFront Camera:16 Megapixel\nOperating System:Android 10(OxygenOS 10)\nProcessor:Qualcomm Snapdragon 865(7nm+)\nRam:8 GB\nRom:128 GB\nBattery:Lithium-polymer 4500 mAh\nPrice:49,990(Tk)");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("OnePlus 8\nDisplay:Full HD+ 1080*2400 pixels(402 ppi)\nBack Camera:Triple 48+16+2 Megapixel\nFront Camera:16 Megapixel\nOperating System:Android 10(OxygenOS 10)\nProcessor:Qualcomm Snapdragon 865(7nm+)\nRam:8 GB\nRom:128 GB\nBattery:Lithium-polymer 4300 mAh\nPrice:54,990(Tk)");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("OnePlus 10 Pro 5G\nDisplay:QHD+ 1440*3216 pixels(525 ppi)\nBack Camera:Triple 48+8+50 Megapixel\nFront Camera:32 Megapixel\nOperating System:Android 12(OxygenOS 12.1)\nProcessor:Qualcomm Snapdragon 8 Gen 1(4nm)\nRam:12 GB\nRom:256 GB\nBattery:Lithium-polymer 5000 mAh\nPrice:94,990(Tk)");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("OnePlus 8 Pro\nDisplay:QHD+ 1440*3168 pixels(513 ppi)\nBack Camera:Quad 48+8+48+5 Megapixel\nFront Camera:16 Megapixel\nOperating System:Android 10(OxygenOS 10)\nProcessor:Qualcomm Snapdragon 865(7nm+)\nRam:12 GB\nRom:256 GB\nBattery:Lithium-polymer 4510 mAh\nPrice:94,990(Tk)");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("OnePlus 7 Pro\nDisplay:Quad HD+ 1440*3120 pixels(516 ppi)\nBack Camera:Triple 12+12+16 Megapixel\nFront Camera:16 Megapixel\nOperating System:Android Pie v9.0\nProcessor:Qualcomm Snapdragon 855(7nm)\nRam:8 GB\nRom:256 GB\nBattery:Lithium-ion 4000 mAh\nPrice:72,990(Tk)");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				if(c1.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-5348");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c2.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-5348");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c3.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-5348");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c4.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-5348");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c5.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-5348");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c6.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-5348");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c7.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-5348");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c8.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-5348");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"You forgot to select any phone!");
				}
			}
		});
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








