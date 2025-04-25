package classes;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.table.*;
import interfaces.*;

public class AdminPanel implements ActionListener, IMobileShopOperations
{

	Mobile m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15,m16,m17,m18,m19,m20,m21,m22,m23,m24,m25,m26,m27,m28,m29,m30,m31,m32,m33,m34,m35,m36,m37,m38,m39,m40,m41,m42,m43,m44,m45,m46,m47,m48,m49,m50,m51,m52,m53,m54,m55,m56,m57,m58,m59,m60,m61,m62,m63,m64,m65,m66,m67,m68,m69,m70;
	Mobile mobiles[];

	//labels
   JLabel lmobileName;
   JLabel lmodelNo;
   JLabel ldisplaydetails;
   JLabel lprocessor;
   JLabel lbattery;
   JLabel lprice;
   JLabel opName;

	//textfields
   JTextField moName;
   JTextField modelNum;
   JTextField displaydetails;
   JTextField processor;
   JTextField battery;
   JTextField moprice;

	//textarea
   JTextArea show;

	//buttons
	JButton insertBtn;
	JButton deleteBtn;
    JButton dispBtn;
    JButton searchBtn;
    JButton logoutBtn;
	JButton lcUser;
	JButton proceedInsert;
	JButton proceedDelete;
	JButton proceedDisplay;
	JButton proceedSearch;

	//imageIcon
	ImageIcon img;

	//for table(s)
	JTable jt;
	//JScrollPane sp;

	//frame
	JFrame f;

    public AdminPanel()
	{
	   f= new JFrame("Admin Panel");
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
	   m66= new Mobile("Apple","iPhone 12","Quad HD+ 1170*2532 pixels","Apple A14 Bionic","Lithium-ion 2345 mAh","124,999(Tk)");
	   m67= new Mobile("Apple","iPhone 12 Pro","Quad HD+ 1170*2532 pixels","Apple A14 Bionic","Lithium-ion 2345 mAh","146,999(Tk)");
	   m68= new Mobile("Apple","iPhone 11 Pro Max","Quad HD+ 1242*2688 pixels","Apple A13 Bionic","Lithium-ion 3969 mAh","144,999(Tk)");
	   m69= new Mobile("Apple","iPhone 7","750*1334 pixels","Apple A10 Fusion","Lithium-ion 1960 mAh","43,999(Tk)");
	   m70= new Mobile("Apple","iPhone 7 Plus","Full HD 1080*1920 pixels","Apple A10 Fusion","Lithium-ion 2900 mAh","47,999(Tk)");

       try{
	   mobiles= new Mobile[75];}
	   catch(ArrayIndexOutOfBoundsException ex)
	   {
		   System.out.println("Array Index out of bounds!"+ex);
		   ex.printStackTrace();
	   }

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
	   mobiles[65]=m66;
	   mobiles[66]=m67;
	   mobiles[67]=m68;
	   mobiles[68]=m69;
	   mobiles[69]=m70;

      //construct components
      lmobileName = new JLabel ("Mobile Name");
      lmobileName.setForeground(new Color (230, 238, 250));

      lmodelNo = new JLabel ("Model No");
      lmodelNo.setForeground(new Color (230, 238, 250));

	  ldisplaydetails = new JLabel ("Display Details");
	  ldisplaydetails.setForeground(new Color (230, 238, 250));

	  lprocessor = new JLabel ("Processor");
	  lprocessor.setForeground(new Color (230, 238, 250));

	  lbattery = new JLabel ("Battery");
	  lbattery.setForeground(new Color (230, 238, 250));

	  lprice =new JLabel("Price");
	  lprice.setForeground(new Color (230,238,250));
	  opName = new JLabel ("Default!");
	  opName.setForeground(new Color (230, 238, 250));

      moName= new JTextField (5);
      modelNum= new JTextField (5);
	  displaydetails =new JTextField(5);
	  processor =new JTextField(5);
	  battery =new JTextField(5);
	  moprice=new JTextField(5);

		show= new JTextArea (5, 5);

		insertBtn = new JButton ("Insert");
        deleteBtn = new JButton ("Delete");
        dispBtn = new JButton ("Show Details");
		proceedInsert = new JButton("Proceed");
		proceedDelete = new JButton("Proceed");
		proceedDisplay = new JButton("Proceed");
		proceedSearch = new JButton("Proceed");
        searchBtn = new JButton ("Search");
        logoutBtn = new JButton ("Logout");
		//lcUser = new JButton(user);

		try{
        img=  new ImageIcon("download.png");}
        catch(NullPointerException npe)
        {
            System.out.println("Image cannot be found!"+npe);
            npe.printStackTrace();
        }
        f.setIconImage(img.getImage());
		jt = new JTable();

      //add components
       f.add(lmobileName);
       f.add(lmodelNo);
       f.add(ldisplaydetails);
       f.add(lprocessor);
       f.add(lbattery);
       f.add(lprice);
	   f.add(opName);
       f.add(moName);
	   f.add(modelNum);
	   f.add(displaydetails);
	   f.add(processor);
	   f.add(battery);
	   f.add(moprice);
	   f.add(show);

	   f.add(insertBtn);
       f.add(deleteBtn);
       f.add (dispBtn);
       f.add (searchBtn);
	   f.add (proceedInsert);
	   f.add (proceedDelete);
	   f.add (proceedDisplay);
	   f.add (proceedSearch);
       f.add (logoutBtn);
       //f.add (lcUser);
       f.add(jt);

      //set component bounds (only needed by Absolute Positioning)
      lmobileName.setBounds (55, 90, 100,25);
      lmodelNo.setBounds (55, 130, 100, 25);
	  ldisplaydetails.setBounds(55,170,100,25);
	  lprocessor.setBounds (55,210,100,25);
	  lbattery.setBounds (55,250,100,25);
      lprice.setBounds (55,290,100,25);
	  opName.setBounds (365,80,140,30);
      moName.setBounds (175, 90, 100, 25);
      modelNum.setBounds (175, 130, 100, 25);
	  displaydetails.setBounds (175,170,100,25);
	  processor.setBounds (175,210,100,25);
	  battery.setBounds (175,250,100,25);
	  moprice.setBounds (175,290,100,25);
	  show.setBounds (280,360, 380, 90);

		insertBtn.setBounds (180, 30, 120, 30);
        deleteBtn.setBounds (345, 30, 120, 30);
        dispBtn.setBounds (510, 30, 120, 30);
		proceedInsert.setBounds(385, 110, 120, 30);
		proceedDelete.setBounds(385, 110, 120, 30);
		proceedDisplay.setBounds(385, 110, 120, 30);
		proceedSearch.setBounds(385, 110, 120, 30);
        searchBtn.setBounds (680, 30, 120, 30);
        logoutBtn.setBounds (910,10,75, 20);
        //lcUser.setBounds (420, 5, 75, 20);

		//by default labels, textfield, textarea-invisible
		lmobileName.setVisible(false);
		lmodelNo.setVisible(false);
		ldisplaydetails.setVisible(false);
		lprocessor.setVisible(false);
		lbattery.setVisible(false);
		lprice.setVisible(false);
		opName.setVisible(false);
		moName.setVisible(false);
		modelNum.setVisible(false);
		displaydetails.setVisible(false);
		processor.setVisible(false);
		battery.setVisible(false);
		moprice.setVisible(false);
		show.setVisible(false);
		proceedInsert.setVisible(false);
		proceedDelete.setVisible(false);
		proceedDisplay.setVisible(false);
		proceedSearch.setVisible(false);

		//addActionListener
		logoutBtn.addActionListener(this);
		//lcUser.addActionListener(this);
		insertBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		dispBtn.addActionListener(this);
		searchBtn.addActionListener(this);
		proceedInsert.addActionListener(this);
		proceedDelete.addActionListener(this);
		proceedDisplay.addActionListener(this);
		proceedSearch.addActionListener(this);

      //frame properties
		//adjust size and set layout
       f.setSize (1000,1000);
	   f.setLocationRelativeTo(null);//to center screen gui
       f.setLayout (null);
	   f.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
       f.getContentPane().setBackground(new Color (0,0,128));
       f.setResizable(false);
       f.setVisible (true);
    }

    public void addMobile(Mobile m)
    {
    	int count = 0;

    	for(int i=0; i<mobiles.length; i++)
    	{
    		if(mobiles[i]==null)
    		{
    			mobiles[i]=m;
    			count++;
    			break;
    		}
    	}
    	if(count==0)
    	{
    		show.setText("Mobile phone cannot be added");
    		show.setFont(new Font("Times New Roman",Font.BOLD,19));
    	}
    	else
    	{
    		show.setText("Mobile phone added successfully");
    		show.setFont(new Font("Times New Roman",Font.BOLD,19));
    	}
    }

    public Mobile searchMobile(String modelNum)
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

    public boolean deleteMobile(String modelNum)
    {
    	boolean test = false;

    	for(int i=0; i<mobiles.length; i++)
    	{
    		if(mobiles[i]!=null)
    		{
    			if(mobiles[i].getModelNo().equals(modelNum))
        		{
    				mobiles[i]=null;
        			test=true;
        			break;
        		}
    		}
    	}
    	return test;
    }

     public void actionPerformed(ActionEvent e)
	 {

         if(e.getSource()==logoutBtn)
			{

				f.setVisible(false);
				new AdminLogin();

        	}
			/*else if(e.getSource() == lcUser)
			{
				String user = lcUser.getText();
				new Profile(user);
				f.setVisible(false);
			}*/
			else if(e.getSource() == insertBtn)
			{
				lmobileName.setVisible(true);
				lmodelNo.setVisible(true);
				ldisplaydetails.setVisible(true);
				lprocessor.setVisible(true);
				lbattery.setVisible(true);
				lprice.setVisible(true);
				opName.setText("Operation: Insert");
				opName.setVisible(true);
				moName.setVisible(true);
				moName.setText(null);
				modelNum.setVisible(true);
				modelNum.setText(null);
				displaydetails.setVisible(true);
				displaydetails.setText(null);
				processor.setVisible(true);
				processor.setText(null);
				battery.setVisible(true);
				battery.setText(null);
				moprice.setVisible(true);
				moprice.setText(null);
				show.setVisible(true);
				show.setText(null);
				proceedInsert.setVisible(true);
				proceedDelete.setVisible(false);
				proceedDisplay.setVisible(false);
				proceedSearch.setVisible(false);
				jt.setVisible(false);

		}
		   else if(e.getSource() == deleteBtn)
			{
				lmobileName.setVisible(true);
				moName.setVisible(true);
				moName.setText(null);
				ldisplaydetails.setVisible(false);
				displaydetails.setVisible(false);
				lprocessor.setVisible(false);
				processor.setVisible(false);
				lbattery.setVisible(false);
				battery.setVisible(false);
				show.setVisible(true);
				show.setText(null);
				proceedInsert.setVisible(false);
				proceedDelete.setVisible(true);
				proceedDisplay.setVisible(false);
				proceedSearch.setVisible(false);

				opName.setText("Operation: Delete");
				opName.setVisible(true);

				lmodelNo.setVisible(true);
				modelNum.setVisible(true);
				lprice.setVisible(false);
				moprice.setVisible(false);
				jt.setVisible(false);
			}
			else if(e.getSource() == dispBtn)
			{
				lmobileName.setVisible(true);
				moName.setVisible(true);
				moName.setText(null);
				show.setVisible(false);
				proceedInsert.setVisible(false);
				proceedDelete.setVisible(false);
				proceedDisplay.setVisible(true);
				proceedSearch.setVisible(false);

				opName.setText("Operation: Show Details");
				opName.setBounds(365,80,180,30);
				opName.setVisible(true);

				lmodelNo.setVisible(true);
				modelNum.setVisible(true);
				ldisplaydetails.setVisible(false);
				displaydetails.setVisible(false);
				lprocessor.setVisible(false);
				processor.setVisible(false);
				lprice.setVisible(false);
				lbattery.setVisible(false);
				battery.setVisible(false);
				moprice.setVisible(false);
			}
			else if(e.getSource() == searchBtn)
			{
				lmobileName.setVisible(true);
				moName.setVisible(true);
				moName.setText(null);
				lmodelNo.setVisible(true);
				modelNum.setVisible(true);
				modelNum.setText(null);
				show.setVisible(true);
				show.setText(null);
				proceedInsert.setVisible(false);
				proceedDelete.setVisible(false);
				proceedDisplay.setVisible(false);
				proceedSearch.setVisible(true);
				lprice.setVisible(false);
				moprice.setVisible(false);

				opName.setText("Operation: Search");
				opName.setVisible(true);
                ldisplaydetails.setVisible(false);
				displaydetails.setVisible(false);
				lprocessor.setVisible(false);
				processor.setVisible(false);

				jt.setVisible(false);

			}

			if(e.getSource()==proceedInsert)
			{

				String mobilename = moName.getText();
				String modelnumber=modelNum.getText();
				String display_Details=displaydetails.getText();
				String process_or=processor.getText();
				String batt_ery=battery.getText();
				String mobileprice=moprice.getText();

				if(mobilename.isEmpty()==false && modelnumber.isEmpty()==false && display_Details.isEmpty()==false && process_or.isEmpty()==false && batt_ery.isEmpty()==false && mobileprice.isEmpty()==false)
				{
					if(searchMobile(modelnumber)==null)
					{
						Mobile m = new Mobile(mobilename,modelnumber,display_Details,process_or,batt_ery,mobileprice);
						this.addMobile(m);
					}
					else
					{
						JOptionPane.showMessageDialog(null,"A mobile already exists with that model number."+modelnumber+". Try again");
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Please enter necessary information on the field");
				}

			}
			if(e.getSource()==proceedDelete)
			{
				String test = modelNum.getText();

				boolean isDeleted = this.deleteMobile(test);

				if(isDeleted == true)
				{
					show.setText("This mobile has been deleted!");
					show.setFont(new Font("Times New Roman",Font.BOLD,19));
				}
				else
				{
					show.setText("This mobile phone cannot be deleted!");
					show.setFont(new Font("Times New Roman",Font.BOLD,19));
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
						jt.setBounds(0,350,1000,100);

						f.add(jt);

						jt.setVisible(true);
						show.setVisible(false);
					}
					else
					{
						show.setVisible(true);
						jt.setVisible(false);
						show.setText("This mobile could not be found or displayed!");
						show.setFont(new Font("Times New Roman",Font.BOLD,19));
					}
				}
			}
			if(e.getSource()==proceedSearch)
			{
				String test = modelNum.getText();

				Mobile m = this.searchMobile(test);

				if(m!=null)
				{
					show.setText("This phone has been found!");
					show.setFont(new Font("Times New Roman",Font.BOLD,19));
				}
				else
				{
					show.setText("Sorry!This phone could not be found");
					show.setFont(new Font("Times New Roman",Font.BOLD,19));
				}
			}
   	}
}





