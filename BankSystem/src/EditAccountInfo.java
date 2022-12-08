import com.opencsv.CSVWriter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;

public class EditAccountInfo {

    int rB, gB, bB;
    int rF, gF, bF;

    JFrame frame = new JFrame();

    JFrame AccountFrame = new JFrame();

    JLabel EnterAccountNumber = new JLabel();

    JLabel DisplayAccountNumber = new JLabel();

    JLabel EnterAccountHolderName = new JLabel();

    JTextField AccountNumberTextField = new JTextField();

    JTextField DisplayAccountNumberTextField = new JTextField();


    JTextField HolderNameTextField = new JTextField();

    JButton EditAccount = new JButton();

    JButton DisplayEditAccount = new JButton();

    JButton BackButton = new JButton();

    JButton DisplayBackButton = new JButton();

    EditAccountInfo(String temp1, String temp2, String temp3,Color Dark)
    {

        ThemeCheckEditAccountNumber(temp1, temp2, temp3, Dark);


    }

    void ThemeCheckEditAccount(String temp1, String temp2, String temp3, Color dark) {
        if (dark.equals(new Color(24, 30, 40))) {

            rB = 24;
            gB = 30;
            bB = 40;
            rF = 57;
            gF = 255;
            bF = 20;

            DisplayEditAccount(temp1, temp2, temp3,dark);
        } else if (dark.equals(new Color(0, 0, 0))) {
            rB = 0;
            gB = 0;
            bB = 0;
            rF = 255;
            gF = 255;
            bF = 0;

            DisplayEditAccount(temp1, temp2, temp3,dark);
        } else if (dark.equals(new Color(56, 2, 14))) {
            rB = 56;
            gB = 2;
            bB = 14;
            rF = 255;
            gF = 255;
            bF = 255;

            DisplayEditAccount(temp1, temp2, temp3,dark);
        } else {

            rB = 255;
            gB = 255;
            bB = 255;
            rF = 0;
            gF = 0;
            bF = 0;

            DisplayEditAccount(temp1, temp2, temp3,dark);
        }
    }

    void ThemeCheckEditAccountNumber(String temp1, String temp2, String temp3, Color dark) {
        if (dark.equals(new Color(24, 30, 40))) {

            rB = 24;
            gB = 30;
            bB = 40;
            rF = 57;
            gF = 255;
            bF = 20;

            EditAccountNumber(temp1, temp2, temp3,dark);
        } else if (dark.equals(new Color(0, 0, 0))) {
            rB = 0;
            gB = 0;
            bB = 0;
            rF = 255;
            gF = 255;
            bF = 0;

            EditAccountNumber(temp1, temp2, temp3,dark);
        } else if (dark.equals(new Color(56, 2, 14))) {
            rB = 56;
            gB = 2;
            bB = 14;
            rF = 255;
            gF = 255;
            bF = 255;

            EditAccountNumber(temp1, temp2, temp3,dark);
        } else {

            rB = 255;
            gB = 255;
            bB = 255;
            rF = 0;
            gF = 0;
            bF = 0;

            EditAccountNumber(temp1, temp2, temp3,dark);
        }
    }

    void DisplayEditAccount(String temp1, String temp2, String temp3,Color Dark)
    {

        frame.add(EnterAccountHolderName);
        frame.add(EnterAccountNumber);
        frame.add(AccountNumberTextField);
        frame.add(HolderNameTextField);
        frame.add(EditAccount);
        frame.add(BackButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 720);
        frame.setLayout(null);
        frame.setTitle("Account Detail Panel");
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(rB, gB, bB));

        EnterAccountNumber.setBounds(400, 100, 250, 50);
        EnterAccountNumber.setText("Enter Account No:");
        EnterAccountNumber.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        EnterAccountNumber.setForeground(new Color(rF, gF, bF));
        EnterAccountNumber.setBackground(new Color(rB, gB, bB));

        AccountNumberTextField.setBounds(650, 100, 300, 50);
        AccountNumberTextField.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        AccountNumberTextField.setHorizontalAlignment(JTextField.CENTER);
        AccountNumberTextField.setForeground(new Color(rF, gF, bF));
        AccountNumberTextField.setBackground(new Color(rB, gB, bB));
        AccountNumberTextField.setSelectionColor(new Color(rF, gF, bF));
        AccountNumberTextField.setBorder(BorderFactory.createLineBorder(new Color(rF, gF, bF), 2, true));
        AccountNumberTextField.setCaretColor(new Color(rF, gF, bF));

        AccountNumberTextField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_ENTER) )) {

                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(frame,"Enter only number","Amount field error!",JOptionPane.INFORMATION_MESSAGE);
                    e.consume();
                }
            }


            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER || e.getKeyCode()==KeyEvent.VK_DOWN )
                {
                    HolderNameTextField.requestFocus();
                }
            }
        });

        EnterAccountHolderName.setBounds(400, 200, 230, 50);
        EnterAccountHolderName.setText("Holder's Name:");
        EnterAccountHolderName.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        EnterAccountHolderName.setForeground(new Color(rF, gF, bF));

        HolderNameTextField.setBounds(650, 200, 300, 50);
        HolderNameTextField.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        HolderNameTextField.setHorizontalAlignment(JTextField.CENTER);
        HolderNameTextField.setForeground(new Color(rF, gF, bF));
        HolderNameTextField.setBackground(new Color(rB, gB, bB));
        HolderNameTextField.setSelectionColor(new Color(rF, gF, bF));
        HolderNameTextField.setBorder(BorderFactory.createLineBorder(new Color(rF, gF, bF), 2, true));
        HolderNameTextField.setCaretColor(new Color(rF, gF, bF));

        HolderNameTextField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!((c >= 'a' || c >= 'A') && (c <= 'z' || c <= 'Z') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_ENTER) )) {

                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(frame,"Enter only Alphabet","Holder's name field error",JOptionPane.INFORMATION_MESSAGE);
                    e.consume();
                }
            }


//            public void keyPressed(KeyEvent e) {
//                if(e.getKeyCode()==KeyEvent.VK_ENTER || e.getKeyCode()==KeyEvent.VK_DOWN  )
//                {
//                    InitialDepositTextField.requestFocus();
//                }
//                else if(e.getKeyCode()==KeyEvent.VK_UP)
//                {
//                    AccountNumberTextField.requestFocus();
//                }
//            }
        });



        EditAccount.setBounds(700, 500, 250, 50);
        EditAccount.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        EditAccount.setText("Edit Account");
        EditAccount.setBackground(new Color(rB, gB, bB));
        EditAccount.setForeground(new Color(rF, gF, bF));
        EditAccount.setBorder(BorderFactory.createLineBorder(new Color(rB, gB, bB), 2, false));
        EditAccount.setFocusable(false);

        EditAccount.addMouseListener(new MouseAdapter() {   //Change cursor on hover
            public void mouseEntered(MouseEvent evt) {
                EditAccount.setBackground(new Color(rF,gF,bF));
                EditAccount.setForeground(new Color(rB, gB, bB));
                EditAccount.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            }

            public void mouseExited(MouseEvent evt) {
                EditAccount.setBackground(new Color(rB, gB, bB));
                EditAccount.setForeground(new Color(rF, gF, bF));
                EditAccount.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

            }

            @Override
            public void mouseClicked(MouseEvent e) {

                String File = "database.csv";
                BufferedReader reader = null;
                String line = "";


                int check=0;
                try {
                    reader = new BufferedReader(new FileReader(File));
                    while ((line = reader.readLine()) != null) {
                        String[] row = line.split(",");
                        String id,name,balance;

                        if((row[0].contains(String.valueOf(DisplayAccountNumberTextField.getText()))))
                        {
                            row[0]="";
                            row[1]="";
                        }

                        id = row[0];
                        name = row[1];

                        if ((id.contains(String.valueOf(AccountNumberTextField.getText()))) )
                        {
                            Toolkit.getDefaultToolkit().beep();
                            JOptionPane.showMessageDialog(frame,"Account number Already Exist","Account Already Exits",JOptionPane.INFORMATION_MESSAGE);
                            AccountNumberTextField.setText("");
                            check++;
                            break;
                        }
                        else if((name.contains(String.valueOf(HolderNameTextField.getText()))))
                        {
                            Toolkit.getDefaultToolkit().beep();
                            JOptionPane.showMessageDialog(frame,"Account Holder's Name Already Exist","Account Already Exits",JOptionPane.INFORMATION_MESSAGE);
                            HolderNameTextField.setText("");
                            check++;
                            break;
                        }


                    }
                    System.out.println(check);
                    if(check==0)
                    {
                        reader.close();
                        EditAccount(temp1, temp2, temp3, Dark);

                    }

                }
                catch (Exception j) {
                    j.printStackTrace();

                }
            }
        });

        BackButton.setBounds(500, 500, 150, 50);
        BackButton.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        BackButton.setText("Back");
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
                frame.dispose();
                new MainMenu(temp1,temp2,temp3,frame.getContentPane().getBackground());
            }
        });
    }

    void EditAccountNumber(String temp1, String temp2, String temp3,Color Dark)
    {

        AccountFrame.add(DisplayAccountNumber);
        AccountFrame.add(DisplayAccountNumberTextField);
        AccountFrame.add(DisplayBackButton);
        AccountFrame.add(DisplayEditAccount);

        AccountFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AccountFrame.setSize(1280, 720);
        AccountFrame.setLayout(null);
        AccountFrame.setTitle("Account Detail Panel");
        AccountFrame.setResizable(false);
        AccountFrame.setLocationRelativeTo(null);

        AccountFrame.setVisible(true);
        AccountFrame.getContentPane().setBackground(new Color(rB, gB, bB));


        DisplayAccountNumber.setBounds(400, 300, 250, 50);
        DisplayAccountNumber.setText("Enter Account No:");
        DisplayAccountNumber.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        DisplayAccountNumber.setForeground(new Color(rF, gF, bF));
        DisplayAccountNumber.setBackground(new Color(rB, gB, bB));

        DisplayAccountNumberTextField.setBounds(650, 300, 300, 50);
        DisplayAccountNumberTextField.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        DisplayAccountNumberTextField.setHorizontalAlignment(JTextField.CENTER);
        DisplayAccountNumberTextField.setForeground(new Color(rF, gF, bF));
        DisplayAccountNumberTextField.setBackground(new Color(rB, gB, bB));
        DisplayAccountNumberTextField.setSelectionColor(new Color(rF, gF, bF));
        DisplayAccountNumberTextField.setBorder(BorderFactory.createLineBorder(new Color(rF, gF, bF), 2, true));
        DisplayAccountNumberTextField.setCaretColor(new Color(rF, gF, bF));

        DisplayAccountNumberTextField.addKeyListener(new KeyAdapter() {
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


                            if(row[0].contains(String.valueOf(DisplayAccountNumberTextField.getText())))
                            {
                                AccountNumberTextField.setText(row[0]);
                                HolderNameTextField.setText(row[1]);
                                check=0;

                            }



                        }
                        if(check == 1)
                        {
                            Toolkit.getDefaultToolkit().beep();
                            JOptionPane.showMessageDialog(frame,"Account Doesn't Exist","Delete Account",JOptionPane.INFORMATION_MESSAGE);
                            DisplayAccountNumberTextField.setText("");
                        }
                        else
                        {
                            reader.close();
                            AccountFrame.dispose();
                            ThemeCheckEditAccount(temp1, temp2, temp3,Dark);
                        }




                    }
                    catch (Exception j)
                    {
                        j.printStackTrace();

                    }
                }
            }
        });

        DisplayBackButton.setBounds(0, 625, 150, 50);
        DisplayBackButton.setText("Back");
        DisplayBackButton.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        DisplayBackButton.setBackground(new Color(rB, gB, bB));
        DisplayBackButton.setForeground(new Color(rF, gF, bF));
        DisplayBackButton.setBorder(BorderFactory.createLineBorder(new Color(rB, gB, bB), 2, false));
        DisplayBackButton.setFocusable(false);

        DisplayBackButton.addMouseListener(new MouseAdapter() {   //Change cursor on hover
            public void mouseEntered(MouseEvent evt) {
                DisplayBackButton.setBackground(new Color(rF,gF,bF));
                DisplayBackButton.setForeground(new Color(rB, gB, bB));
                DisplayBackButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            }

            public void mouseExited(MouseEvent evt) {
                DisplayBackButton.setBackground(new Color(rB, gB, bB));
                DisplayBackButton.setForeground(new Color(rF, gF, bF));
                DisplayBackButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

            }

            public void mouseClicked(MouseEvent e) {

                if(e.getSource()==DisplayBackButton)
                {
                    AccountFrame.dispose();
                    new MainMenu(temp1,temp2,temp3,AccountFrame.getContentPane().getBackground());
                }
            }
        });

        DisplayEditAccount.setBounds(1100, 625, 150, 50);
        DisplayEditAccount.setText("Continue");
        DisplayEditAccount.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        DisplayEditAccount.setBackground(new Color(rB, gB, bB));
        DisplayEditAccount.setForeground(new Color(rF, gF, bF));
        DisplayEditAccount.setBorder(BorderFactory.createLineBorder(new Color(rB, gB, bB), 2, false));
        DisplayEditAccount.setFocusable(false);

        DisplayEditAccount.addMouseListener(new MouseAdapter() {   //Change cursor on hover
            public void mouseEntered(MouseEvent evt) {
                DisplayEditAccount.setBackground(new Color(rF,gF,bF));
                DisplayEditAccount.setForeground(new Color(rB, gB, bB));
                DisplayEditAccount.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            }

            public void mouseExited(MouseEvent evt) {
                DisplayEditAccount.setBackground(new Color(rB, gB, bB));
                DisplayEditAccount.setForeground(new Color(rF, gF, bF));
                DisplayEditAccount.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

            }


            public void mouseClicked(MouseEvent j) {

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


                        if(row[0].contains(String.valueOf(DisplayAccountNumberTextField.getText())))
                        {
                           AccountNumberTextField.setText(row[0]);
                           HolderNameTextField.setText(row[1]);
                            check=0;

                        }



                    }
                    if(check == 1)
                    {
                        Toolkit.getDefaultToolkit().beep();
                        JOptionPane.showMessageDialog(frame,"Account Doesn't Exist","Delete Account",JOptionPane.INFORMATION_MESSAGE);
                        DisplayAccountNumberTextField.setText("");
                    }
                    else
                    {
                        reader.close();
                        AccountFrame.dispose();
                        ThemeCheckEditAccount(temp1, temp2, temp3,Dark);
                    }




                }
                catch (Exception e)
                {
                    e.printStackTrace();

                }




            }


        });

    }

    void EditAccount(String temp1,String temp2 ,String temp3 ,Color Dark)
    {
        String file = "database.csv";
        String Temp = "temp.csv";
        BufferedReader reader = null;
        String line = "";
        int check=1;

        try {

            File OldFile = new File(file);
            File NewFile = new File(Temp);

            CSVWriter writer = new CSVWriter(new FileWriter(Temp),
                    CSVWriter.DEFAULT_SEPARATOR,
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.RFC4180_LINE_END);
            reader=new BufferedReader(new FileReader(file));

            while ((line = reader.readLine()) != null)
            {
                String[] row=line.split(",");


                if(row[0].contains(String.valueOf(DisplayAccountNumberTextField.getText())))
                {


                    row[0]=String.valueOf(AccountNumberTextField.getText());
                    row[1]=String.valueOf(HolderNameTextField.getText());

                    writer.writeNext(row);
                    check=0;

                }
                else
                {

                    writer.writeNext(row);

                }

            }


            if(check == 0)
            {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(frame,"Account Edited Successfully","Edit Account",JOptionPane.INFORMATION_MESSAGE);
                AccountNumberTextField.setText("");
                DisplayAccountNumberTextField.setText("");
                HolderNameTextField.setText("");
                reader.close();
                writer.close();
                OldFile.delete();
                NewFile.renameTo(OldFile);
                frame.dispose();
                EditAccountNumber(temp1, temp2, temp3, Dark);


            }





        }
        catch (Exception e)
        {
            e.printStackTrace();

        }
    }
    }




