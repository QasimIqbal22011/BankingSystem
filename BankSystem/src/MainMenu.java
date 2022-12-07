import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class MainMenu {

    int rB,gB,bB;
    int rF,gF,bF;
    JFrame frame=new JFrame();

    JButton TransactionButton =new JButton();
    JButton CreateAccountButton =new JButton();
    JButton CheckDetailButton =new JButton();

    JButton LogoutButton =new JButton();

    JButton DeleteAccountButton = new JButton();






          MainMenu(String temp1, String temp2, String temp3,Color Dark){



              CheckLoginPageColor(temp1,temp2,temp3,Dark);

              frame.add(TransactionButton);
              frame.add(CreateAccountButton);
              frame.add(CheckDetailButton);
              frame.add(LogoutButton);
              frame.add(DeleteAccountButton);
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              frame.setSize(1280,720);
              frame.setLayout(null);
              frame.setTitle("Admin Panel");
              frame.setResizable(false);
              frame.setLocationRelativeTo(null);

              frame.setVisible(true);

         }


         void CheckLoginPageColor(String temp1, String temp2, String temp3,Color Dark)
         {
             if(Dark.equals(new Color(24,30,40)))
             {
                 rB = 24;
                 gB = 30;
                 bB = 40;
                 rF = 57;
                 gF = 255;
                 bF = 20;

                 PanelOptions(temp1,temp2,temp3,Dark);
             }

             else if(Dark.equals(new Color(0,0,0)))
             {
                 rB = 0;
                 gB = 0;
                 bB = 0;
                 rF = 255;
                 gF = 255;
                 bF = 0;

                 PanelOptions(temp1,temp2,temp3,Dark);
             }

             else if(Dark.equals(new Color(56,2,14)))
             {
                 rB = 56;
                 gB = 2;
                 bB = 14;
                 rF = 255;
                 gF = 255;
                 bF = 255;
                 PanelOptions(temp1,temp2,temp3,Dark);
             }
             else
         {
             rB = 255;
             gB = 255;
             bB = 255;
             rF = 0;
             gF = 0;
             bF = 0;

             PanelOptions(temp1,temp2,temp3,Dark);
         }

         }


    void PanelOptions(String temp1, String temp2, String temp3,Color dark)
         {

             frame.getContentPane().setBackground(new Color(rB,gB,bB));

             TransactionButton.setBounds(550,100,200,50);
             TransactionButton.setFont(new Font(Font.SERIF,Font.ITALIC,30));
             TransactionButton.setText("Transaction");
             TransactionButton.setForeground(new Color(rF,gF,bF));
             TransactionButton.setBackground(new Color(rB,gB,bB));
             TransactionButton.setBorder(BorderFactory.createLineBorder(new Color(rB,gB,bB)));
             TransactionButton.setFocusable(false);

             TransactionButton.addMouseListener(new MouseAdapter() {  //change cursor on mouse hover
                 public void mouseEntered(MouseEvent evt) {

                     TransactionButton.setBackground(new Color(rF,gF,bF));
                     TransactionButton.setForeground(new Color(rB,gB,bB));
                     TransactionButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                 }

                 public void mouseExited(MouseEvent evt) {

                     TransactionButton.setBackground(new Color(rB,gB,bB));
                     TransactionButton.setForeground(new Color(rF,gF,bF));
                     TransactionButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                 }


                 public void mouseClicked(MouseEvent e) {
                     frame.dispose();
                     try {
                         new Transaction(temp1,temp2,temp3,frame.getContentPane().getBackground());
                     } catch (IOException ex) {
                         JOptionPane.showMessageDialog(null,"file error!");
                     }
                 }
             });

             CreateAccountButton.setBounds(550,200,200,50);
             CreateAccountButton.setFont(new Font(Font.SERIF,Font.ITALIC,30));
             CreateAccountButton.setText("Create Account");
             CreateAccountButton.setForeground(new Color(rF,gF,bF));
             CreateAccountButton.setBackground(new Color(rB,gB,bB));
             CreateAccountButton.setBorder(BorderFactory.createLineBorder(new Color(rB,gB,bB)));
             CreateAccountButton.setFocusable(false);

             CreateAccountButton.addMouseListener(new MouseAdapter() {  //change cursor on mouse hover
                 public void mouseEntered(MouseEvent evt) {

                     CreateAccountButton.setBackground(new Color(rF,gF,bF));
                     CreateAccountButton.setForeground(new Color(rB,gB,bB));
                     CreateAccountButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                 }

                 public void mouseExited(MouseEvent evt) {

                     CreateAccountButton.setBackground(new Color(rB,gB,bB));
                     CreateAccountButton.setForeground(new Color(rF,gF,bF));
                     CreateAccountButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                 }


                 public void mouseClicked(MouseEvent e) {
                     frame.dispose();
                     new CreateAccount(temp1, temp2, temp3, dark);
                 }
             });

             CheckDetailButton.setBounds(550,400,200,50);
             CheckDetailButton.setFont(new Font(Font.SERIF,Font.ITALIC,30));
             CheckDetailButton.setText("Check Detail");
             CheckDetailButton.setForeground(new Color(rF,gF,bF));
             CheckDetailButton.setBackground(new Color(rB,gB,bB));
             CheckDetailButton.setBorder(BorderFactory.createLineBorder(new Color(rB,gB,bB)));
             CheckDetailButton.setFocusable(false);

             CheckDetailButton.addMouseListener(new MouseAdapter() {  //change cursor on mouse hover
                 public void mouseEntered(MouseEvent evt) {

                     CheckDetailButton.setBackground(new Color(rF,gF,bF));
                     CheckDetailButton.setForeground(new Color(rB,gB,bB));
                     CheckDetailButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                 }

                 public void mouseExited(MouseEvent evt) {

                     CheckDetailButton.setBackground(new Color(rB,gB,bB));
                     CheckDetailButton.setForeground(new Color(rF,gF,bF));
                     CheckDetailButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                 }

                 public void mousePressed(MouseEvent e) {
                     frame.dispose();
                     new CheckAccountDetail(temp1,temp2,temp3,dark);

                 }
             });

             DeleteAccountButton.setBounds(550,300,200,50);
             DeleteAccountButton.setFont(new Font(Font.SERIF,Font.ITALIC,30));
             DeleteAccountButton.setText("Delete Account");
             DeleteAccountButton.setForeground(new Color(rF,gF,bF));
             DeleteAccountButton.setBackground(new Color(rB,gB,bB));
             DeleteAccountButton.setBorder(BorderFactory.createLineBorder(new Color(rB,gB,bB)));
             DeleteAccountButton.setFocusable(false);

             DeleteAccountButton.addMouseListener(new MouseAdapter() {  //change cursor on mouse hover
                 public void mouseEntered(MouseEvent evt) {

                     DeleteAccountButton.setBackground(new Color(rF,gF,bF));
                     DeleteAccountButton.setForeground(new Color(rB,gB,bB));
                     DeleteAccountButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                 }

                 public void mouseExited(MouseEvent evt) {

                     DeleteAccountButton.setBackground(new Color(rB,gB,bB));
                     DeleteAccountButton.setForeground(new Color(rF,gF,bF));
                     DeleteAccountButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                 }

                 public void mousePressed(MouseEvent e) {

                     frame.dispose();
                     new DeleteAccount(temp1, temp2, temp3,dark);

                 }
             });

             LogoutButton.setBounds(5,620,120,50);
             LogoutButton.setFont(new Font(Font.SERIF,Font.ITALIC,25));
             LogoutButton.setText("Logout");
             LogoutButton.setForeground(new Color(rF,gF,bF));
             LogoutButton.setBackground(new Color(rB,gB,bB));
             LogoutButton.setBorder(BorderFactory.createLineBorder(new Color(rB,gB,bB)));
             LogoutButton.setFocusable(false);

             LogoutButton.addMouseListener(new MouseAdapter() {  //change cursor on mouse hover
                 public void mouseEntered(MouseEvent evt) {

                     LogoutButton.setBackground(new Color(rF,gF,bF));
                     LogoutButton.setForeground(new Color(rB,gB,bB));
                     LogoutButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                 }

                 public void mouseExited(MouseEvent evt) {

                     LogoutButton.setBackground(new Color(rB,gB,bB));
                     LogoutButton.setForeground(new Color(rF,gF,bF));
                     LogoutButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                 }


                 public void mouseClicked(MouseEvent e) {
                     IdAndPasswords idandpasswords = new IdAndPasswords();
                     frame.dispose();
                      new LoginPage(idandpasswords.getLoginInfo(),temp1,temp2,temp3,frame.getContentPane().getBackground());

                 }
             });


         }



}
