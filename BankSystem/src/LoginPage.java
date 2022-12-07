import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;


public class LoginPage  {

    boolean AlreadyExecuted=false;
    int rB,gB,bB;
    int rF,gF,bF;
    JFrame frame = new JFrame();
    JButton LoginButton = new JButton("Login");
    JButton ResetButton = new JButton("Reset");

    JButton DarkThemeButton = new JButton("Dark");

    JButton LightThemeButton = new JButton("Light");

    JButton BlackThemeButton = new JButton("Black");

    JButton MaroonThemeButton = new JButton("Maroon");
    JLabel UserLabel = new JLabel("Username:");
    JLabel PasswordLabel = new JLabel("Password:");

    JLabel UnderLine = new JLabel("_ _ _ _ _ _ _ _ _");

    JLabel TimeLabel = new JLabel("Time:");
    JLabel Message = new JLabel();

    JLabel ThemeLabel = new JLabel("Theme:");
    JPasswordField PasswordField = new JPasswordField();
    JTextField UserIdField = new JTextField();



    HashMap<String,String> loginInfo = new HashMap<String,String>();
    LoginPage(HashMap<String,String> loginInfoOR,String temp1, String temp2, String temp3,Color dark){




        loginInfo = loginInfoOR;


//        if(dark.equals(new Color(24, 30, 40))) {
//
//            rB = 24;
//            gB = 30;
//            bB = 40;
//            rF = 57;
//            gF = 255;
//            bF = 20;
////            frame.getContentPane().setBackground(new Color(rB, gB, bB));
//            Theme();
//        }
//     else {
//            rB = 255;
//            gB = 255;
//            bB = 255;
//            rF = 0;
//            gF = 0;
//            bF = 0;
////            frame.getContentPane().setBackground(new Color(rB, gB, bB));
//            Theme();
//        }


//        int check=0;
//
//
//            if( AlreadyExecuted!=true && check==0) {
//                Theme(temp1, temp2, temp3, dark);
//                CheckPanelColor(temp1, temp2, temp3,dark);
//                System.out.println("qasim");
//                AlreadyExecuted=true;
//            }



//        ButtonListener(temp1, temp2, temp3, dark);

        CheckPanelColor(temp1, temp2, temp3,dark);
//        ButtonListener(temp1, temp2, temp3,dark);

//        Theme(temp1, temp2, temp3,dark);


        frame.add(UserLabel);
        frame.add(PasswordLabel);
        frame.add(ThemeLabel);
        frame.add(UnderLine);
        frame.add(UserIdField);
        frame.add(PasswordField);
        frame.add(LoginButton);
        frame.add(ResetButton);
        frame.add(DarkThemeButton);
        frame.add(LightThemeButton);
        frame.add(BlackThemeButton);
        frame.add(MaroonThemeButton);
        frame.add(Message);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280,720);
        frame.setLayout(null);
        frame.setTitle("Login Page");
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);









    }



void CheckPanelColor(String temp1, String temp2, String temp3,Color dark)
{
    if(dark.equals(new Color(24, 30, 40))) {

        rB = 24;
        gB = 30;
        bB = 40;
        rF = 57;
        gF = 255;
        bF = 20;
//            frame.getContentPane().setBackground(new Color(rB, gB, bB));
//        AlreadyExecuted=true;
//        Theme(temp1, temp2, temp3,dark);
        ButtonListener(temp1, temp2, temp3, dark);
    }
    else if(dark.equals(new Color(0, 0, 0))){
        rB = 0;
        gB = 0;
        bB = 0;
        rF = 255;
        gF = 255;
        bF = 0;
//            frame.getContentPane().setBackground(new Color(rB, gB, bB));
//        AlreadyExecuted=true;
//        Theme(temp1, temp2, temp3,dark);
        ButtonListener(temp1, temp2, temp3, dark);
    }
    else if(dark.equals(new Color(56, 2, 14))){
        rB = 56;
        gB = 2;
        bB = 14;
        rF = 255;
        gF = 255;
        bF = 255;
//            frame.getContentPane().setBackground(new Color(rB, gB, bB));
//        AlreadyExecuted=true;
//        Theme(temp1, temp2, temp3,dark);
        ButtonListener(temp1, temp2, temp3, dark);
    }
    else if(dark.equals(new Color(255,255,255)))
    {

        rB = 255;
        gB = 255;
        bB = 255;
        rF = 0;
        gF = 0;
        bF = 0;
//            frame.getContentPane().setBackground(new Color(rB, gB, bB));
//        AlreadyExecuted=false;
//        Theme(temp1, temp2, temp3,dark);
        ButtonListener(temp1, temp2, temp3, dark);

    }
    }

//void EnterToLogIn(String temp1, String temp2, String temp3)
//{
//    String UserId = UserIdField.getText();
//    String Password = String.valueOf(PasswordField.getPassword());
//
//
//    if(loginInfo.containsKey(UserId))
//    {
//
//
//        if(loginInfo.get(UserId).equals(Password) )
//        {
//
//            frame.dispose();
//            frame.dispose();
//            new MainMenu(temp1, temp2, temp3,frame.getContentPane().getBackground());
////                            actionPerformed(null);
//
//
////                    JOptionPane.showMessageDialog(null,"Login Successful!");
////                    AdminPanel Panel = new AdminPanel();
//        }
//        else
//        {
//            JOptionPane.showMessageDialog(null,"Incorrect Password!");
////                            actionPerformed(null);
//
//        }
//
//    }
//    else
//    {
//        JOptionPane.showMessageDialog(null,"Incorrect Username!");
////                        actionPerformed(null);
//
//    }
//}




//    void MouseActionPerformed(String temp1, String temp2, String temp3)
//    {
//        ResetButton.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                if(e.getSource()==ResetButton)
//                {
//                    UserIdField.setText("");
//                    PasswordField.setText("");
//                }
//            }
//        });
//        LoginButton.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                if(e.getSource()==ResetButton)
//                {
//                    UserIdField.setText("");
//                    PasswordField.setText("");
//                }
//
//                if (e.getSource()==LoginButton )
//                {
//
//                    String UserId = UserIdField.getText();
//                    String Password = String.valueOf(PasswordField.getPassword());
//
//
//                    if(loginInfo.containsKey(UserId))
//                    {
//
//
//                        if(loginInfo.get(UserId).equals(Password) )
//                        {
//
//                            frame.dispose();
//                            frame.dispose();
//                            new MainMenu(temp1, temp2, temp3,frame.getContentPane().getBackground());
//                            frame.dispose();
////                            actionPerformed(null);
//
//
////                    JOptionPane.showMessageDialog(null,"Login Successful!");
////                    AdminPanel Panel = new AdminPanel();
//                        }
//                        else
//                        {
//                            JOptionPane.showMessageDialog(null,"Incorrect Password!");
////                            actionPerformed(null);
//
//                        }
//
//                    }
//                    else
//                    {
//                        JOptionPane.showMessageDialog(null,"Incorrect Username!");
////                        actionPerformed(null);
//
//                    }
//                }
//            }
//        });
//
//
//    }


    void ButtonListener(String temp1, String temp2, String temp3,Color dark)
    {

        if(dark.equals(new Color(24, 30, 40))) {

            rB = 24;
            gB = 30;
            bB = 40;
            rF = 57;
            gF = 255;
            bF = 20;

        Theme(temp1, temp2, temp3,dark);

        }
        else if(dark.equals(new Color(0, 0, 0))){
            rB = 0;
            gB = 0;
            bB = 0;
            rF = 255;
            gF = 255;
            bF = 0;

        Theme(temp1, temp2, temp3,dark);

        }
        else if(dark.equals(new Color(56, 2, 14))){
            rB = 56;
            gB = 2;
            bB = 14;
            rF = 255;
            gF = 255;
            bF = 255;

        Theme(temp1, temp2, temp3,dark);

        }
        else
        {

            rB = 255;
            gB = 255;
            bB = 255;
            rF = 0;
            gF = 0;
            bF = 0;

        Theme(temp1, temp2, temp3,dark);


        }


        LightThemeButton.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent evt) {
                LightThemeButton.setBackground(new Color(rF,gF,bF));
                LightThemeButton.setForeground(new Color(rB, gB, bB));
                LightThemeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            }

            public void mouseExited(MouseEvent evt) {
                LightThemeButton.setBackground(new Color(rB, gB, bB));
                LightThemeButton.setForeground(new Color(rF, gF, bF));
                LightThemeButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

            }

            public void mouseClicked(MouseEvent e) {
                if(e.getSource()==LightThemeButton)  {
                    rB = 255;
                    gB = 255;
                    bB = 255;
                    rF = 0;
                    gF = 0;
                    bF = 0;
//                    AlreadyExecuted=true;

                    Theme(temp1, temp2, temp3,dark);
//                    System.out.println(rB);
                }
            }
        });
        DarkThemeButton.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent evt) {
                DarkThemeButton.setBackground(new Color(rF,gF,bF));
                DarkThemeButton.setForeground(new Color(rB, gB, bB));
                DarkThemeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            }

            public void mouseExited(MouseEvent evt) {
                DarkThemeButton.setBackground(new Color(rB, gB, bB));
                DarkThemeButton.setForeground(new Color(rF, gF, bF));
                DarkThemeButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

            }

            public void mouseClicked(MouseEvent e) {
                if (e.getSource() == DarkThemeButton) {

                    rB = 24;
                    gB = 30;
                    bB = 40;
                    rF = 57;
                    gF = 255;
                    bF = 20;
//                    frame.getContentPane().setBackground(new Color(rB, gB, bB));
//                    AlreadyExecuted=true;
                    Theme(temp1, temp2, temp3,dark);
//                    System.out.println(rB);
                }
            }
        });
        BlackThemeButton.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent evt) {
                BlackThemeButton.setBackground(new Color(rF,gF,bF));
                BlackThemeButton.setForeground(new Color(rB, gB, bB));
                BlackThemeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            }

            public void mouseExited(MouseEvent evt) {
                BlackThemeButton.setBackground(new Color(rB, gB, bB));
                BlackThemeButton.setForeground(new Color(rF, gF, bF));
                BlackThemeButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

            }

            public void mouseClicked(MouseEvent e) {
                if(e.getSource()==BlackThemeButton)  {
                    rB = 0;
                    gB = 0;
                    bB = 0;
                    rF = 255;
                    gF = 255;
                    bF = 0;
//                    AlreadyExecuted=true;
                    Theme(temp1, temp2, temp3,dark);
//                    System.out.println(rB);
                }
            }
        });

        MaroonThemeButton.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent evt) {
                MaroonThemeButton.setBackground(new Color(rF,gF,bF));
                MaroonThemeButton.setForeground(new Color(rB, gB, bB));
                MaroonThemeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            }

            public void mouseExited(MouseEvent evt) {
                MaroonThemeButton.setBackground(new Color(rB, gB, bB));
                MaroonThemeButton.setForeground(new Color(rF, gF, bF));
                MaroonThemeButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

            }

            public void mouseClicked(MouseEvent e) {
                if(e.getSource()==MaroonThemeButton)  {
                    rB = 56;
                    gB = 2;
                    bB = 14;
                    rF = 255;
                    gF = 255;
                    bF = 255;
//                    AlreadyExecuted=true;
                    Theme(temp1, temp2, temp3,dark);


//                    System.out.println(rB);
                }
            }
        });

    }


boolean ex=false;
        void Theme (String temp1, String temp2, String temp3,Color dark)
        {
             int check=0;
//
//            if(ex!=true && check==0) {
//                rB=255;
//                gB=255;
//                bB=255;
//                rF=0;
//                gF=0;
//                bF=0;
//                ex=true;
//                System.out.println(rF+","+rB);
//            }



            frame.getContentPane().setBackground(new Color(rB, gB, bB));


            UserLabel.setBounds(430, 200, 150, 50);
            UserLabel.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
            UserLabel.setForeground(new Color(rF, gF, bF));

            PasswordLabel.setBounds(430, 280, 150, 50);
            PasswordLabel.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
            PasswordLabel.setForeground(new Color(rF, gF, bF));

            ThemeLabel.setBounds(0, 620, 125, 25);
            ThemeLabel.setFont(new Font(Font.SERIF, Font.ITALIC, 20));
            ThemeLabel.setForeground(new Color(rF, gF, bF));

            UserIdField.setBounds(580, 200, 200, 50);
            UserIdField.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
            UserIdField.setHorizontalAlignment(JTextField.CENTER);
            UserIdField.setForeground(new Color(rF, gF, bF));
            UserIdField.setBackground(new Color(rB, gB, bB));
            UserIdField.setSelectionColor(new Color(rF, gF, bF));
            UserIdField.setBorder(BorderFactory.createLineBorder(new Color(rF, gF, bF), 2, true));
            UserIdField.setCaretColor(new Color(rF, gF, bF));

            UserIdField.addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent e) {
                    char c = e.getKeyChar();

                    UserIdField.setEditable(Character.isLetter(c) || Character.isISOControl(c));

                    if(e.getKeyCode()==KeyEvent.VK_ENTER || e.getKeyCode()==KeyEvent.VK_DOWN )
                    {
                        PasswordField.requestFocus();
                    }

                }
            });

            PasswordField.setBounds(580, 280, 200, 50);
            PasswordField.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
            PasswordField.setHorizontalAlignment(JTextField.CENTER);
            PasswordField.setForeground(new Color(rF, gF, bF));
            PasswordField.setBackground(new Color(rB, gB, bB));
            PasswordField.setSelectionColor(new Color(rF, gF, bF));
            PasswordField.setBorder(BorderFactory.createLineBorder(new Color(rF, gF, bF), 2, true));
            PasswordField.setCaretColor(new Color(rF, gF, bF));

            PasswordField.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    if(e.getKeyCode()==KeyEvent.VK_ENTER)
                    {
                        String UserId = UserIdField.getText();
                        String Password = String.valueOf(PasswordField.getPassword());


                        if(loginInfo.containsKey(UserId))
                        {

                            if(loginInfo.get(UserId).equals(Password) )
                            {

                                if(AlreadyExecuted!=true && check==0)
                                {
                                    frame.dispose();
                                    new MainMenu(temp1, temp2, temp3,frame.getContentPane().getBackground());
                                    AlreadyExecuted=true;
                                }


                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null,"Incorrect Password!");
//                            actionPerformed(null);

                            }

                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Incorrect Username!");
//                        actionPerformed(null);

                        }
                    }
                    if(e.getKeyCode()==KeyEvent.VK_ENTER || e.getKeyCode()==KeyEvent.VK_UP)
                    {
                        UserIdField.requestFocus();
                    }
                }
            });


            LoginButton.setBounds(430, 350, 150, 50);
            LoginButton.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
            LoginButton.setBackground(new Color(rB, gB, bB));
            LoginButton.setForeground(new Color(rF, gF, bF));
            LoginButton.setBorder(BorderFactory.createLineBorder(new Color(rB, gB, bB), 2, false));
            LoginButton.setFocusable(false);
//        LoginButton.addActionListener(this);

            LoginButton.addMouseListener(new MouseAdapter() {

                public void mouseEntered(MouseEvent evt) {

                    LoginButton.setBackground(new Color(rF,gF,bF));
                    LoginButton.setForeground(new Color(rB, gB, bB));
                    LoginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                }

                public void mouseExited(MouseEvent evt) {

                    LoginButton.setBackground(new Color(rB, gB, bB));
                    LoginButton.setForeground(new Color(rF, gF, bF));
                    LoginButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                }



        });
            LoginButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {


                    if (e.getSource()==LoginButton )
                    {

                        String UserId = UserIdField.getText();
                        String Password = String.valueOf(PasswordField.getPassword());


                        if(loginInfo.containsKey(UserId))
                        {

                            if(loginInfo.get(UserId).equals(Password) )
                            {
                                if(AlreadyExecuted!=true && check==0)
                                {
                                    frame.dispose();
                                    new MainMenu(temp1, temp2, temp3,frame.getContentPane().getBackground());
                                    AlreadyExecuted=true;
//                              actionPerformed(null);

                                }



//                    JOptionPane.showMessageDialog(null,"Login Successful!");
//                    AdminPanel Panel = new AdminPanel();
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null,"Incorrect Password!");
//                            actionPerformed(null);

                            }

                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Incorrect Username!");
//                        actionPerformed(null);

                        }
                    }
                }
            });


            ResetButton.setBounds(630, 350, 150, 50);
            ResetButton.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
            ResetButton.setBackground(new Color(rB, gB, bB));
            ResetButton.setForeground(new Color(rF, gF, bF));
            ResetButton.setBorder(BorderFactory.createLineBorder(new Color(rB, gB, bB), 2, false));
            ResetButton.setFocusable(false);

            ResetButton.addMouseListener(new MouseAdapter() {   //Change cursor on hover
                public void mouseEntered(MouseEvent evt) {
                    ResetButton.setBackground(new Color(rF,gF,bF));
                    ResetButton.setForeground(new Color(rB, gB, bB));
                    ResetButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                }

                public void mouseExited(MouseEvent evt) {
                    ResetButton.setBackground(new Color(rB, gB, bB));
                    ResetButton.setForeground(new Color(rF, gF, bF));
                    ResetButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

                }


                public void mouseClicked(MouseEvent e) {
                    if(e.getSource()==ResetButton)
                    {
                        UserIdField.setText("");
                        PasswordField.setText("");
                    }
                }
            });

            DarkThemeButton.setBounds(5, 650, 75, 25);
            DarkThemeButton.setBackground(new Color(rB, gB, bB));
            DarkThemeButton.setForeground(new Color(rF, gF, bF));
            DarkThemeButton.setBorder(BorderFactory.createLineBorder(new Color(rB, gB, bB)));
            DarkThemeButton.setFocusable(false);

//            DarkThemeButton.addMouseListener(new MouseAdapter() {   //Change cursor on hover
//                public void mouseEntered(MouseEvent evt) {
//                    DarkThemeButton.setBackground(new Color(rF,gF,bF));
//                    DarkThemeButton.setForeground(new Color(rB, gB, bB));
//                    DarkThemeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//
//                }
//
//                public void mouseExited(MouseEvent evt) {
//                    DarkThemeButton.setBackground(new Color(rB, gB, bB));
//                    DarkThemeButton.setForeground(new Color(rF, gF, bF));
//                    DarkThemeButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
//
//                }
//
//            });

            LightThemeButton.setBounds(100, 650, 75, 25);
            LightThemeButton.setBackground(new Color(rB, gB, bB));
            LightThemeButton.setForeground(new Color(rF, gF, bF));
            LightThemeButton.setBorder(BorderFactory.createLineBorder(new Color(rB, gB, bB)));
            LightThemeButton.setFocusable(false);

//            LightThemeButton.addMouseListener(new MouseAdapter() {   //Change cursor on hover
//                public void mouseEntered(MouseEvent evt) {
//                    LightThemeButton.setBackground(new Color(rF,gF,bF));
//                    LightThemeButton.setForeground(new Color(rB, gB, bB));
//                    LightThemeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//
//                }
//
//                public void mouseExited(MouseEvent evt) {
//                    LightThemeButton.setBackground(new Color(rB, gB, bB));
//                    LightThemeButton.setForeground(new Color(rF, gF, bF));
//                    LightThemeButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
//
//                }
//
//            });

            BlackThemeButton.setBounds(195, 650, 75, 25);
            BlackThemeButton.setBackground(new Color(rB, gB, bB));
            BlackThemeButton.setForeground(new Color(rF, gF, bF));
            BlackThemeButton.setBorder(BorderFactory.createLineBorder(new Color(rB, gB, bB)));
            BlackThemeButton.setFocusable(false);

//            BlackThemeButton.addMouseListener(new MouseAdapter() {   //Change cursor on hover
//                public void mouseEntered(MouseEvent evt) {
//                    BlackThemeButton.setBackground(new Color(rF,gF,bF));
//                    BlackThemeButton.setForeground(new Color(rB, gB, bB));
//                    BlackThemeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//
//                }
//
//                public void mouseExited(MouseEvent evt) {
//                    BlackThemeButton.setBackground(new Color(rB, gB, bB));
//                    BlackThemeButton.setForeground(new Color(rF, gF, bF));
//                    BlackThemeButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
//
//                }
//
//            });

            MaroonThemeButton.setBounds(290, 650, 75, 25);
            MaroonThemeButton.setBackground(new Color(rB, gB, bB));
            MaroonThemeButton.setForeground(new Color(rF, gF, bF));
            MaroonThemeButton.setBorder(BorderFactory.createLineBorder(new Color(rB, gB, bB)));
            MaroonThemeButton.setFocusable(false);

//            MaroonThemeButton.addMouseListener(new MouseAdapter() {   //Change cursor on hover
//                public void mouseEntered(MouseEvent evt) {
//                    MaroonThemeButton.setBackground(new Color(rF,gF,bF));
//                    MaroonThemeButton.setForeground(new Color(rB, gB, bB));
//                    MaroonThemeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//
//                }
//
//                public void mouseExited(MouseEvent evt) {
//                    MaroonThemeButton.setBackground(new Color(rB, gB, bB));
//                    MaroonThemeButton.setForeground(new Color(rF, gF, bF));
//                    MaroonThemeButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
//
//                }
//
//
//            });



        }

}

