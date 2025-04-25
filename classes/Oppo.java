package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppo extends JFrame
{
	private JButton b1,b2,b3;
	private JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15;
	private JLabel l1,l2;
	private JRadioButton r1,r2,r3;
	private JTextArea ta1,ta2;
	private ImageIcon img;
	private Container c;
	public Oppo()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Oppo Smartphone");
        c=this.getContentPane();
        c.setLayout(null);
		try {
		img= new ImageIcon("images//oppo_logo.jpg");}
	    catch (NullPointerException npe)
	    {
		System.out.println("Picture cannot be found"+npe);
		npe.printStackTrace();
		}
	    JLabel j=new JLabel("",img,JLabel.CENTER);
		j.setBounds(0,0,900,900);
		this.add(j);
		c1=new JCheckBox("Oppo A16e");
		c1.setBounds(100,130,230,30);
		j.add(c1);
		c2=new JCheckBox("Oppo A16");
		c2.setBounds(100,170,230,30);
		j.add(c2);
		c3=new JCheckBox("Oppo A53");
		c3.setBounds(100,210,230,30);
		j.add(c3);
		c4=new JCheckBox("Oppo A54");
		c4.setBounds(100,250,230,30);
		j.add(c4);
		c5=new JCheckBox("Oppo F19");
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
		r1=new JRadioButton("Price Range 10k-25k");
		r1.setBounds(100,100,230,30);
		c6=new JCheckBox("Oppo F19 Pro");
		c6.setBounds(100,330,230,30);
		c7=new JCheckBox("Oppo F17 Pro");
		c7.setBounds(350,130,230,30);
		c8=new JCheckBox("Oppo A95");
		c8.setBounds(350,170,230,30);
		c9=new JCheckBox("Oppo Reno6");
		c9.setBounds(350,210,230,30);
		c10=new JCheckBox("Oppo F21 Pro");
		c10.setBounds(350,250,230,30);
		c11=new JCheckBox("Oppo F21 Pro 5G");
		c11.setBounds(350,290,230,30);
		ta1=new JTextArea(5,5);
		ta1.setBounds(260,430,395,163);
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
		c12=new JCheckBox("Oppo Reno7");
		c12.setBounds(600,130,230,30);
		c13=new JCheckBox("Oppo Reno8 5G");
		c13.setBounds(600,170,230,30);
		c14=new JCheckBox("Oppo Reno8 Lite");
		c14.setBounds(600,210,230,30);
		c15=new JCheckBox("Oppo Reno8 Pro");
		c15.setBounds(600,250,230,30);
		bg1.add(c12);
		bg1.add(c13);
		bg1.add(c14);
		bg1.add(c15);
		l2=new JLabel("Specifications");
		l2.setBounds(375,383,350,35);
		l2.setFont(new Font("Serif",Font.BOLD,25));
		c.add(l2);
		l2.setForeground(Color.BLUE);
		l2.setBackground(Color.BLUE);
		b1=new JButton("Buy");
		b1.setBounds(417,600,80,30);
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
		j.add(l1);
		j.add(l2);
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
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-3674");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c2.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-3674");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c3.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-3674");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c4.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-3674");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c5.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-3674");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c6.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-3674");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c7.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-3674");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c8.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-3674");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c9.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-3674");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c10.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-3674");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if (c11.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-3674");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c12.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-3674");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c13.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-3674");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c14.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-3674");
				 setVisible(false);
				 Payment frame=new Payment();
				 frame.setVisible(true);
				}
				else if(c15.isSelected())
				{
				 JOptionPane.showMessageDialog(null,"Your Payment Code is P-3674");
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
				ta1.setText("Oppo A16e\nDisplay:HD+ 720*1600 pixels(269 ppi)\nBack Camera:13 Megapixel\nFront Camera:5 Megapixel\nOperating System:Android 11(ColorOS 11.1)\nProcessor:MediaTek Helio P22(12nm)\nRam:4 GB\nRom:64 GB\nBattery:Lithium-polymer 4230 mAh\nPrice:14,990(Tk)");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
	    c2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Oppo A16\nDisplay:HD+ 720*1600 pixels(269 ppi)\nBack Camera:Triple 13+2+2 Megapixel\nFront Camera:8 Megapixel\nOperating System:Android 11(ColorOS Core 11.1)\nProcessor:MediaTek Helio G35(12nm)\nRam:4 GB\nRom:64 GB\nBattery:Lithium-polymer 5000 mAh\nPrice:16,990(Tk)");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);

			}
		});
		c3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Oppo A53\nDisplay:HD+ 720*1600 pixels(270 ppi)\nBack Camera:Triple 13+2+2 Megapixel\nFront Camera:16 Megapixel\nOperating System:Android 10(ColorOS 7.1)\nProcessor:Qualcomm Snapdragon 460(11nm)\nRam:6 GB\nRom:128 GB\nBattery:Lithium-polymer 5000 mAh\nPrice:16,990(Tk)");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Oppo A54\nDisplay:HD+ 720*1600 pixels(270 ppi)\nBack Camera:Triple 13+2+2 Megapixel\nFront Camera:16 Megapixel\nOperating System:Android 10(ColorOS 7.2)\nProcessor:MediaTek Helio P35(12nm)\nRam:6 GB\nRom:128 GB\nBattery:Lithium-polymer 5000 mAh\nPrice:22,990(Tk)");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Oppo F19\nDisplay:Full HD+ 1080*2400 pixels(409 ppi)\nBack Camera:Triple 48+2+2 Megapixel\nFront Camera:16 Megapixel\nOperating System:Android 11(ColorOS 11.1)\nProcessor:Qualcomm Snapdragon 662(11nm)\nRam:6 GB\nRom:128 GB\nBattery:Lithium-polymer 5000 mAh\nPrice:21,990(Tk)");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Oppo F19 Pro\nDisplay:Full HD+ 1080*2400 pixels(409 ppi)\nBack Camera:Quad 48+8+2+2 Megapixel\nFront Camera:16 Megapixel\nOperating System:Android 11(ColorOS 11.1)\nProcessor:MediaTek Helio P95(12nm)\nRam:8 GB\nRom:128 GB\nBattery:Lithium-polymer 4310 mAh\nPrice:24,990(Tk)");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
                ta1.setEditable(false);
			}
		});
		c7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Oppo F17 Pro\nDisplay:Full HD+ 1080*2400 pixels(408 ppi)\nBack Camera:Quad 48+8+2+2 Megapixel\nFront Camera:16+2 Megapixel\nOperating System:Android 10(ColorOS 7.2)\nProcessor:MediaTek Helio P95(12nm)\nRam:8 GB\nRom:128 GB\nBattery:Lithium-polymer 4000 mAh\nPrice:25,990(Tk)");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});

		c8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Oppo A95\nDisplay:Full HD+ 1080*2400 pixels(409 ppi)\nBack Camera:Triple 48+2+2 Megapixel\nFront Camera:16 Megapixel\nOperating System:Android 11(ColorOS 11.1)\nProcessor:Qualcomm Snapdragon 662(11nm)\nRam:8 GB\nRom:128 GB\nBattery:Lithium-polymer 5000 mAh\nPrice:27,990(Tk)");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Oppo Reno6\nDisplay:Full HD+ 1080*2400 pixels(411 ppi)\nBack Camera:Quad 64+8+2+2 Megapixel\nFront Camera:44 Megapixel\nOperating System:Android 11(ColorOS 11.1)\nProcessor:Qualcomm Snapdragon 720G(8nm)\nRam:8 GB\nRom:128 GB\nBattery:Lithium-polymer 4310 mAh\nPrice:32,990(Tk)");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Oppo F21 Pro\nDisplay:Full HD+ 1080*2400 pixels(409 ppi)\nBack Camera:Triple 64+2+2 Megapixel\nFront Camera:32 Megapixel\nOperating System:Android 11(ColorOS 12.1)\nProcessor:Qualcomm Snapdragon 680 4G(6nm)\nRam:8 GB\nRom:128 GB\nBattery:Lithium-polymer 4500 mAh\nPrice:32,990(Tk)");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c11.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Oppo F21 Pro 5G\nDisplay:Full HD+ 1080*2400 pixels(409 ppi)\nBack Camera:Triple 64+2+2 Megapixel\nFront Camera:16 Megapixel\nOperating System:Android 12(ColorOS 12)\nProcessor:Qualcomm Snapdragon 695 5G(6nm)\nRam:8 GB\nRom:128 GB\nBattery:Lithium-polymer 4500 mAh\nPrice:37,990(Tk)");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
        c12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Oppo Reno7\nDisplay:Full HD+ 1080*2400 pixels(409 ppi)\nBack Camera:Triple 64+8+2 Megapixel\nFront Camera:32 Megapixel\nOperating System:Android 11(ColorOS 11.1)\nProcessor:Qualcomm Snapdragon 778G(6nm)\nRam:8 GB\nRom:256 GB\nBattery:Lithium-polymer 4500 mAh\nPrice:47,470(Tk)");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c13.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Oppo Reno8 5G\nDisplay:Full HD+ 1080*2400 pixels(411 ppi)\nBack Camera:Triple 50+8+2 Megapixel\nFront Camera:32 Megapixel\nOperating System:Android 12(ColorOS 12)\nProcessor:MediaTek Dimensity 1300(6nm)\nRam:8 GB\nRom:256 GB\nBattery:Lithium-polymer 4500 mAh\nPrice:48,985(Tk)");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c14.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Oppo Reno8 Lite\nDisplay:Full HD+ 1080*2400 pixels(409 ppi)\nBack Camera:Triple 64+2+2 Megapixel\nFront Camera:16 Megapixel\nOperating System:Android 12(ColorOS 12)\nProcessor:Qualcomm Snapdragon 695 5G(6nm)\nRam:8 GB\nRom:128 GB\nBattery:Lithium-polymer 4500 mAh\nPrice:46,460(Tk)");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c15.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Oppo Reno8 Pro\nDisplay:Full HD+ 1080*2400 pixels\nBack Camera:Triple 50+8+2 Megapixel\nFront Camera:32 Megapixel\nOperating System:Android 12(ColorOS 12.1)\nProcessor:Qualcomm Snapdragon 7 Gen 1(4nm)\nRam:12 GB\nRom:256 GB\nBattery:Lithium-polymer 4500 mAh\nPrice:53,025(Tk)");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
	}
}













