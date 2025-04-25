package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;

import static javax.swing.JOptionPane.showMessageDialog;


public class Smartphones extends JFrame implements ActionListener
{
	private Container c;
	private JButton b1,b2,b3,b4,b5,b6,b7,b8;
	private JLabel l1,lmobileName,lmodelNo,opName;
	private JTextField moName,modelNum;
	private JButton proceedSearch;
	private JButton searchBtn;
	private JButton dispBtn;
	private	JButton proceedDisplay;
	private JTable jt;

    Mobile m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15,m16,m17,m18,m19,m20,m21,m22,m23,m24,m25,m26,m27,m28,m29,m30,m31,m32,m33,m34,m35,m36,m37,m38,m39,m40,m41,m42,m43,m44,m45,m46,m47,m48,m49,m50,m51,m52,m53,m54,m55,m56,m57,m58,m59,m60,m61,m62,m63,m64,m65;

	Mobile mobiles[];

	public Smartphones()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Android Phone Category");
        this.setSize(1000,1000);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
		c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#006aff"));
        mobiles= new Mobile[65];

	   m1= new Mobile("Samsung","Galaxy A13","Full HD+ 1080*2408 pixels","Exynos 850","Lithium-polymer 5000 mAh","23,999(Tk)");
       m2= new Mobile("Samsung","Galaxy F22","HD+ 720*1600 pixels","Mediatek Helio G80","Lithium-polymer 6000 mAh","23,999(Tk)");
	   m3= new Mobile("Samsung","Galaxy M12","HD+ 720*1600 pixels","Exynos 850","Lithium-polymer 6000 mAh","23,499(Tk)");
       m4= new Mobile("Samsung","Galaxy A03s","HD+ 720*1600 pixels","MediaTek Helio P35","Lithium-polymer 5000 mAh","17,499(Tk)");
	   m5= new Mobile("Samsung","Galaxy A03","HD+ 720*1600 pixels","Unisoc T606","Lithium-polymer 5000mAh","15,999(Tk)");
       m6= new Mobile("Samsung","Galaxy A23","Full HD+ 1080*2408 pixels","Qualcomm Snapdragon 680","Lithium-polymer 5000 mAh","31,599(Tk)");
	   m7= new Mobile("Samsung","Galaxy F23 5G","Full HD+ 1080*2408 pixels","Qualcomm Snapdragon 750G 5G","Lithium-polymer 5000 mAh","31,999(Tk)");
	   m8= new Mobile("Samsung","Galaxy M33 5G","Full HD+ 1080*2408 pixels","Exynos 1280","Lithium-polymer 6000 mAh","35,599(Tk)");
	   m9= new Mobile("Samsung","Galaxy A52","Full HD+ 1080*2408 pixels","Qualcomm Snapdragon 720G 5G","Lithium-polymer 4500 mAh","39,999(Tk)");
	   m10= new Mobile("Samsung","Galaxy M53 5G","Full HD+ 1080*2408 pixels","MediaTek Dimensity 900","Lithium-polymer 5000 mAh","48,999(Tk)");
	   m11= new Mobile("Samsung","Galaxy M52s 5G","Full HD+ 1080*2400 pixels","Qualcomm Snapdragon 778G 5G","Lithium-polymer 4500 mAh","57,499(Tk)");
	   m12= new Mobile("Samsung","Galaxy S21 FE 5G","Full HD+ 1080*2400 pixels","Exynos 2100","Lithium-polymer 4500 mAh","86,699(Tk)");
	   m13= new Mobile("Samsung","Galaxy A73 5G","Full HD+ 1080*2400 pixels","Qualcomm Snapdragon 778G 5G","Lithium-polymer 5000 mAh","74,499(Tk)");
	   m14= new Mobile("Samsung","Galaxy S22+","Full HD+ 1080*2340 pixels(Dynamic AMOLED)","Qualcomm Snapdragon 8 Gen 1","Lithium-ion 4500 mAh","142,999(Tk)");
	   m15= new Mobile("Samsung","Galaxy S22 Ultra","Qual HD+ 1440*3088 pixels(Dynamic AMOLED)","Qualcomm Snapdragon 8 Gen 1","Lithium-ion 5000 mAh","179,999(Tk)");
	   m16= new Mobile("Xiaomi","Redmi 10A","HD+ 720*1600 pixels","MediaTek Helio G25","Lithium-polymer 5000 mAh","13,999(Tk)");
	   m17= new Mobile("Xiaomi","Redmi 10","Full HD+ 1080*2400 pixels","MediaTek Helio G88","Lithium-polymer 5000 mAh","16,999(Tk)");
	   m18= new Mobile("Xiaomi","Redmi Note 10 Pro","Full HD+ 1080*2400 pixels","Qualcomm Snapdragon 732G","Lithium-polymer 5020 mAh","26,999(Tk)");
	   m19= new Mobile("Xiaomi","Redmi Note 11","Full HD+ 1080*2400 pixels","Qualcomm Snapdragon 680 4G","Lithium-polymer 5000 mAh","22,499(Tk)");
	   m20= new Mobile("Xiaomi","Redmi Note 11S","Full HD+ 1080*2400 pixels","MediaTek Helio G96","Lithium-polymer 5000 mAh","27,999(Tk)");
	   m21= new Mobile("Xiaomi","Poco M3","Full HD+ 1080*2400 pixels","MediaTek Helio G96","Lithium-polymer 5000 mAh","27,999(Tk)");
	   m22= new Mobile("Xiaomi","Poco F4","Full HD+ 1080*2400 pixels","MediaTek Helio G96","Lithium-polymer 5000 mAh","27,999(Tk)");
	   m23= new Mobile("Xiaomi","Poco C40","Full HD+ 1080*2400 pixels","MediaTek Helio G96","Lithium-polymer 5000 mAh","27,999(Tk)");
	   m24= new Mobile("Xiaomi","Poco M4","Full HD+ 1080*2400 pixels","MediaTek Helio G96","Lithium-polymer 5000 mAh","27,999(Tk)");
	   m25= new Mobile("Xiaomi","12 Pro","Full HD+ 1080*2400 pixels","MediaTek Helio G96","Lithium-polymer 5000 mAh","27,999(Tk)");
	   m26= new Mobile("Xiaomi","11i","Full HD+ 1080*2400 pixels","MediaTek Helio G96","Lithium-polymer 5000 mAh","27,999(Tk)");
	   m27= new Mobile("Xiaomi","11T","Full HD+ 1080*2400 pixels","MediaTek Helio G96","Lithium-polymer 5000 mAh","27,999(Tk)");
	   m28= new Mobile("OnePlus","Nord CE 2 5G","Full HD+ 1080*2400 pixels","MediaTek Dimensity 900 5G","Lithium-polymer 4500 mAh","34,990(Tk)");
	   m29= new Mobile("OnePlus","Nord 2 5G","Full HD+ 1080*2400 pixels","MediaTek Dimensity 1200 5G","Lithium-polymer 4500 mAh","44,990(Tk)");
	   m30= new Mobile("OnePlus","Nord N10 5G","Full HD+ 1080*2400 pixels","Qualcomm Snapdragon 690 5G","Lithium-polymer 4300 mAh","34,990(Tk)");
	   m31= new Mobile("OnePlus","8T","Full HD+ 1080*2400 pixels","Qualcomm Snapdragon 865","Lithium-polymer 4500 mAh","49,990(Tk)");
	   m32= new Mobile("OnePlus","8","Full HD+ 1080*2400 pixels","Qualcomm Snapdragon 865","Lithium-polymer 4300 mAh","54,990(Tk)");
	   m33= new Mobile("OnePlus","10 Pro 5G","QHD+ 1440*3216 pixels","Qualcomm Snapdragon 8 Gen 1","Lithium-polymer 5000 mAh","94,990(Tk)");
	   m34= new Mobile("OnePlus","8 Pro","QHD+ 1440*3168 pixels","Qualcomm Snapdragon 865","Lithium-polymer 4510 mAh","94,990(Tk)");
	   m35= new Mobile("OnePlus","7 Pro","Quad HD+ 1440*3120 pixels","Qualcomm Snapdragon 855","Lithium-ion 4000 mAh","72,990(Tk)");
	   m36= new Mobile("Realme","C31","HD+ 720*1600 pixels","UniSOC Tiger T612","Lithium-polymer 5000 mAh","14,490(Tk)");
	   m37= new Mobile("Realme","Narzo 50i","HD+ 720*1600 pixels","UniSOC T610","Lithium-polymer 6000 mAh","12,490(Tk)");
	   m38= new Mobile("Realme","C25","HD+ 720*1600 pixels","MediaTek Helio G70","Lithium-polymer 6000 mAh","14,990(Tk)");
	   m39= new Mobile("Realme","Narzo 20","HD+ 720*1600 pixels","MediaTek Helio G85","Lithium-polymer 6000 mAh","13,990(Tk)");
	   m40= new Mobile("Realme","Narzo 50A Prime","HD+ 720*1600 pixels","UniSOC Tiger T612","Lithium-polymer 5000 mAh","17,990(Tk)");
	   m41= new Mobile("Realme","9","Full HD+ 1080*2400 pixels","Qualcomm Snapdragon 680","Lithium-polymer 5000 mAh","24,990(Tk)");
	   m42= new Mobile("Realme","9i","Full HD+ 1080*2400 pixels","Qualcomm Snapdragon 680","Lithium-polymer 5000 mAh","23,490(Tk)");
	   m43= new Mobile("Realme","8 5G","Full HD+ 1080*2400 pixels","MediaTek Dimensity 700 5G","Lithium-polymer 5000 mAh","22,990(Tk)");
	   m44= new Mobile("Realme","9 Pro","Full HD+ 1080*2412 pixels","Qualcomm Snapdragon 695 5G","Lithium-polymer 5000 mAh","31,990(Tk)");
	   m45= new Mobile("Realme","9 Pro+","Full HD+ 1080*2400 pixels","MediaTek Dimensity 920","Lithium-polymer 4500 mAh","39,990(Tk)");
	   m46= new Mobile("Realme","7 Pro","Full HD+ 1080*2400 pixels","Qualcomm Snapdragon 720G","Lithium-polymer 4500 mAh","27,990(Tk)");
	   m47= new Mobile("Realme","GT Master Edition","QHD+ 1440*3088 pixels","Qualcomm Snapdragon 832G","Lithium-polymer 6000 mAh","42,990(Tk)");
	   m48= new Mobile("Realme","GT Neo2","QHD+ 1440*3088 pixels","MediaTek Dimensity 8100","Lithium-polymer 5000 mAh","42,999(Tk)");
	   m49= new Mobile("Realme","GT 2 Pro 5G","QHD+ 1440*3216 pixels","Qualcomm Snapdragon 8 Gen 1","Lithium-polymer 5000 mAh","47,990(Tk)");
	   m50= new Mobile("Realme","GT Neo3 5G","Full HD+ 1080*2412 pixels","MediaTek Dimensity 8100","Lithium-polymer 5000 mAh","42,999(Tk)");
       m51= new Mobile("Oppo","A16e","HD+ 720*1600 pixels","MediaTek Helio P22","Lithium-polymer 4230 mAh","14,990(Tk)");
	   m52= new Mobile("Oppo","A16","HD+ 720*1600 pixels","MediaTek Helio G35","Lithium-polymer 5000 mAh","16,990(Tk)");
	   m53= new Mobile("Oppo","A53","HD+ 720*1600 pixels","Qualcomm Snapdragon 460","Lithium-polymer 5000 mAh","16,990(Tk)");
	   m54= new Mobile("Oppo","A54","HD+ 720*1600 pixels","MediaTek Helio P35","Lithium-polymer 5000 mAh","22,990(Tk)");
	   m55= new Mobile("Oppo","F19","Full HD+ 1080*2400 pixels","Qualcomm Snapdragon 662","Lithium-polymer 5000 mAh","21,990(Tk)");
	   m56= new Mobile("Oppo","F19 Pro","Full HD+ 1080*2400 pixels","MediaTek Helio P95","Lithium-polymer 4310 mAh","24,990(Tk)");
	   m57= new Mobile("Oppo","F17 Pro","Full HD+ 1080*2400 pixels","MediaTek Helio P95","Lithium-polymer 4000 mAh","25,990(Tk)");
	   m58= new Mobile("Oppo","A95","Full HD+ 1080*2400 pixels","Qualcomm Snapdragon 662","Lithium-polymer 5000 mAh","27,990(Tk)");
	   m59= new Mobile("Oppo","Reno6","Full HD+ 1080*2400 pixels","Qualcomm Snapdragon 720G","Lithium-polymer 4310 mAh","32,990(Tk)");
	   m60= new Mobile("Oppo","F21 Pro","Full HD+ 1080*2400 pixels","Qualcomm Snapdragon 680 4G","Lithium-polymer 4500 mAh","32,990(Tk)");
	   m61= new Mobile("Oppo","F21 Pro 5G","Full HD+ 1080*2400 pixels","Qualcomm Snapdragon 695 5G","Lithium-polymer 4500 mAh","37,990(Tk)");
	   m62= new Mobile("Oppo","Reno7","Full HD+ 1080*2400 pixels","Qualcomm Snapdragon 778G","Lithium-polymer 4500 mAh","47,470(Tk)");
	   m63= new Mobile("Oppo","Reno8 5G","Full HD+ 1080*2400 pixels","MediaTek Dimensity 1300","Lithium-polymer 4500 mAh","48,985(Tk)");
	   m64= new Mobile("Oppo","Reno8 Lite","Full HD+ 1080*2400 pixels","Qualcomm Snapdragon 695 5G","Lithium-polymer 4500 mAh","46,460(Tk)");
	   m65= new Mobile("Oppo","Reno8 Pro","Full HD+ 1080*2400 pixels","Qualcomm Snapdragon 7 Gen 1","Lithium-polymer 4500 mAh","53,025(Tk)");

	   mobiles[0]=m1;
	   mobiles[1]=m2;
	   mobiles[2]=m3;
	   mobiles[3]=m4;
	   mobiles[4]=m5;
	   mobiles[5]=m6;
	   mobiles[6]=m7;
	   mobiles[7]=m8;
	   mobiles[8]=m9;
	   mobiles[9]=m10;
	   mobiles[10]=m11;
	   mobiles[11]=m12;
	   mobiles[12]=m13;
	   mobiles[13]=m14;
	   mobiles[14]=m15;
	   mobiles[15]=m16;
	   mobiles[16]=m17;
	   mobiles[17]=m18;
	   mobiles[18]=m19;
	   mobiles[19]=m20;
	   mobiles[20]=m21;
	   mobiles[21]=m22;
	   mobiles[22]=m23;
	   mobiles[23]=m24;
	   mobiles[24]=m25;
	   mobiles[25]=m26;
	   mobiles[26]=m27;
	   mobiles[27]=m28;
	   mobiles[28]=m29;
	   mobiles[29]=m30;
	   mobiles[30]=m31;
	   mobiles[31]=m32;
	   mobiles[32]=m33;
	   mobiles[33]=m34;
	   mobiles[34]=m35;
	   mobiles[35]=m36;
	   mobiles[36]=m37;
	   mobiles[37]=m38;
	   mobiles[38]=m39;
	   mobiles[39]=m40;
	   mobiles[40]=m41;
	   mobiles[41]=m42;
	   mobiles[42]=m43;
	   mobiles[43]=m44;
	   mobiles[44]=m45;
	   mobiles[45]=m46;
	   mobiles[46]=m47;
	   mobiles[47]=m48;
	   mobiles[48]=m49;
	   mobiles[49]=m50;
       mobiles[50]=m51;
	   mobiles[51]=m52;
	   mobiles[52]=m53;
	   mobiles[53]=m54;
	   mobiles[54]=m55;
	   mobiles[55]=m56;
	   mobiles[56]=m57;
	   mobiles[57]=m58;
	   mobiles[58]=m59;
	   mobiles[59]=m60;
	   mobiles[60]=m61;
	   mobiles[61]=m62;
	   mobiles[62]=m63;
	   mobiles[63]=m64;
	   mobiles[64]=m65;

		//img=new ImageIcon("     ");
		//JLabel j=new JLabel("",img,JLabel.CENTER);
		//j.setBounds(0,0,900,900);
	  lmobileName = new JLabel ("Mobile Name");
	  lmobileName.setBounds (55, 90, 100,25);
      lmobileName.setForeground(new Color (230, 238, 250));

      lmodelNo = new JLabel ("Model No");
	  lmodelNo.setBounds (55, 130, 100, 25);
      lmodelNo.setForeground(new Color (230, 238, 250));
	  opName = new JLabel ("Default!");
	  opName.setBounds (365,80,140,30);
	  opName.setForeground(new Color (230, 238, 250));
	  moName= new JTextField (5);
	  moName.setBounds (175, 90, 100, 25);
      modelNum= new JTextField (5);
	  modelNum.setBounds (175, 130, 100, 25);
	  searchBtn = new JButton ("Search");
	  searchBtn.setBounds (390,30, 120, 30);
	  proceedSearch = new JButton("Proceed");
	  proceedSearch.setBounds(363, 110, 120, 30);
	  jt=new JTable();
	  dispBtn = new JButton ("Show Details");
	  dispBtn.setBounds (535, 30, 120, 30);
	  proceedDisplay = new JButton("Proceed");
	  proceedDisplay.setBounds(385, 110, 120, 30);

		l1=new JLabel("Please Choose a Smartphone Brand");
		l1.setBounds(335,280,350,30);
		l1.setFont(new Font("Serif",Font.BOLD,22));
		b1=new JButton("Samsung");
		b1.setBounds(375,335,90,30);
		b2=new JButton("Xiaomi");
		b2.setBounds(485,335,80,30);
		b3=new JButton("OnePlus");
		b3.setBounds(425,390,90,30);
		b4=new JButton("Realme");
		b4.setBounds(535,390,80,30);
        b7= new JButton("Oppo");
		b7.setBounds(585,335,80,30);
		c.add(b1);
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.BLACK);
		c.add(b2);
        b2.setForeground(Color.WHITE);
		b2.setBackground(Color.BLACK);
		c.add(b3);
		b3.setForeground(Color.WHITE);
		b3.setBackground(Color.BLACK);
		c.add(b4);
		b4.setForeground(Color.WHITE);
		b4.setBackground(Color.BLACK);
        c.add(b7);
		b7.setForeground(Color.WHITE);
		b7.setBackground(Color.BLACK);
		b5=new JButton("Previous");
		b5.setBounds(795,0,90,20);
		b6=new JButton("Logout");
		b6.setBounds(895,0,80,20);
		b8= new JButton("Buy");
	    lmobileName.setVisible(false);
		lmodelNo.setVisible(false);
		opName.setVisible(false);
		moName.setVisible(false);
		modelNum.setVisible(false);
		b8.setVisible(false);
		proceedSearch.setVisible(false);
		proceedDisplay.setVisible(false);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		searchBtn.addActionListener(this);
		proceedSearch.addActionListener(this);
		dispBtn.addActionListener(this);
		proceedDisplay.addActionListener(this);
	    this.add(lmobileName);
        this.add(lmodelNo);
	    this.add(opName);
        this.add(moName);
	    this.add(modelNum);
        this.add (searchBtn);
	    this.add (proceedSearch);
		this.add(dispBtn);
		this.add(proceedDisplay);
		this.add(jt);
		this.add(l1);
		this.add(b1);
        this.add(b2);
        this.add(b3);
		this.add(b4);
		this.add(b5);
		this.add(b6);
		this.add(b7);
		this.add(b8);
        this.setLayout(null);
        this.setVisible(true);
	}
	 public Mobile searchMobile(String modelNum)//function for searching an account
     {
    	Mobile m = null;

    	for(int i=0; i<mobiles.length; i++)
    	{
    		if(mobiles[i]!=null)
    		{
    			if(mobiles[i].getModelNo().equals(modelNum))
        		{
        			m = mobiles[i];
        			break;
        		}
    		}
    	}
    	return m;
    }
        public void actionPerformed(ActionEvent e)
			{
              if(e.getSource()==b1)
			  {
				setVisible(false);
                new Samsung();
              }
			  else if(e.getSource()==b2)
			  {
				setVisible(false);
                new Xiaomi();
			  }
			 else if(e.getSource()==b3)
			  {
				 setVisible(false);
                 new OnePlus();
              }
			  else if(e.getSource()==b4)
			  {
				  setVisible(false);
				  new Realme();
			  }
	          else if(e.getSource()==b5)
			  {
				  setVisible(false);
				  PhoneTypes frame = new PhoneTypes();
                  frame.setVisible(true);

			  }
			  else if(e.getSource()==b6)
			  {
				  setVisible(false);
				  new Login();
			  }
              else if(e.getSource()==b7)
			  {
				  setVisible(false);
				  new Oppo();
			  }
              else if(e.getSource()==b8)
			  {
				  setVisible(false);
				  Payment frame= new Payment();
				  frame.setVisible(true);
			  }
			  else if(e.getSource() == dispBtn)
			{
				lmobileName.setVisible(true);
				moName.setVisible(true);
				moName.setText(null);
				proceedDisplay.setVisible(true);
				proceedSearch.setVisible(false);

				opName.setText("Operation: Show Details");
				opName.setBounds(365,80,180,30);
				opName.setVisible(true);

				lmodelNo.setVisible(true);
				modelNum.setVisible(true);
				modelNum.setText(null);
				l1.setVisible(false);
				b1.setVisible(false);
				b2.setVisible(false);
				b3.setVisible(false);
				b4.setVisible(false);
				b7.setVisible(false);

			}
			  else if(e.getSource() == searchBtn)
			{
				lmobileName.setVisible(true);
				moName.setVisible(true);
				moName.setText(null);
				lmodelNo.setVisible(true);
				modelNum.setVisible(true);
				modelNum.setText(null);
				proceedSearch.setVisible(true);
				proceedDisplay.setVisible(false);
				jt.setVisible(false);
				l1.setVisible(true);
				b1.setVisible(true);
				b2.setVisible(true);
				b3.setVisible(true);
				b4.setVisible(true);
				b7.setVisible(true);
				b8.setVisible(false);

				opName.setText("Operation: Search");
				opName.setVisible(true);

			}
			 if(e.getSource()==proceedSearch)
			{
				String test = modelNum.getText();

				Mobile m = this.searchMobile(test);

				if(m!=null)
				{
					JOptionPane.showMessageDialog(null,"This phone has been found!");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Sorry!This phone has not been found");
					/*show.setText("Sorry!This phone could not be found");
					show.setFont(new Font("Times New Roman",Font.BOLD,19));*/
				}
			}
   			if(e.getSource()==proceedDisplay)
			{
				String test =modelNum.getText();

				modelNum.setText(null);

				if(test.isEmpty()==false)
				{
					Mobile m = searchMobile(test);

					if(m!=null)
					{
					String column[] = {"Mobile Name","Model Number","Display Details","Processor","Battery","Price"};
					String data[][] = {{"Mobile Name","Model Number","Display Details","Processor","Battery","Price"},{m.getMobileName(),m.getModelNo(),m.getDisplayDetails(),m.getProcessor(),m.getBattery(),m.getPrice()}};
						DefaultTableModel model =new DefaultTableModel(data,column);

						jt.setModel(model);
						jt.setFont(new Font("Serif", Font.BOLD,13));
						jt.setBounds(0,250,1000,140);
						jt.setEnabled(false);

                        b8.setBounds(420,420,80,26);
                        this.add(b8);
						this.add(jt);

						jt.setVisible(true);
						b8.setVisible(true);
						//show.setVisible(false);
					}
					else
					{
						jt.setVisible(false);
						JOptionPane.showMessageDialog(null,"Sorry!The details of this phone could not be found");
						//show.setText("This mobile could not be found or displayed!");
						//show.setFont(new Font("Times New Roman",Font.BOLD,19));
					}
				}
			}
			}

}




