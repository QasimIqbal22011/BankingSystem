import com.opencsv.CSVWriter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;

public class DeleteAccount {

    int rB, gB, bB;
    int rF, gF, bF;

    JFrame frame = new JFrame();

    JLabel AccountNo = new JLabel();

    JTextField AccountNoField = new JTextField();

    JButton BackButton=new JButton();

    JButton EnterButton = new JButton();

    DeleteAccount(String temp1, String temp2, String temp3,  Color Dark)
    {

        ThemeCheckDeleteAccount(temp1,temp2,temp3,Dark);

        frame.add(AccountNo);
        frame.add(AccountNoField);
        frame.add(BackButton);
        frame.add(EnterButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280,720);
        frame.setLayout(null);
        frame.setTitle("Transaction Panel");
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);


        frame.setVisible(true);

    }

    void ThemeCheckDeleteAccount(String temp1, String temp2, String temp3, Color dark) {
        if (dark.equals(new Color(24, 30, 40))) {

            rB = 24;
            gB = 30;
            bB = 40;
            rF = 57;
            gF = 255;
            bF = 20;

            DisplayDeleteAccount(temp1, temp2, temp3,dark);
        } else if (dark.equals(new Color(0, 0, 0))) {
            rB = 0;
            gB = 0;
            bB = 0;
            rF = 255;
            gF = 255;
            bF = 0;

            DisplayDeleteAccount(temp1, temp2, temp3,dark);
        } else if (dark.equals(new Color(56, 2, 14))) {
            rB = 56;
            gB = 2;
            bB = 14;
            rF = 255;
            gF = 255;
            bF = 255;

            DisplayDeleteAccount(temp1, temp2, temp3,dark);
        } else {

            rB = 255;
            gB = 255;
            bB = 255;
            rF = 0;
            gF = 0;
            bF = 0;

            DisplayDeleteAccount(temp1, temp2, temp3,dark);
        }
    }

    void DisplayDeleteAccount(String temp1,String temp2,String temp3,Color dark)
    {
        frame.getContentPane().setBackground(new Color(rB, gB, bB));


        AccountNo.setBounds(400, 300, 220, 50);
        AccountNo.setText("Account Number:");
        AccountNo.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        AccountNo.setForeground(new Color(rF, gF, bF));

        AccountNoField.setBounds(630, 300, 300, 50);
        AccountNoField.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        AccountNoField.setHorizontalAlignment(JTextField.CENTER);
        AccountNoField.setForeground(new Color(rF, gF, bF));
        AccountNoField.setBackground(new Color(rB, gB, bB));
        AccountNoField.setSelectionColor(new Color(rF, gF, bF));
        AccountNoField.setBorder(BorderFactory.createLineBorder(new Color(rF, gF, bF), 2, true));
        AccountNoField.setCaretColor(new Color(rF, gF, bF));



        AccountNoField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_ENTER))) {

                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(frame,"Enter a number!","Invalid Input",JOptionPane.INFORMATION_MESSAGE);
                    e.consume();
                }

            }

            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER)
                {
                    if(AccountNoField.getText().equals("") )
                    {

                        Toolkit.getDefaultToolkit().beep();
                        JOptionPane.showMessageDialog(frame,"Account Number Field is Empty!","Account Number field error!",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        DeleteAccountNo();
                    }
                }
            }
        });

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

        EnterButton.setBounds(1100, 625, 150, 50);
        EnterButton.setText("Delete");
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

            @Override
            public void mouseClicked(MouseEvent e) {


                if(AccountNoField.getText().equals("") )
                {

                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(frame,"Account Number Field is Empty!","Account Number field error!",JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {

                    DeleteAccountNo();
//                    Toolkit.getDefaultToolkit().beep();
//                    JOptionPane.showMessageDialog(frame,"Account Deleted","Delete Account",JOptionPane.INFORMATION_MESSAGE);
//                    AccountNoField.setText("");
                }


            }


        });


    }

    void DeleteAccountNo()
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


               if(row[0].contains(String.valueOf(AccountNoField.getText())))
                {
                    writer.writeNext(null);
                    check=0;

                }
                else
                {

                    writer.writeNext(row);

                }

            }
            if(check == 1)
            {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(frame,"Account Doesn't Exist","Delete Account",JOptionPane.INFORMATION_MESSAGE);
                AccountNoField.setText("");
            }
            else
            {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(frame,"Account Deleted","Delete Account",JOptionPane.INFORMATION_MESSAGE);
                AccountNoField.setText("");
            }



            reader.close();
            writer.close();
            OldFile.delete();
            NewFile.renameTo(OldFile);

        }
        catch (Exception e)
        {
            e.printStackTrace();

        }
    }


    }


