package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import classes.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Samsung extends JFrame
{
	private JButton b1,b2,b3;
	private JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15;
	private JLabel l1,l2;
	private JRadioButton r1,r2,r3;
	private JTextArea ta1,ta2;
	private ImageIcon img;
	public Samsung()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Samsung Phones");
		try{
        img= new ImageIcon("images//samsung.jpg");}
        catch(NullPointerException npe)
        {
            System.out.println("Image cannot be found!"+npe);
            npe.printStackTrace();
        }
		JLabel j=new JLabel("",img,JLabel.CENTER);
		j.setBounds(0,0,900,900);
		this.add(j);
		c1=new JCheckBox("Samsung Galaxy A13");
		c1.setBounds(100,130,230,30);
		j.add(c1);
		c2=new JCheckBox("Samsung Galaxy F22");
		c2.setBounds(100,170,230,30);
		j.add(c2);
		c3=new JCheckBox("Samsung Galaxy M12");
		c3.setBounds(100,210,230,30);
		j.add(c3);
		c4=new JCheckBox("Samsung Galaxy A03s");
		c4.setBounds(100,250,230,30);
		j.add(c4);
		c5=new JCheckBox("Samsung Galaxy A03");
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
		this.add(l1);
		r1=new JRadioButton("Price Range 10k-30k");
		r1.setBounds(100,100,230,30);
		c6=new JCheckBox("Samsung Galaxy A23");
		c6.setBounds(350,130,230,30);
		c7=new JCheckBox("Samsung Galaxy F23 5G");
		c7.setBounds(350,170,230,30);
		c8=new JCheckBox("Samsung Galaxy M33 5G");
		c8.setBounds(350,210,230,30);
		c9=new JCheckBox("Samsung Galaxy A52");
		c9.setBounds(350,250,230,30);
		c10=new JCheckBox("Samsung Galaxy M53 5G");
		c10.setBounds(350,290,230,30);
		c11=new JCheckBox("Samsung Galaxy A52s 5G");
		c11.setBounds(350,330,230,30);
		ta1=new JTextArea(5,5);
		ta1.setBounds(260,410,395,163);
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
		r2=new JRadioButton("Price Range 30k-60k");
		r2.setBounds(350,100,230,30);
		r3=new JRadioButton("Price Range 60k+");
		r3.setBounds(600,100,230,30);
		c12=new JCheckBox("Samsung Galaxy S21 FE 5G");
		c12.setBounds(600,130,230,30);
		c13=new JCheckBox("Samsung Galaxy A73 5G");
		c13.setBounds(600,170,230,30);
		c14=new JCheckBox("Samsung Galaxy S22+");
		c14.setBounds(600,210,230,30);
		c15=new JCheckBox("Samsung Galaxy S22 Ultra");
		c15.setBounds(600,250,230,30);
		bg1.add(c12);
		bg1.add(c13);
		bg1.add(c14);
		bg1.add(c15);
		l2=new JLabel("Specifications");
		l2.setBounds(375,370,350,35);
		l2.setFont(new Font("Serif",Font.BOLD,25));
		j.add(l2);
		b1=new JButton("Buy");
		b1.setBounds(417,580,80,30);
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
		this.setLayout(null);
		this.setVisible(true);
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
                if(c1.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-2341");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c2.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-2341");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c3.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-2341");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c4.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-2341");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c5.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-2341");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c6.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-2341");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c7.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-2341");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c8.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-2341");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c9.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-2341");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c10.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-2341");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if (c11.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-2341");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c12.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-2341");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c13.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-2341");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c14.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-2341");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c15.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-2341");
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
		b2=new JButton("Previous");
		b2.setBounds(710,0,90,20);
		this.add(b2);
		b3=new JButton("Logout");
		b3.setBounds(805,0,80,20);
		this.add(b3);
		c1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Samsung Galaxy A13\nDisplay:Full HD+ 1080*2408 pixels(400 ppi)\nBack Camera:Quad 50+5+2+2 Megapixel\nFront Camera:8 Megapixel\nOperating System:Android 12(One UI 4.1)\nProcessor:Exynos 850(8nm)\nRam:6 GB\nRom:128 GB\nBattery:Lithium-polymer 5000 mAh\nPrice:23,999(Tk)");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
	    c2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Samsung Galaxy F22\nDisplay:HD+ 720*1600 pixels(274 ppi)\nBack Camera:Quad 48+8+2+2 Megapixel\nFront Camera:13 Megapixel\nOperating System:Android 11(One UI Core 3.1)\nProcessor:MediaTek Helio G80(12nm)\nRam:6 GB\nRom:128 GB\nBattery:Lithium-polymer 6000 mAh\nPrice:23,999(Tk)");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);

			}
		});
		c3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Samsung Galaxy M12\nDisplay:HD+ 720*1600 pixels(270 ppi)\nBack Camera:Quad 48+5+2+2 Megapixel\nFront Camera:8 Megapixel\nOperating System:Android 11(One UI 3.1)\nProcessor:Exynos 850(8nm)\nRam:6 GB\nRom:128 GB\nBattery:Lithium-polymer 6000 mAh\nPrice:23,499(Tk)");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Samsung Galaxy A03s\nDisplay:HD+ 720*1600 pixels(270 ppi)\nBack Camera:Triple 13+2+2 Megapixel\nFront Camera:5 Megapixel\nOperating System:Android 11(One UI 3.1 Core)\nProcessor:MediaTek Helio P35(12nm)\nRam:4 GB\nRom:64 GB\nBattery:Lithium-polymer 5000 mAh\nPrice:17,499(Tk)");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Samsung Galaxy A03\nDisplay:HD+ 720*1600 pixels(270 ppi)\nBack Camera:Dual 48+2 Megapixel\nFront Camera:5 Megapixel\nOperating System:Android 11\nProcessor:Unisoc T606(12nm)\nRam:4 GB\nRom:64 GB\nBattery:Lithium-polymer 5000 mAh\nPrice:15,999(Tk)");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Samsung Galaxy A23\nDisplay:Full HD+ 1080*2408 pixels(400 ppi)\nBack Camera:Quad 50+5+2+2 Megapixel\nFront Camera:8 Megapixel\nOperating System:Android 12(One UI 4.1)\nProcessor:Qualcomm Snapdragon 680 4G(6nm)\nRam:6 GB\nRom:128 GB\nBattery:Lithium-polymer 5000 mAh\nPrice:31,599(Tk)");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
                ta1.setEditable(false);
			}
		});
		c7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Samsung Galaxy F23 5G\nDisplay:Full HD+ 1080*2408 pixels(400 ppi)\nBack Camera:Triple 50+8+2 Megapixel\nFront Camera:8 Megapixel\nOperating System:Android 12(One UI 4.1)\nProcessor:Qualcomm Snapdragon 750 5G(8nm)\nRam:6 GB\nRom:128 GB\nBattery:Lithium-polymer 5000 mAh\nPrice:31,999(Tk)");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});

		c8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Samsung Galaxy M33 5G\nDisplay:Full HD+ 1080*2408 pixels(400 ppi)\nBack Camera:Quad 50+5+2+2 Megapixel\nFront Camera:8 Megapixel\nOperating System:Android 12(One UI 4.1)\nProcessor:Exynos 1280(5nm)\nRam:8 GB\nRom:128 GB\nBattery:Lithium-polymer 6000 mAh\nPrice:35,599(Tk)");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Samsung Galaxy A52\nDisplay:Full HD+ 1080*2400 pixels(405 ppi)\nBack Camera:Quad 64+12+5+5 Megapixel\nFront Camera:32 Megapixel\nOperating System:Android 11(One UI 3.1)\nProcessor:Qualcomm Snapdragon 720G(8nm)\nRam:8 GB\nRom:128 GB\nBattery:Lithium-polymer 4500 mAh\nPrice:39,999(Tk)");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Samsung Galaxy M53 5G\nDisplay:Full HD+ 1080*2408 pixels(394 ppi)\nBack Camera:Quad 108+8+2+2 Megapixel\nFront Camera:32 Megapixel\nOperating System:Android 12(One UI 4.1)\nProcessor:MediaTek Dimensity 900(6nm)\nRam:8 GB\nRom:128 GB\nBattery:Lithium-polymer 5000 mAh\nPrice:48,999(Tk)");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c11.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Samsung Galaxy A52s 5G\nDisplay:Full HD+ 1080*2400 pixels(405 ppi)\nBack Camera:Quad 64+12+5+5 Megapixel\nFront Camera:32 Megapixel\nOperating System:Android 11(One UI 3.1)\nProcessor:Qualcomm Snapdragon 778G 5G(6nm)\nRam:8 GB\nRom:128 GB\nBattery:Lithium-polymer 4500 mAh\nPrice:57,499(Tk)");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
        c12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Samsung Galaxy S21 FE 5G\nDisplay:Full HD+ 1080*2400 pixels(411 ppi)\nBack Camera:Triple 12+8+12 Megapixel\nFront Camera:32 Megapixel\nOperating System:Android 12(One UI 4.1)\nProcessor:Exynos 2100(5nm)\nRam:8 GB\nRom:128 GB\nBattery:Lithium-polymer 4500 mAh\nPrice:86,699(Tk)");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c13.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Samsung Galaxy A73 5G\nDisplay:Full HD+ 1080*2400 pixels(393 ppi)\nBack Camera:Quad 108+12+5+5 Megapixel\nFront Camera:32 Megapixel\nOperating System:Android 12(One UI 4.1)\nProcessor:Qualcomm Snapdragon 778G 5G(6nm)\nRam:8 GB\nRom:256 GB\nBattery:Lithium-polymer 5000 mAh\nPrice:74,499(Tk)");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c14.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Samsung Galaxy S22+\nDisplay:Full HD+ 1080*2340 pixels(393 ppi)\nBack Camera:Triple 50+10+12 Megapixel\nFront Camera:10 Megapixel\nOperating System:Android 12(One UI 4.1)\nProcessor:Qualcomm Snapdragon 8 Gen 1(4nm)\nRam:8 GB\nRom:256 GB\nBattery:Lithium-ion 4500 mAh\nPrice:142,999(Tk)");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c15.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Samsung Galaxy S22 Ultra\nDisplay:Qual HD+ 1440*3088 pixels(Dynamic AMOLED)\nBack Camera:Quad 108+10+10+12 Megapixel\nFront Camera:40 Megapixel\nOperating System:Android 12(One UI 4.1)\nProcessor:Qualcomm Snapdragon 8 Gen 1(4nm)\nRam:12 GB\nRom:256 GB\nBattery:Lithium-ion 5000 mAh\nPrice:179,999(Tk)");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
	}
}











