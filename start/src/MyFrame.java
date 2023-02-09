import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
    private JPanel panel1;
    private JPanel panel2;
    private JPanel title;
    private JLabel login;
    private JPanel google;
    private JButton logInWithGoogleButton;
    private JTextField textField1;
    private JPanel email;
    private JPanel spacer;
    private JPanel Password;
    private JPasswordField passwordField1;
    private JPanel check;
    private JCheckBox rememberMeCheckBox;
    private JButton LoginBtn;
    private JPanel NoAcc;
    private JLabel emailad;
    private JLabel pass;
    private JLabel forgot;
    private JLabel noacc;
    private JLabel photo;


    public MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.pack();
        this.setVisible(true);
        this.setSize(600,500);

        this.setContentPane(panel1);
        panel1.add(panel2);
        panel2.add(title);
        title.add(login);
        panel2.add(google);
        google.add(logInWithGoogleButton);
        panel2.add(spacer);
        panel2.add(email);
        email.add(emailad);
        email.add(textField1);
        panel2.add(Password);
        Password.add(pass);
        Password.add(passwordField1);
        panel2.add(check);
        check.add(rememberMeCheckBox);
        check.add(forgot);
        panel2.add(LoginBtn);
        panel2.add(NoAcc);
        NoAcc.add(noacc);
    }
}
