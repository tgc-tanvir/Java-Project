package classes;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.time.format.*;

public class SignUp extends JFrame {

    private Container c;
    private ImageIcon icon, logo;
    private JLabel label1, imgLabel;
    private Font f1, f2, f3, f4, f5, f6;
    private JTextField tf1, tf2, tf4, tf5;
    private JComboBox securityQsn;
    private JButton btn1, btn2, btn3, btn4, nBtn;
    private JPasswordField tf3;
    private Cursor cursor;
    private int a, b;

    public SignUp()
    {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("GsmMark");
        this.setSize(900,900);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));

        //icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        //this.setIconImage(icon.getImage());

        /*logo = new ImageIcon(getClass().getResource("/images/LogoBlue.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(30, 50, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);*/

        f1 = new Font("Segoe UI Black", Font.PLAIN,30);
        f2 = new Font("Segoe UI Black", Font.PLAIN,20);
        f3 = new Font("Segoe UI Semibold", Font.PLAIN, 35);
        f4 = new Font("Segoe UI", Font.PLAIN, 25);
        f5 = new Font("Segoe UI", Font.PLAIN, 19);
        f6 = new Font("Segoe UI", Font.PLAIN, 25);

        label1 = new JLabel();
        label1.setText("Enter Your Information");
        label1.setBounds(230,75,500,50);
        label1.setFont(f1);
        c.add(label1);

        label1 = new JLabel();
        label1.setText("User Name");
        label1.setBounds(230,125,200, 50);
        label1.setFont(f4);
        c.add(label1);

        tf1 = new JTextField();
        tf1.setBounds(415,135, 260, 30);
        tf1.setFont(f5);
        c.add(tf1);

        label1 = new JLabel();
        label1.setText("Phone Number");
        label1.setBounds(230,160,300,50);
        label1.setFont(f4);
        c.add(label1);

        tf2 = new JTextField();
        tf2.setBounds(415, 170, 260, 30);
        tf2.setFont(f5);
        c.add(tf2);

        label1 = new JLabel();
        label1.setText("Password");
        label1.setBounds(230,195, 500, 50);
        label1.setFont(f4);
        c.add(label1);

        tf3 = new JPasswordField();
        tf3.setBounds(415,205, 260, 30);
        tf3.setFont(f2);
        tf3.setEchoChar('*');
        c.add(tf3);

        label1 = new JLabel();
        label1.setText("Question");
        label1.setBounds(230,230, 500, 50);
        label1.setFont(f4);
        c.add(label1);

        String[] secQsn = { "Choose a Security Question", "Your dream job?", "Your cherished moment?",
                "Your favourite footballer?", "Your favourite cricketer?" };
        securityQsn = new JComboBox(secQsn);
        securityQsn.setBounds(415,240,259, 30);
        securityQsn.setSelectedIndex(0);
        securityQsn.setFont(f5);
        securityQsn.setBackground(Color.white);
        c.add(securityQsn);


        label1 = new JLabel();
        label1.setText("Answer");
        label1.setBounds(230,265, 500, 50);
        label1.setFont(f4);
        c.add(label1);

        tf4 = new JTextField();
        tf4.setBounds(415,275, 260, 30);
        tf4.setFont(f5);
        c.add(tf4);

        // Captcha Label and Text Field
        label1 = new JLabel();
        label1.setText("Captcha");
        label1.setBounds(230,300, 500, 50);
        label1.setFont(f4);
        c.add(label1);

        tf5 = new JTextField();
        tf5.setBounds(415,310,80, 30);
        tf5.setFont(f5);
        c.add(tf5);

        Random rand = new Random();
        int a = rand.nextInt(10);
        int b = rand.nextInt(10);

        // Captcha
        label1 = new JLabel();
        label1.setText(" " + a + " + " + b + " ");
        label1.setBounds(330,310, 75, 30);
        label1.setFont(f4);
        label1.setForeground(Color.red);
        label1.setBackground(Color.decode("#FFD3D3"));
        label1.setOpaque(true);
        c.add(label1);


        cursor = new Cursor(Cursor.HAND_CURSOR);

        btn1 = new JButton("Exit");
        btn1.setBounds(370,430,100,30);
        btn1.setFont(f2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#C00000"));
        c.add(btn1);

        btn2 = new JButton("Previous");
        btn2.setBounds(780,5,100,26);
        //btn2.setFont(f2);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#2E75B6"));
        c.add(btn2);

        btn3 = new JButton("Reset");
        btn3.setBounds(280,375,140,30);
        btn3.setFont(f2);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#2E75B6"));
        c.add(btn3);

        btn4 = new JButton("Sign Up");
        btn4.setBounds(430,375,160,30);
        btn4.setFont(f2);
        btn4.setCursor(cursor);
        btn4.setForeground(Color.WHITE);
        btn4.setBackground(Color.decode("#2E75B6"));
        c.add(btn4);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        // Exit Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        // Back Button
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                new Login();
            }
        });

        // Reset Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                SignUp frame1= new SignUp();
                frame1.setVisible(true);
            }
        });

        // Register Button
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                String textField1 = tf1.getText().toLowerCase(); // User Name
                String textField2 = tf2.getText(); // Email
                String textField3 = tf3.getText(); // Password
                String textField4 = tf4.getText(); // Security Question Answer
                String textField5 = tf5.getText(); // Captcha
                String secQsn = String.valueOf(securityQsn.getSelectedItem()); // Security Question
                int result = 0;

                if (textField5.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    result = Integer.parseInt(tf5.getText());
                    if (textField1.isEmpty() || textField2.isEmpty() || textField3.isEmpty() || textField4.isEmpty()
                            || textField5.isEmpty() || ((securityQsn.getSelectedIndex()) == 0)) {
                        JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    } else if (result != (a + b)) {
                        JOptionPane.showMessageDialog(null, "Wrong Captcha.", "Warning!", JOptionPane.WARNING_MESSAGE);
                    } else {

                        try {
                            File file = new File("C:\\Users\\risha\\Java Project\\data\\user_data.txt");
                            if (!file.exists()) {
                                file.createNewFile();
                            }
                            FileWriter fw = new FileWriter(file, true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            PrintWriter pw = new PrintWriter(bw);

                            LocalDateTime myDateObj = LocalDateTime.now();
                            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");

                            String timeAndDate = myDateObj.format(myFormatObj);

                            pw.println("User Name : " + textField1);
                            pw.println("Password : " + textField3);
                            pw.println("Phone Number : " + textField2);
                            pw.println("Security Question : " + secQsn);
                            pw.println("Answer : " + textField4);
                            pw.println("Time & Date : " + timeAndDate);
                            pw.println("===============================================");
                            pw.close();

                        } catch (Exception ex) {
                            System.out.print(ex);
                        }

                        JOptionPane.showMessageDialog(null, "Sign Up Successfully Completed!",
                                "Sign UP Complete", JOptionPane.WARNING_MESSAGE);
                        setVisible(false);
                        new Login();
                    }
                }
            }
        });
    }

    public static void main(String[] args) {

        SignUp frame1= new SignUp();
        frame1.setVisible(true);
    }
}
