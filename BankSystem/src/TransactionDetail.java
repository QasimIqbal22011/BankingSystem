import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;


public class TransactionDetail {

    int rB,gB,bB;
    int rF,gF,bF;

    JFrame frame = new JFrame();

    JLabel BalanceLabel = new JLabel();

    JLabel AccountNumber = new JLabel();

    JLabel AccountNumberLabel = new JLabel();

    JLabel BalanceAmountLabel = new JLabel();

    JLabel AccountHolderName = new JLabel();

    JLabel AccountHolder = new JLabel();
    JButton BackButton = new JButton();

    JLabel EnterAmountLabel = new JLabel();

    JTextField EnterAmountTextField = new JTextField();


    JButton CreditButton = new JButton();

    JButton DebitButton = new JButton();



   public TransactionDetail(String temp1, String temp2, String temp3,Color Dark)
    {

        ThemeCheck(temp1, temp2, temp3,Dark);

        frame.add(BalanceAmountLabel);
        frame.add(BalanceLabel);
        frame.add(EnterAmountLabel);
        frame.add(EnterAmountTextField);
        frame.add(CreditButton);
        frame.add(DebitButton);
        frame.add(AccountHolderName);
        frame.add(AccountHolder);
        frame.add(AccountNumber);
        frame.add(AccountNumberLabel);
        frame.add(BackButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280,720);
        frame.setLayout(null);
        frame.setTitle("Transaction Detail Panel");
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);

    }



    void ThemeCheck(String temp1, String temp2, String temp3,Color dark)
    {
        if(dark.equals(new Color(24, 30, 40))) {

            rB = 24;
            gB = 30;
            bB = 40;
            rF = 57;
            gF = 255;
            bF = 20;

            DisplayTransactionDetail(temp1, temp2, temp3);
        }
        else if(dark.equals(new Color(0, 0, 0))){
            rB = 0;
            gB = 0;
            bB = 0;
            rF = 255;
            gF = 255;
            bF = 0;

            DisplayTransactionDetail(temp1, temp2, temp3);
        }
        else if(dark.equals(new Color(56, 2, 14))){
            rB = 56;
            gB = 2;
            bB = 14;
            rF = 255;
            gF = 255;
            bF = 255;

            DisplayTransactionDetail(temp1, temp2, temp3);
        }
        else
        {

            rB = 255;
            gB = 255;
            bB = 255;
            rF = 0;
            gF = 0;
            bF = 0;

            DisplayTransactionDetail(temp1, temp2, temp3);
        }
    }


    void DisplayTransactionDetail(String temp1, String temp2, String temp3)
    {

        frame.getContentPane().setBackground(new Color(rB, gB, bB));

        AccountNumber.setBounds(400, 100, 230, 50);
        AccountNumber.setText("Account Number:");
        AccountNumber.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        AccountNumber.setForeground(new Color(rF, gF, bF));

        AccountNumberLabel.setBounds(650, 100, 300, 50);
        AccountNumberLabel.setText(temp1);
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
        AccountHolderName.setText(temp2);
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
        BalanceAmountLabel.setText(temp3);
        BalanceAmountLabel.setHorizontalAlignment(JLabel.CENTER);
        BalanceAmountLabel.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        BalanceAmountLabel.setForeground(new Color(rF, gF, bF));
        BalanceAmountLabel.setBorder(BorderFactory.createLineBorder(new Color(rF, gF, bF), 2, true));
        BalanceAmountLabel.setBackground(new Color(rB, gB, bB));

        EnterAmountLabel.setBounds(400, 400, 200, 50);
        EnterAmountLabel.setText("Enter Amount:");
        EnterAmountLabel.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        EnterAmountLabel.setForeground(new Color(rF, gF, bF));
        EnterAmountLabel.setBackground(new Color(rB, gB, bB));

        EnterAmountTextField.setBounds(650, 400, 300, 50);
        EnterAmountTextField.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        EnterAmountTextField.setHorizontalAlignment(JTextField.CENTER);
        EnterAmountTextField.setForeground(new Color(rF, gF, bF));
        EnterAmountTextField.setBackground(new Color(rB, gB, bB));
        EnterAmountTextField.setSelectionColor(new Color(rF, gF, bF));
        EnterAmountTextField.setBorder(BorderFactory.createLineBorder(new Color(rF, gF, bF), 2, true));
        EnterAmountTextField.setCaretColor(new Color(rF, gF, bF));

        EnterAmountTextField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == '.') )) {

                    JOptionPane.showMessageDialog(null,"Invalid Number!");
                    e.consume();
                }
            }
        });


        CreditButton.setBounds(500, 500, 150, 50);
        CreditButton.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        CreditButton.setText("Credit");
        CreditButton.setBackground(new Color(rB, gB, bB));
        CreditButton.setForeground(new Color(rF, gF, bF));
        CreditButton.setBorder(BorderFactory.createLineBorder(new Color(rB, gB, bB), 2, false));
        CreditButton.setFocusable(false);

        CreditButton.addMouseListener(new MouseAdapter() {   //Change cursor on hover
            public void mouseEntered(MouseEvent evt) {
                CreditButton.setBackground(new Color(rF,gF,bF));
                CreditButton.setForeground(new Color(rB, gB, bB));
                CreditButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            }

            public void mouseExited(MouseEvent evt) {
                CreditButton.setBackground(new Color(rB, gB, bB));
                CreditButton.setForeground(new Color(rF, gF, bF));
                CreditButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

            }


            public void mouseClicked(MouseEvent e) {
                if(EnterAmountTextField.getText()!=null)
                {
                    int Check=0;
                    String CreditAmount=EnterAmountTextField.getText();
                    frame.dispose();
                    new AfterCrediting(temp1,temp2,temp3,CreditAmount,Check,frame.getContentPane().getBackground());

                }
                else
                {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(frame,"Amount Field is Empty!","Amount field error!",JOptionPane.INFORMATION_MESSAGE);
                }

            }
        });

        DebitButton.setBounds(700, 500, 150, 50);
        DebitButton.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        DebitButton.setText("Debit");
        DebitButton.setBackground(new Color(rB, gB, bB));
        DebitButton.setForeground(new Color(rF, gF, bF));
        DebitButton.setBorder(BorderFactory.createLineBorder(new Color(rB, gB, bB), 2, false));
        DebitButton.setFocusable(false);

        DebitButton.addMouseListener(new MouseAdapter() {   //Change cursor on hover
            public void mouseEntered(MouseEvent evt) {
                DebitButton.setBackground(new Color(rF,gF,bF));
                DebitButton.setForeground(new Color(rB, gB, bB));
                DebitButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            }

            public void mouseExited(MouseEvent evt) {
                DebitButton.setBackground(new Color(rB, gB, bB));
                DebitButton.setForeground(new Color(rF, gF, bF));
                DebitButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

            }

            @Override
            public void mouseClicked(MouseEvent e) {

                if(EnterAmountTextField.getText()!=null)
                {
                    int Check=1;
                    String CreditAmount=EnterAmountTextField.getText();
                    frame.dispose();
                    new AfterCrediting(temp1,temp2,temp3,CreditAmount,Check,frame.getContentPane().getBackground());

                }
                else
                {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(frame,"Amount Field is Empty!","Amount field error!",JOptionPane.INFORMATION_MESSAGE);

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
                    try {
                        new Transaction(temp1,temp2,temp3,frame.getContentPane().getBackground());
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        });


    }


}
