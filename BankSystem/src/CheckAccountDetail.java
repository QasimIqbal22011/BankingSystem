import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class CheckAccountDetail {
    int rB, gB, bB;
    int rF, gF, bF;


    JFrame AccountFrame = new JFrame();
    JFrame frame = new JFrame();

    JLabel BalanceLabel = new JLabel();

    JLabel AccountNumber = new JLabel();

    JLabel AccountNumberLabel = new JLabel();

    JLabel BalanceAmountLabel = new JLabel();

    JLabel AccountHolderName = new JLabel();

    JLabel AccountHolder = new JLabel();

    JButton BackButton = new JButton();

    JLabel EnterAccountNo = new JLabel();

    JTextField EnterAccountTextField = new JTextField();

    JButton BackButtonTakeAccount=new JButton();

    JButton EnterButton = new JButton();




    CheckAccountDetail(String temp1, String temp2, String temp3, Color Dark) {

        ThemeCheckTakeAccount(temp1,temp2,temp3,Dark);


    }


    void ThemeCheckAccountDetail(String temp1, String temp2, String temp3, Color dark) {
        if (dark.equals(new Color(24, 30, 40))) {

            rB = 24;
            gB = 30;
            bB = 40;
            rF = 57;
            gF = 255;
            bF = 20;

            DisplayAccountDetail(temp1, temp2, temp3,dark);
        } else if (dark.equals(new Color(0, 0, 0))) {
            rB = 0;
            gB = 0;
            bB = 0;
            rF = 255;
            gF = 255;
            bF = 0;

            DisplayAccountDetail(temp1, temp2, temp3,dark);
        } else if (dark.equals(new Color(56, 2, 14))) {
            rB = 56;
            gB = 2;
            bB = 14;
            rF = 255;
            gF = 255;
            bF = 255;

            DisplayAccountDetail(temp1, temp2, temp3,dark);
        } else {

            rB = 255;
            gB = 255;
            bB = 255;
            rF = 0;
            gF = 0;
            bF = 0;

            DisplayAccountDetail(temp1, temp2, temp3,dark);
        }
    }

    void ThemeCheckTakeAccount(String temp1, String temp2, String temp3,Color dark) {
        if (dark.equals(new Color(24, 30, 40))) {

            rB = 24;
            gB = 30;
            bB = 40;
            rF = 57;
            gF = 255;
            bF = 20;

            TakeAccountNo(temp1, temp2, temp3,dark);
        } else if (dark.equals(new Color(0, 0, 0))) {
            rB = 0;
            gB = 0;
            bB = 0;
            rF = 255;
            gF = 255;
            bF = 0;

            TakeAccountNo(temp1, temp2, temp3,dark);
        } else if (dark.equals(new Color(56, 2, 14))) {
            rB = 56;
            gB = 2;
            bB = 14;
            rF = 255;
            gF = 255;
            bF = 255;

            TakeAccountNo(temp1, temp2, temp3,dark);
        } else {

            rB = 255;
            gB = 255;
            bB = 255;
            rF = 0;
            gF = 0;
            bF = 0;

            TakeAccountNo(temp1, temp2, temp3,dark);
        }
    }

    void TakeAccountNo(String temp1, String temp2, String temp3,Color Dark)
    {

        AccountFrame.add(EnterAccountNo);
        AccountFrame.add(EnterAccountTextField);
        AccountFrame.add(BackButtonTakeAccount);
        AccountFrame.add(EnterButton);

        AccountFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AccountFrame.setSize(1280, 720);
        AccountFrame.setLayout(null);
        AccountFrame.setTitle("Account Detail Panel");
        AccountFrame.setResizable(false);
        AccountFrame.setLocationRelativeTo(null);
        AccountFrame.getContentPane().setBackground(new Color(rB, gB, bB));

        AccountFrame.setVisible(true);


        EnterAccountNo.setBounds(400, 300, 250, 50);
        EnterAccountNo.setText("Enter Account No:");
        EnterAccountNo.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        EnterAccountNo.setForeground(new Color(rF, gF, bF));
        EnterAccountNo.setBackground(new Color(rB, gB, bB));

        EnterAccountTextField.setBounds(650, 300, 300, 50);
        EnterAccountTextField.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        EnterAccountTextField.setHorizontalAlignment(JTextField.CENTER);
        EnterAccountTextField.setForeground(new Color(rF, gF, bF));
        EnterAccountTextField.setBackground(new Color(rB, gB, bB));
        EnterAccountTextField.setSelectionColor(new Color(rF, gF, bF));
        EnterAccountTextField.setBorder(BorderFactory.createLineBorder(new Color(rF, gF, bF), 2, true));
        EnterAccountTextField.setCaretColor(new Color(rF, gF, bF));

        EnterAccountTextField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_ENTER) )) {

                    JOptionPane.showMessageDialog(null,"Invalid Number!");
                    e.consume();
                }
            }


            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER)
                {
                    String file = "database.csv";
//                String Temp = "temp.csv";
                    BufferedReader reader = null;
                    String line = "";
                    int check=1;

                    try {

                        File OldFile = new File(file);

                        reader=new BufferedReader(new FileReader(file));

                        while ((line = reader.readLine()) != null)
                        {
                            String[] row=line.split(",");


                            if(row[0].contains(String.valueOf(EnterAccountTextField.getText())))
                            {

                                check=0;

                            }



                        }
                        if(check == 1)
                        {
                            Toolkit.getDefaultToolkit().beep();
                            JOptionPane.showMessageDialog(frame,"Account Doesn't Exist","Delete Account",JOptionPane.INFORMATION_MESSAGE);
                            EnterAccountTextField.setText("");
                        }
                        else
                        {
                            reader.close();
                            ThemeCheckAccountDetail(temp1, temp2, temp3,Dark);
                        }




                    }
                    catch (Exception j)
                    {
                        j.printStackTrace();

                    }
                }



            }
        });

        BackButtonTakeAccount.setBounds(0, 625, 150, 50);
        BackButtonTakeAccount.setText("Back");
        BackButtonTakeAccount.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        BackButtonTakeAccount.setBackground(new Color(rB, gB, bB));
        BackButtonTakeAccount.setForeground(new Color(rF, gF, bF));
        BackButtonTakeAccount.setBorder(BorderFactory.createLineBorder(new Color(rB, gB, bB), 2, false));
        BackButtonTakeAccount.setFocusable(false);

        BackButtonTakeAccount.addMouseListener(new MouseAdapter() {   //Change cursor on hover
            public void mouseEntered(MouseEvent evt) {
                BackButtonTakeAccount.setBackground(new Color(rF,gF,bF));
                BackButtonTakeAccount.setForeground(new Color(rB, gB, bB));
                BackButtonTakeAccount.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            }

            public void mouseExited(MouseEvent evt) {
                BackButtonTakeAccount.setBackground(new Color(rB, gB, bB));
                BackButtonTakeAccount.setForeground(new Color(rF, gF, bF));
                BackButtonTakeAccount.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

            }

            public void mouseClicked(MouseEvent e) {

                if(e.getSource()==BackButtonTakeAccount)
                {
                    AccountFrame.dispose();
                    new MainMenu(temp1,temp2,temp3,AccountFrame.getContentPane().getBackground());
                }
            }
        });

        EnterButton.setBounds(1100, 625, 150, 50);
        EnterButton.setText("Continue");
        EnterButton.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        EnterButton.setBackground(new Color(rB, gB, bB));
        EnterButton.setForeground(new Color(rF, gF, bF));
        EnterButton.setBorder(BorderFactory.createLineBorder(new Color(rB, gB, bB), 2, false));
        EnterButton.setFocusable(false);

        EnterButton.addMouseListener(new MouseAdapter() {   //Change cursor on hover
            public void mouseEntered(MouseEvent evt) {
                EnterButton.setBackground(new Color(rF,gF,bF));
                EnterButton.setForeground(new Color(rB, gB, bB));
                EnterButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            }

            public void mouseExited(MouseEvent evt) {
                EnterButton.setBackground(new Color(rB, gB, bB));
                EnterButton.setForeground(new Color(rF, gF, bF));
                EnterButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

            }


            public void mouseClicked(MouseEvent e) {

                String file = "database.csv";
//                String Temp = "temp.csv";
                BufferedReader reader = null;
                String line = "";
                int check=1;

                try {

                    File OldFile = new File(file);

                    reader=new BufferedReader(new FileReader(file));

                    while ((line = reader.readLine()) != null)
                    {
                        String[] row=line.split(",");


                        if(row[0].contains(String.valueOf(EnterAccountTextField.getText())))
                        {

                            check=0;

                        }



                    }
                    if(check == 1)
                    {
                        Toolkit.getDefaultToolkit().beep();
                        JOptionPane.showMessageDialog(frame,"Account Doesn't Exist","Delete Account",JOptionPane.INFORMATION_MESSAGE);
                        EnterAccountTextField.setText("");
                    }
                    else
                    {
                        reader.close();
                        ThemeCheckAccountDetail(temp1, temp2, temp3,Dark);
                    }




                }
                catch (Exception j)
                {
                    j.printStackTrace();

                }
            }







    });

}


    void DisplayAccountDetail(String temp1, String temp2, String temp3,Color Dark) {

        frame.add(BalanceAmountLabel);
        frame.add(BalanceLabel);
        frame.add(AccountHolderName);
        frame.add(AccountHolder);
        frame.add(AccountNumber);
        frame.add(AccountNumberLabel);
        frame.add(BackButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 720);
        frame.setLayout(null);
        frame.setTitle("Account Detail Panel");
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);

        String File = "database.csv";
        BufferedReader reader = null;
        String line = "";
        String amount="",name="",id="";

        try {
            reader=new BufferedReader(new FileReader(File));
            while ((line = reader.readLine()) != null)
            {
                String[] row=line.split(",");

                if(row[0].contains(EnterAccountTextField.getText()))
                {
                    id =row[0];
                    name=row[1];
                    amount=row[2];

                }

            }
            reader.close();


        }
        catch (Exception e)
        {
            e.printStackTrace();

        }

        frame.getContentPane().setBackground(new Color(rB, gB, bB));

        AccountNumber.setBounds(400, 100, 230, 50);
        AccountNumber.setText("Account Number:");
        AccountNumber.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        AccountNumber.setForeground(new Color(rF, gF, bF));

        AccountNumberLabel.setBounds(650, 100, 300, 50);
        AccountNumberLabel.setText(id);
        AccountNumberLabel.setHorizontalAlignment(JLabel.CENTER);
        AccountNumberLabel.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        AccountNumberLabel.setForeground(new Color(rF, gF, bF));
        AccountNumberLabel.setBorder(BorderFactory.createLineBorder(new Color(rF, gF, bF), 2, true));
        AccountNumberLabel.setBackground(new Color(rB, gB, bB));

        AccountHolder.setBounds(400, 200, 230, 50);
        AccountHolder.setText("Holder's Name:");
        AccountHolder.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        AccountHolder.setForeground(new Color(rF, gF, bF));

        AccountHolderName.setBounds(650, 200, 300, 50);
        AccountHolderName.setText(name);
        AccountHolderName.setHorizontalAlignment(JLabel.CENTER);
        AccountHolderName.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        AccountHolderName.setForeground(new Color(rF, gF, bF));
        AccountHolderName.setBorder(BorderFactory.createLineBorder(new Color(rF, gF, bF), 2, true));
        AccountHolderName.setBackground(new Color(rB, gB, bB));

        BalanceLabel.setBounds(400, 300, 230, 50);
        BalanceLabel.setText("Your Balance Is:");
        BalanceLabel.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        BalanceLabel.setForeground(new Color(rF, gF, bF));

        BalanceAmountLabel.setBounds(650, 300, 300, 50);
        BalanceAmountLabel.setText(amount);
        BalanceAmountLabel.setHorizontalAlignment(JLabel.CENTER);
        BalanceAmountLabel.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        BalanceAmountLabel.setForeground(new Color(rF, gF, bF));
        BalanceAmountLabel.setBorder(BorderFactory.createLineBorder(new Color(rF, gF, bF), 2, true));
        BalanceAmountLabel.setBackground(new Color(rB, gB, bB));


        BackButton.setBounds(0, 625, 150, 50);
        BackButton.setText("Back");
        BackButton.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        BackButton.setBackground(new Color(rB, gB, bB));
        BackButton.setForeground(new Color(rF, gF, bF));
        BackButton.setBorder(BorderFactory.createLineBorder(new Color(rB, gB, bB), 2, false));
        BackButton.setFocusable(false);

        BackButton.addMouseListener(new MouseAdapter() {   //Change cursor on hover
            public void mouseEntered(MouseEvent evt) {
                BackButton.setBackground(new Color(rF,gF,bF));
                BackButton.setForeground(new Color(rB, gB, bB));
                BackButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            }

            public void mouseExited(MouseEvent evt) {
                BackButton.setBackground(new Color(rB, gB, bB));
                BackButton.setForeground(new Color(rF, gF, bF));
                BackButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

            }

            public void mouseClicked(MouseEvent e) {

                if(e.getSource()==BackButton)
                {
                    frame.dispose();
                    new MainMenu(temp1,temp2,temp3,frame.getContentPane().getBackground());
                }
            }
        });
    }


}
