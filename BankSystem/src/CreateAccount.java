import com.opencsv.CSVWriter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;

public class CreateAccount {

    int rB, gB, bB;
    int rF, gF, bF;

    JFrame frame = new JFrame();

    JLabel EnterAccountNumber = new JLabel();

    JLabel EnterAccountHolderName = new JLabel();

    JLabel EnterInitialDeposit = new JLabel();

    JTextField AccountNumberTextField = new JTextField();

    JTextField HolderNameTextField = new JTextField();

    JTextField InitialDepositTextField = new JTextField();

    JButton AddAccount = new JButton();

    JButton BackButton = new JButton();


    CreateAccount(String temp1, String temp2, String temp3, Color dark){

        ThemeCheckCreateAccount(temp1, temp2, temp3, dark);

        frame.add(EnterAccountHolderName);
        frame.add(EnterAccountNumber);
        frame.add(EnterInitialDeposit);
        frame.add(AccountNumberTextField);
        frame.add(HolderNameTextField);
        frame.add(InitialDepositTextField);
        frame.add(AddAccount);
        frame.add(BackButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 720);
        frame.setLayout(null);
        frame.setTitle("Account Detail Panel");
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }

    void ThemeCheckCreateAccount(String temp1, String temp2, String temp3, Color dark) {
        if (dark.equals(new Color(24, 30, 40))) {

            rB = 24;
            gB = 30;
            bB = 40;
            rF = 57;
            gF = 255;
            bF = 20;

            DisplayCreateAccount(temp1, temp2, temp3,dark);
        } else if (dark.equals(new Color(0, 0, 0))) {
            rB = 0;
            gB = 0;
            bB = 0;
            rF = 255;
            gF = 255;
            bF = 0;

            DisplayCreateAccount(temp1, temp2, temp3,dark);
        } else if (dark.equals(new Color(56, 2, 14))) {
            rB = 56;
            gB = 2;
            bB = 14;
            rF = 255;
            gF = 255;
            bF = 255;

            DisplayCreateAccount(temp1, temp2, temp3,dark);
        } else {

            rB = 255;
            gB = 255;
            bB = 255;
            rF = 0;
            gF = 0;
            bF = 0;

            DisplayCreateAccount(temp1, temp2, temp3,dark);
        }
    }

    void DisplayCreateAccount(String temp1, String temp2, String temp3, Color dark)
    {
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


            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER || e.getKeyCode()==KeyEvent.VK_DOWN  )
                {
                    InitialDepositTextField.requestFocus();
                }
                else if(e.getKeyCode()==KeyEvent.VK_UP)
                {
                    AccountNumberTextField.requestFocus();
                }
        }
        });


        EnterInitialDeposit.setBounds(400, 300, 230, 50);
        EnterInitialDeposit.setText("Your Balance Is:");
        EnterInitialDeposit.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        EnterInitialDeposit.setForeground(new Color(rF, gF, bF));

        InitialDepositTextField.setBounds(650, 300, 300, 50);
        InitialDepositTextField.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        InitialDepositTextField.setHorizontalAlignment(JTextField.CENTER);
        InitialDepositTextField.setForeground(new Color(rF, gF, bF));
        InitialDepositTextField.setBackground(new Color(rB, gB, bB));
        InitialDepositTextField.setSelectionColor(new Color(rF, gF, bF));
        InitialDepositTextField.setBorder(BorderFactory.createLineBorder(new Color(rF, gF, bF), 2, true));
        InitialDepositTextField.setCaretColor(new Color(rF, gF, bF));

        InitialDepositTextField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_ENTER) || (c == '.') )) {


                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(frame,"Enter only number","Amount field error!",JOptionPane.INFORMATION_MESSAGE);
                    e.consume();
                }
            }

            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_UP )
                {
                   HolderNameTextField.requestFocus();
                }
                else if (e.getKeyCode()==KeyEvent.VK_ENTER)
                {

                }
            }
        });

        AddAccount.setBounds(700, 500, 250, 50);
        AddAccount.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        AddAccount.setText("Add Account");
        AddAccount.setBackground(new Color(rB, gB, bB));
        AddAccount.setForeground(new Color(rF, gF, bF));
        AddAccount.setBorder(BorderFactory.createLineBorder(new Color(rB, gB, bB), 2, false));
        AddAccount.setFocusable(false);

        AddAccount.addMouseListener(new MouseAdapter() {   //Change cursor on hover
            public void mouseEntered(MouseEvent evt) {
                AddAccount.setBackground(new Color(rF,gF,bF));
                AddAccount.setForeground(new Color(rB, gB, bB));
                AddAccount.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            }

            public void mouseExited(MouseEvent evt) {
                AddAccount.setBackground(new Color(rB, gB, bB));
                AddAccount.setForeground(new Color(rF, gF, bF));
                AddAccount.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

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
                        id = row[0];
                        name = row[1];



                        if ((id.contains(String.valueOf(AccountNumberTextField.getText()))))
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
                        AddAccountToDatabase();

                    }

                } catch (Exception j) {
                    j.printStackTrace();

                } finally {
                    try {
                        reader.close();
                    } catch (IOException j) {
                        j.printStackTrace();
                    }

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


    void AddAccountToDatabase()
    {
        String file = "database.csv";
        String[] Data={AccountNumberTextField.getText(),HolderNameTextField.getText(),InitialDepositTextField.getText()};

        BufferedReader reader = null;
        String line = "";

        System.out.printf(Data[0]+"\n"+Data[1]+"\n"+Data[2]);


        try {

            File OldFile = new File(file);

            CSVWriter writer = new CSVWriter(new FileWriter(file,true),
                    CSVWriter.DEFAULT_SEPARATOR,
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.RFC4180_LINE_END);
            reader=new BufferedReader(new FileReader(file));

                    writer.writeNext(Data);

            reader.close();
            writer.close();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(frame,"Account Created Successfully!","Account Creation",JOptionPane.INFORMATION_MESSAGE);

        }
        catch (Exception e)
        {
            e.printStackTrace();

        }
    }



    }


