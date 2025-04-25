package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class Realme extends JFrame
{
	private JButton b1,b2,b3;
	private JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15;
	private JLabel l1,l2;
	private JRadioButton r1,r2,r3;
	private JTextArea ta1;
	private ImageIcon img;
	private Container c;
	public Realme()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Realme Phones");
		c=this.getContentPane();
		c.setLayout(null);
		try{
        img= new ImageIcon("images//realme_logo.jpg");}
        catch(NullPointerException npe)
        {
            System.out.println("Image cannot be found!"+npe);
            npe.printStackTrace();
        }
		JLabel j= new JLabel("",img,JLabel.CENTER);
		j.setBounds(0,0,900,900);
		this.add(j);
		c1=new JCheckBox("Realme C31");
		c1.setBounds(100,130,230,30);
		j.add(c1);
		c2=new JCheckBox("Realme Narzo 50i");
		c2.setBounds(100,170,230,30);
		j.add(c2);
		c3=new JCheckBox("Realme C25");
		c3.setBounds(100,210,230,30);
		j.add(c3);
		c4=new JCheckBox("Realme Narzo 20");
		c4.setBounds(100,250,230,30);
		j.add(c4);
		c5=new JCheckBox("Realme Narzo 50A Prime");
		c5.setBounds(100,290,230,30);
		j.add(c5);
		ButtonGroup bg1 =new ButtonGroup();
		bg1.add(c1);
		bg1.add(c2);
		bg1.add(c3);
		bg1.add(c4);
		bg1.add(c5);
		l1=new JLabel("Please Select a Price Range");
		l1.setBounds(350,50,350,30);
		l1.setFont(new Font("Arial",Font.BOLD,23));
		c.add(l1);
		l1.setForeground(Color.BLUE);
		l1.setBackground(Color.BLUE);
		j.add(l1);
		r1=new JRadioButton("Price Range 10k-25k");
		r1.setBounds(100,100,230,30);
		c6=new JCheckBox("Realme 9");
		c6.setBounds(100,330,230,30);
		c7=new JCheckBox("Realme 9i");
		c7.setBounds(100,370,230,30);
		c8=new JCheckBox("Realme 8 5G");
		c8.setBounds(100,410,230,30);
		c9=new JCheckBox("Realme 9 Pro");
		c9.setBounds(350,130,230,30);
		c10=new JCheckBox("Realme 9 Pro+");
		c10.setBounds(350,170,230,30);
		c11=new JCheckBox("Realme 7 Pro");
		c11.setBounds(350,210,230,30);
		ta1=new JTextArea(5,5);
		ta1.setBounds(480,330,360,185);
		bg1.add(c6);
		bg1.add(c7);
		bg1.add(c8);
		bg1.add(c9);
		bg1.add(c10);
		bg1.add(c11);
		j.add(c6);
		j.add(c7);
		j.add(c8);
		j.add(c9);
		j.add(c10);
		j.add(c11);
		r2=new JRadioButton("Price Range 25k-40k");
		r2.setBounds(350,100,230,30);
		r3=new JRadioButton("Price Range 40k+");
		r3.setBounds(600,100,230,30);
		c12=new JCheckBox("Realme GT Master Edition");
		c12.setBounds(350,250,230,30);
		c13=new JCheckBox("Realme GT Neo2");
		c13.setBounds(600,130,230,30);
		c14=new JCheckBox("Realme GT 2 Pro 5G");
		c14.setBounds(600,170,230,30);
		c15=new JCheckBox("Realme GT Neo3 5G");
		c15.setBounds(600,210,230,30);
		bg1.add(c12);
		bg1.add(c13);
		bg1.add(c14);
		bg1.add(c15);
		l2=new JLabel("Specifications");
		l2.setBounds(583,292,330,35);
		l2.setFont(new Font("Serif",Font.BOLD,25));
		c.add(l2);
		l2.setForeground(Color.BLUE);
		l2.setBackground(Color.BLUE);
		j.add(l2);
		b1=new JButton("Buy");
		b1.setBounds(625,550,80,30);
		j.add(b1);
		b2=new JButton("Previous");
		b2.setBounds(710,0,90,20);
		j.add(b2);
		b3=new JButton("Logout");
		b3.setBounds(805,0,80,20);
		j.add(b3);
		j.add(c12);
		j.add(c13);
		j.add(c14);
		j.add(c15);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		j.add(r1);
		j.add(r2);
		j.add(r3);
		j.add(ta1);
		this.setSize(900,900);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
                if(c1.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-3456");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c2.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-3456");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c3.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-3456");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c4.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-3456");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c5.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-3456");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c6.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-3456");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c7.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-3456");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c8.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-3456");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c9.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-3456");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c10.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-3456");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if (c11.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-3456");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c12.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-3456");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c13.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-3456");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c14.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-3456");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c15.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-3456");
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
		c1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Realme C31\nDisplay:HD+ 720*1600 pixels(270 ppi)\nBack Camera:Triple 13+2+0.3 Megapixel\nFront Camera:5 Megapixel\nOperating System:Android 11(Realme UI 2.0)\nProcessor:UniSOC Tiger T612(12nm)\nRam:4 GB\nRom:64 GB\nBattery:Lithium-polymer 5000 mAh\nPrice:14,490(Tk)");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
	    c2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Realme Narzo 50i\nDisplay:HD+ 720*1600 pixels(270 ppi)\nBack Camera:8 Megapixel\nFront Camera:5 Megapixel\nOperating System:Android 11(Realme Go UI)\nProcessor:UniSOC T610(12nm)\nRam:4 GB\nRom:64 GB\nBattery:Lithium-polymer 6000 mAh\nPrice:12,490(Tk)");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);

			}
		});
		c3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Realme C25\nDisplay:HD+ 720*1600 pixels(270 ppi)\nBack Camera:Triple 13+2+2 Megapixel\nFront Camera:8 Megapixel\nOperating System:Android 11(Realme UI 2.0)\nProcessor:MediaTek Helio G70\nRam:4 GB\nRom:64 GB\nBattery:Lithium-polymer 6000 mAh\nPrice:14,990(Tk)");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Realme Narzo 20\nDisplay:HD+ 720*1600 pixels(270 ppi)\nBack Camera:Triple 48+8+2 Megapixel\nFront Camera:8 Megapixel\nOperating System:Android 10(Realme UI)\nProcessor:MediaTek Helio G85\nRam:4 GB\nRom:64 GB\nBattery:Lithium-polymer 6000 mAh\nPrice:13,990(Tk)");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Realme Narzo 50A Prime\nDisplay:Full HD+ 1080*2408 pixels(400 ppi)\nBack Camera:Triple 50+2+0.3 Megapixel\nFront Camera:8 Megapixel\nOperating System:Android 11(Realme UI 2.0)\nProcessor:UniSOC Tiger T612(12nm)\nRam:4 GB\nRom:128 GB\nBattery:Lithium-polymer 5000 mAh\nPrice:17,990(Tk)");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Realme 9\nDisplay:Full HD+ 1080*2400 pixels(411 ppi)\nBack Camera:Triple 108+8+2 Megapixel\nFront Camera:16 Megapixel\nOperating System:Android 12(Realme UI 3.0)\nProcessor:Qualcomm Snapdragon 680(6nm)\nRam:6 GB\nRom:128 GB\nBattery:Lithium-polymer 5000 mAh\nPrice:24,990(Tk)");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
                ta1.setEditable(false);
			}
		});
		c7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Realme 9i\nDisplay:Full HD+ 1080*2412 pixels(400 ppi)\nBack Camera:Triple 50+2+2 Megapixel\nFront Camera:16 Megapixel\nOperating System:Android 11(Realme UI 2.0)\nProcessor:Qualcomm Snapdragon 680(6nm)\nRam:6 GB\nRom:128 GB\nBattery:Lithium-polymer 5000 mAh\nPrice:23,490(Tk)");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});

		c8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Realme 8 5G\nDisplay:Full HD+ 1080*2400 pixels(405 ppi)\nBack Camera:Triple 48+2+2 Megapixel\nFront Camera:16 Megapixel\nOperating System:Android 11(Realme UI 2.0)\nProcessor:MediaTek Dimensity 700 5G(7nm)\nRam:8 GB\nRom:128 GB\nBattery:Lithium-polymer 5000 mAh\nPrice:22,990(Tk)");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Realme 9 Pro\nDisplay:Full HD+ 1080*2412 pixels(400 ppi)\nBack Camera:Triple 64+8+2 Megapixel\nFront Camera:16 Megapixel\nOperating System:Android 12(Realme UI 3.0)\nProcessor:Qualcomm Snapdragon 695 5G(6nm)\nRam:8 GB\nRom:128 GB\nBattery:Lithium-polymer 5000 mAh\nPrice:31,990(Tk)");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Realme 9 Pro+\nDisplay:Full HD+ 1080*2400 pixels(411 ppi)\nBack Camera:Triple 50+8+2 Megapixel\nFront Camera:16 Megapixel\nOperating System:Android 12(Realme UI 3.0)\nProcessor:MediaTek Dimensity 920(6nm)\nRam:8 GB\nRom:128 GB\nBattery:Lithium-polymer 4500 mAh\nPrice:39,990(Tk)");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c11.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Realme 7 Pro\nDisplay:Full HD+ 1080*2400 pixels(411 ppi)\nBack Camera:Quad 64+8+2+2 Megapixel\nFront Camera:32 Megapixel\nOperating System:Android 10(Realme UI)\nProcessor:Qualcomm Snapdragon 720G(8nm)\nRam:8 GB\nRom:128 GB\nBattery:Lithium-polymer 4500 mAh\nPrice:27,990(Tk)");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
        c12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Realme GT Master Edition\nDisplay:QHD+ 1440*3088 pixels(Dynamic Amoled)\nBack Camera:Quad 108+8+5+2 Megapixel\nFront Camera:32 Megapixel\nOperating System:Android 12(Realme UI 3.0)\nProcessor:Qualcomm Snapdragon 832G(4nm)\nRam:8 GB\nRom:128 GB\nBattery:Lithium-polymer 6000 mAh\nPrice:42,990(Tk)");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c13.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Realme GT Neo2\nDisplay:QHD+ 1440*3088 pixels(411 ppi)\nBack Camera:Triple 50+8+2 Megapixel\nFront Camera:32 Megapixel\nOperating System:Android 12(Realme UI 3.0)\nProcessor:MediaTek Dimensity 8100(4nm)\nRam:8 GB\nRom:128 GB\nBattery:Lithium-polymer 5000 mAh\nPrice:42,999(Tk)");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c14.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Realme GT 2 Pro 5G\nDisplay:QHD+ 1440*3216 pixels(422 ppi)\nBack Camera:Triple 50+50+3 Megapixel\nFront Camera:32 Megapixel\nOperating System:Android 12(Realme UI 3.0)\nProcessor:Qualcomm Snapdragon 8 Gen 1(4nm)\nRam:8 GB\nRom:128 GB\nBattery:Lithium-polymer 5000 mAh\nPrice:47,990(Tk)");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c15.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Realme GT Neo3 5G\nDisplay:Full HD+ 1080*2412 pixels(411 ppi)\nBack Camera:Triple 50+8+2 Megapixel\nFront Camera:16 Megapixel\nOperating System:Android 12(Realme UI 3.0)\nProcessor:MediaTek Dimensity 8100(4nm)\nRam:12 GB\nRom:256 GB\nBattery:Lithium-polymer 5000 mAh\nPrice:42,999(Tk)");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
	}
}









