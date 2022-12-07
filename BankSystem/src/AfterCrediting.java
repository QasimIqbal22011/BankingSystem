import com.opencsv.CSVWriter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.text.DecimalFormat;


public class AfterCrediting  {
    int rB,gB,bB;
    int rF,gF,bF;

    JFrame frame = new JFrame();
    JLabel BalanceLabel = new JLabel();

    JLabel BalanceAmountLabel = new JLabel();
    JLabel AccountNumber = new JLabel();
    JLabel AccountNumberLabel = new JLabel();
    JLabel AccountHolder = new JLabel();
    JLabel AccountHolderName = new JLabel();

    JButton ContinueButton = new JButton();

    JButton ExitButton = new JButton();


    DecimalFormat format = new DecimalFormat("0.00");




    AfterCrediting(String temp1, String temp2, String temp3,String CreditAmount,int Check,Color Dark)
    {



        CheckTheme(temp1, temp2, temp3,CreditAmount,Check,Dark);

        frame.add(BalanceAmountLabel);
        frame.add(BalanceLabel);
        frame.add(AccountHolderName);
        frame.add(AccountHolder);
        frame.add(AccountNumber);
        frame.add(AccountNumberLabel);
        frame.add(ContinueButton);
        frame.add(ExitButton);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280,720);
        frame.setLayout(null);
        frame.setTitle("After Crediting Panel");
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }

    void CheckTheme(String temp1, String temp2, String temp3,String CreditAmount,int Check,Color dark)
    {
        if(dark.equals(new Color(24, 30, 40))) {

            rB = 24;
            gB = 30;
            bB = 40;
            rF = 57;
            gF = 255;
            bF = 20;

            DisplayAfterCrediting(temp1, temp2, temp3,CreditAmount,Check);
        }
        else if(dark.equals(new Color(0, 0, 0))){
            rB = 0;
            gB = 0;
            bB = 0;
            rF = 255;
            gF = 255;
            bF = 0;

            DisplayAfterCrediting(temp1, temp2, temp3,CreditAmount,Check);
        }
        else if(dark.equals(new Color(56, 2, 14))){
            rB = 56;
            gB = 2;
            bB = 14;
            rF = 255;
            gF = 255;
            bF = 255;

            DisplayAfterCrediting(temp1, temp2, temp3,CreditAmount,Check);
        }
        else
        {

            rB = 255;
            gB = 255;
            bB = 255;
            rF = 0;
            gF = 0;
            bF = 0;

            DisplayAfterCrediting(temp1, temp2, temp3,CreditAmount,Check);
        }
    }

    void DisplayAfterCrediting(String temp1, String temp2, String temp3,String CreditAmount,int Check)
    {



        frame.getContentPane().setBackground(new Color(rB, gB, bB));

        AccountNumber.setBounds(400, 100, 230, 50);
        AccountNumber.setText("Account Number:");
        AccountNumber.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        AccountNumber.setForeground(new Color(rF, gF, bF));

        AccountNumberLabel.setBounds(700, 100, 300, 50);
        AccountNumberLabel.setText(temp2);
        AccountNumberLabel.setHorizontalAlignment(JLabel.CENTER);
        AccountNumberLabel.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        AccountNumberLabel.setForeground(new Color(rF, gF, bF));
        AccountNumberLabel.setBorder(BorderFactory.createLineBorder(new Color(rF, gF, bF), 2, true));
        AccountNumberLabel.setBackground(new Color(rB, gB, bB));

        AccountHolder.setBounds(400, 200, 230, 50);
        AccountHolder.setText("Holder's Name:");
        AccountHolder.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        AccountHolder.setForeground(new Color(rF, gF, bF));

        AccountHolderName.setBounds(700, 200, 300, 50);
        AccountHolderName.setText(temp1);
        AccountHolderName.setHorizontalAlignment(JLabel.CENTER);
        AccountHolderName.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        AccountHolderName.setForeground(new Color(rF, gF, bF));
        AccountHolderName.setBorder(BorderFactory.createLineBorder(new Color(rF, gF, bF), 2, true));
        AccountHolderName.setBackground(new Color(rB, gB, bB));

        BalanceLabel.setBounds(400, 300, 250, 50);
        BalanceLabel.setText("Credited Balance Is:");
        BalanceLabel.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        BalanceLabel.setForeground(new Color(rF, gF, bF));

        if (Check==0)
        {


            double Amount=0;
            Amount=Double.parseDouble(temp3)+Double.parseDouble(CreditAmount);


            BalanceAmountLabel.setBounds(700, 300, 300, 50);
            BalanceAmountLabel.setText(format.format(Amount));
            BalanceAmountLabel.setHorizontalAlignment(JLabel.CENTER);
            BalanceAmountLabel.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
            BalanceAmountLabel.setForeground(new Color(rF, gF, bF));
            BalanceAmountLabel.setBorder(BorderFactory.createLineBorder(new Color(rF, gF, bF), 2, true));
            BalanceAmountLabel.setBackground(new Color(rB, gB, bB));

            EditFile(temp1,temp2,temp3,Amount);

        }
        else
        {
            double Amount=0;
            Amount=Double.parseDouble(temp3)-Double.parseDouble(CreditAmount);


            BalanceAmountLabel.setBounds(700, 300, 300, 50);
            BalanceAmountLabel.setText(format.format(Amount));
            BalanceAmountLabel.setHorizontalAlignment(JLabel.CENTER);
            BalanceAmountLabel.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
            BalanceAmountLabel.setForeground(new Color(rF, gF, bF));
            BalanceAmountLabel.setBorder(BorderFactory.createLineBorder(new Color(rF, gF, bF), 2, true));
            BalanceAmountLabel.setBackground(new Color(rB, gB, bB));

            EditFile(temp1,temp2,temp3,Amount);

        }


        ContinueButton.setBounds(700, 500, 350, 50);
        ContinueButton.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        ContinueButton.setText("Continue With Transaction");
        ContinueButton.setBackground(new Color(rB, gB, bB));
        ContinueButton.setForeground(new Color(rF, gF, bF));
        ContinueButton.setBorder(BorderFactory.createLineBorder(new Color(rB, gB, bB), 2, false));
        ContinueButton.setFocusable(false);

        ContinueButton.addMouseListener(new MouseAdapter() {   //Change cursor on hover
            public void mouseEntered(MouseEvent evt) {
                ContinueButton.setBackground(new Color(rF,gF,bF));
                ContinueButton.setForeground(new Color(rB, gB, bB));
                ContinueButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            }

            public void mouseExited(MouseEvent evt) {
                ContinueButton.setBackground(new Color(rB, gB, bB));
                ContinueButton.setForeground(new Color(rF, gF, bF));
                ContinueButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

            }

            public void mouseClicked(MouseEvent e) {

                frame.dispose();
                try {
                    new Transaction(temp1,temp2,temp3,frame.getContentPane().getBackground());
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }


            }
        });

        ExitButton.setBounds(400, 500, 150, 50);
        ExitButton.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        ExitButton.setText("Exit");
        ExitButton.setBackground(new Color(rB, gB, bB));
        ExitButton.setForeground(new Color(rF, gF, bF));
        ExitButton.setBorder(BorderFactory.createLineBorder(new Color(rB, gB, bB), 2, false));
        ExitButton.setFocusable(false);

        ExitButton.addMouseListener(new MouseAdapter() {   //Change cursor on hover
            public void mouseEntered(MouseEvent evt) {
                ExitButton.setBackground(new Color(rF,gF,bF));
                ExitButton.setForeground(new Color(rB, gB, bB));
                ExitButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            }

            public void mouseExited(MouseEvent evt) {
                ExitButton.setBackground(new Color(rB, gB, bB));
                ExitButton.setForeground(new Color(rF, gF, bF));
                ExitButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

            }

            public void mouseClicked(MouseEvent e) {
                frame.dispose();
                new MainMenu(temp1,temp2,temp3,frame.getContentPane().getBackground());


            }
        });



    }

    void EditFile(String temp1,String temp2,String temp3,double Amount)
    {
        String file = "database.csv";
        String Temp = "temp.csv";
        BufferedReader reader = null;
        String line = "";

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
                if(row[0].contains(temp1))
                {

                    row[2]=String.valueOf(format.format(Amount));
                    writer.writeNext(row);

                }
                else {

                    writer.writeNext(row);

                }

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
