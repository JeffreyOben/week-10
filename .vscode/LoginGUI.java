import javax.swing.*;
import java.awt.*;

public class LoginGUI {
    public static void main(String[] args) {
        // Create a JFrame object
        JFrame frame = new JFrame("Login GUI");
        frame.setLayout(new GridLayout(5, 1));
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //----------------panels----------------
        JPanel userPanel = new JPanel(new FlowLayout());
        JPanel passwordPanel = new JPanel(new FlowLayout());
        JPanel radioPanel = new JPanel(new FlowLayout());
        JPanel checkPanel = new JPanel(new FlowLayout());
        JPanel buttonPanel = new JPanel(new FlowLayout());

        //-----------------components----------------
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField(30); 

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(30);

        JRadioButton adminRadioButton = new JRadioButton("Admin");
        JRadioButton userRadioButton = new JRadioButton("User");
        ButtonGroup roleGroup = new ButtonGroup();
        roleGroup.add(adminRadioButton);
        roleGroup.add(userRadioButton); 
        
        JCheckBox rememberMeCheckBox = new JCheckBox("Remember Me");
        
        JButton loginButton = new JButton("Login");

        userPanel.add(usernameLabel);
        userPanel.add(usernameField);
        passwordField.add(passwordLabel);
        passwordPanel.add(passwordLabel);
        passwordPanel.add(passwordField);
        radioPanel.add(adminRadioButton);
        radioPanel.add(userRadioButton);
        checkPanel.add(rememberMeCheckBox);
        buttonPanel.add(loginButton);

        frame.add(userPanel);
        frame.add(passwordPanel);
        frame.add(radioPanel);
        frame.add(checkPanel);
        frame.add(buttonPanel);

      

       
        frame.setVisible(true);
    }
}