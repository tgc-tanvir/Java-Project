package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Iphones extends JFrame
{
	private JButton b1,b2,b3;
	private JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15;
	private JLabel l1;
	private JRadioButton r1;
	private JTextArea ta1;
	private ImageIcon img;
	private Container c;
	public Iphones()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Apple iphone");
        this.setSize(900,900);
		c=this.getContentPane();
		c.setLayout(null);
		try{
        img= new ImageIcon("images//iPhone_last.png");}
        catch(NullPointerException npe)
        {
            System.out.println("Image cannot be found!"+npe);
            npe.printStackTrace();
        }
		JLabel j= new JLabel("",img,JLabel.CENTER);
		j.setBounds(0,0,900,900);
		this.add(j);
		c1=new JCheckBox("Apple iPhone 8");
		c1.setBounds(230,90,230,30);
		j.add(c1);
		c2=new JCheckBox("Apple iPhone 8 Plus");
		c2.setBounds(230,120,230,30);
		j.add(c2);
		c3=new JCheckBox("Apple iPhone X");
		c3.setBounds(230,150,230,30);
		j.add(c3);
		c4=new JCheckBox("Apple iPhone XS");
		c4.setBounds(230,180,230,30);
		j.add(c4);
		c5=new JCheckBox("Apple iPhone SE");
		c5.setBounds(230,210,230,30);
		j.add(c5);
		c6=new JCheckBox("Apple iPhone 6S Plus");
		c6.setBounds(230,240,230,30);
		j.add(c6);
		c7=new JCheckBox("Apple iPhone 6S");
		c7.setBounds(230,270,230,30);
		j.add(c7);
		c8=new JCheckBox("Apple iPhone 7");
		c8.setBounds(230,300,230,30);
		j.add(c8);
		c9= new JCheckBox("Apple iPhone 7 Plus");
		c9.setBounds(480,90,230,30);
		j.add(c9);
		c10= new JCheckBox("Apple iPhone 11 Pro Max");
		c10.setBounds(480,120,230,30);
		j.add(c10);
		c11=new JCheckBox("Apple iPhone 12");
		c11.setBounds(480,150,230,30);
		j.add(c11);
		c12= new JCheckBox("Apple iPhone 12 Pro");
		c12.setBounds(480,180,230,30);
		j.add(c12);
		c13= new JCheckBox("Apple iPhone 13");
		c13.setBounds(480,210,230,30);
		j.add(c13);
		c14=new JCheckBox("Apple iPhone 13 Pro");
		c14.setBounds(480,240,230,30);
        j.add(c14);
		c15=new JCheckBox("Apple iPhone 13 Pro Max");
		c15.setBounds(480,270,230,30);
		j.add(c15);
		ButtonGroup bg1 =new ButtonGroup();
		bg1.add(c1);
		bg1.add(c2);
		bg1.add(c3);
		bg1.add(c4);
		bg1.add(c5);
		bg1.add(c6);
		bg1.add(c7);
		bg1.add(c8);
		bg1.add(c9);
		bg1.add(c10);
		bg1.add(c11);
		bg1.add(c12);
		bg1.add(c13);
		bg1.add(c14);
		bg1.add(c15);
		r1=new JRadioButton("Select an iPhone",true);
		r1.setBounds(350,47,180,30);
		r1.setFont(new Font("Arial",Font.BOLD,17));
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		j.add(r1);
		ta1= new JTextArea(5,5);
		ta1.setBounds(240,365,380,163);
		j.add(ta1);
		b1=new JButton("Buy");
		b1.setBounds(390,540,80,30);
		j.add(b1);
		b2=new JButton("Previous");
		b2.setBounds(710,0,90,20);
		j.add(b2);
		b3=new JButton("Logout");
		b3.setBounds(805,0,80,20);
		j.add(b3);
		l1=new JLabel("Specifications");
		l1.setBounds(367,325,350,35);
		l1.setFont(new Font("Serif",Font.BOLD,25));
		c.add(l1);
		l1.setForeground(Color.BLACK);
		l1.setBackground(Color.BLACK);
		j.add(l1);

		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		c1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Apple iPhone 8\nDisplay:750*1334 pixels(326 ppi)\nBack Camera:12 Megapixel\nFront Camera:7 Megapixel\nOperating System:iOS 11\nProcessor:Apple A11 Bionic(10nm)\nRam:2 GB\nRom:64 GB\nBattery:Lithium-polymer 1821 mAh\nPrice:64,999(Tk)");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Apple iPhone 8 Plus\nDisplay:Full HD 1080*1920 pixels(401 ppi)\nBack Camera:Dual 12+12 Megapixel\nFront Camera:7 Megapixel\nOperating System:iOS 11\nProcessor:Apple A11 Bionic(10nm)\nRam:3 GB\nRom:64 GB\nBattery:Lithium-ion 2691 mAh\nPrice:84,000(Tk)");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Apple iPhone X\nDisplay:Full HD+ 1125*2436 pixels(458 ppi)\nBack Camera:Dual 12+12 Megapixel\nFront Camera:7 Megapixel+SL 3D\nOperating System:iOS 11.1.1\nProcessor:Apple A11 Bionic(10nm)\nRam:3 GB\nRom:256 GB\nBattery:Lithium-ion 2716 mAh\nPrice:120,500(Tk)");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Apple iPhone XS\nDisplay:Full HD+ 1125*2436 pixels(458 ppi)\nBack Camera:Dual 12+12 Megapixel\nFront Camera:7 Megapixel+SL 3D\nOperating System:iOS 12\nProcessor:Apple A12 Bionic(7nm)\nRam:4 GB\nRom:256 GB\nBattery:Lithium-ion 2658 mAh\nPrice:115,000(Tk)");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Apple iPhone SE\nDisplay:750*1334 pixels(326 ppi)\nBack Camera:12 Megapixel\nFront Camera:7 Megapixel\nOperating System:iOS 13\nProcessor:Apple A13 Bionic(7nm+)\nRam:3 GB\nRom:128 GB\nBattery:Lithium-polymer 1821 mAh\nPrice:57,990(Tk)");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Apple iPhone 6S Plus\nDisplay:Full HD 1080*1920 pixels(401 ppi)\nBack Camera:12 Megapixel\nFront Camera:5 Megapixel\nOperating System:iOS 9\nProcessor:Apple A9(14nm)\nRam:2 GB\nRom:64 GB\nBattery:Lithium-ion 2750 mAh\nPrice:44,999(Tk)");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Apple iPhone 6S\nDisplay:750*1334 pixels(326 ppi)\nBack Camera:12 Megapixel\nFront Camera:5 Megapixel\nOperating System:iOS 9\nProcessor:Apple A9(14nm)\nRam:2 GB\nRom:64 GB\nBattery:Lithium-ion 1715 mAh\nPrice:34,999(Tk)");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Apple iPhone 7\nDisplay:750*1334 pixels(326 ppi)\nBack Camera:12 Megapixel\nFront Camera:7 Megapixel\nOperating System:iOS 10.0.1\nProcessor:Apple A10 Fusion(16nm)\nRam:2 GB\nRom:128 GB\nBattery:Lithium-ion 1960 mAh\nPrice:43,999(Tk)");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Apple iPhone 7 Plus\nDisplay:Full HD 1080*1920 pixels(401 ppi)\nBack Camera:Dual 12+12 Megapixel\nFront Camera:7 Megapixel\nOperating System:iOS 10.0.1\nProcessor:Apple A10 Fusion(16nm)\nRam:3 GB\nRom:128 GB\nBattery:Lithium-ion 2900 mAh\nPrice:47,999(Tk)");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Apple iPhone 11 Pro Max\nDisplay:Quad HD+ 1242*2688 pixels(458 ppi)\nBack Camera:Triple 12+12+12 Megapixel\nFront Camera:Dual 12 Megapixel+SL 3D\nOperating System:iOS 13\nProcessor:Apple A13 Bionic(7nm+)\nRam:4 GB\nRom:256 GB\nBattery:Lithium-ion 3969 mAh\nPrice:144,999(Tk)");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c11.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Apple iPhone 12\nDisplay:Quad HD+ 1170*2532 pixels(460 ppi)\nBack Camera:Dual 12+12 Megapixel\nFront Camera:Dual 12 Megapixel+SL 3D\nOperating System:iOS 14\nProcessor:Apple A14 Bionic(5nm)\nRam:6 GB\nRom:128 GB\nBattery:Lithium-ion 2345 mAh\nPrice:124,999(Tk)");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Apple iPhone 12 Pro\nDisplay:Quad HD+ 1170*2532 pixels(460 ppi)\nBack Camera:Quad 12+12+12 Megapixel+TOF 3D\nFront Camera:Dual 12 Megapixel+SL 3D\nOperating System:iOS 14\nProcessor:Apple A14 Bionic(5nm)\nRam:6 GB\nRom:256 GB\nBattery:Lithium-ion 2345 mAh\nPrice:146,999(Tk)");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c13.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Apple iPhone 13\nDisplay:Quad HD+ 1170*2532 pixels(460 ppi)\nBack Camera:Dual 12+12 Megapixel\nFront Camera:Dual 12 Megapixel+SL 3D\nOperating System:iOS 15\nProcessor:Apple A15 Bionic(5nm)\nRam:4 GB\nRom:256 GB\nBattery:Lithium-ion 3240 mAh\nPrice:133,499(Tk)");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c14.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Apple iPhone 13 Pro\nDisplay:Quad HD+ 1170*2532 pixels(460 ppi)\nBack Camera:Quad 12+12+12 Megapixel\nFront Camera:Dual 12 Megapixel+SL 3D\nOperating System:iOS 15\nProcessor:Apple A15 Bionic(5nm)\nRam:6 GB\nRom:512 GB\nBattery:Lithium-ion 3095 mAh\nPrice:162,999(Tk)");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c15.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Apple iPhone 13 Pro Max\nDisplay:Quad HD+ 1284*2778 pixels(458 ppi)\nBack Camera:Quad 12+12+12 Megapixel+TOF 3D\nFront Camera:Dual 12 Megapixel+SL 3D\nOperating System:iOS 15\nProcessor:Apple A15 Bionic(5nm)\nRam:6 GB\nRom:128 GB\nBattery:Lithium-ion 4352 mAh\nPrice:176,999(Tk)");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
                if(c1.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-1211");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c2.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-1211");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c3.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-1211");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c4.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-1211");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c5.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-1211");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c6.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-1211");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c7.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-1211");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c8.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-1211");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c9.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-1211");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c10.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-1211");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if (c11.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-1211");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c12.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-1211");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c13.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-1211");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c14.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-1211");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c15.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-1211");
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
				PhoneTypes frame= new PhoneTypes();
				frame.setVisible(true);

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









