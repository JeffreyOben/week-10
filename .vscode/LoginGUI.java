import javax.swing.*;
import java.awt.FlowLayout;

public class LoginGUI {
    public static void main(String[] args) {
        // Create a JFrame object
        JFrame frame = new JFrame("Login GUI");

        // Set layout
        frame.setLayout(new FlowLayout());

        // Set window size and close operation
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create a JButton object
        JButton loginButton = new JButton("Login");

        // Add the button to the frame
        frame.add(loginButton);

        //create a JLabel object
        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        // Add the labels to the frame
        frame.add(usernameLabel);
        frame.add(passwordLabel);

        // Create JTextField and JPasswordField objects
        JTextField usernameField = new JTextField(20);  
        JPasswordField passwordField = new JPasswordField(20);
        // Add the text fields to the frame
        frame.add(usernameField);
        frame.add(passwordField);

        // Create a JCheckBox object
        JCheckBox rememberMeCheckBox = new JCheckBox("Remember Me");
        // Add the checkbox to the frame
        frame.add(rememberMeCheckBox);

        // Create a JRadioButton object
        JRadioButton adminRadioButton = new JRadioButton("Admin");
        JRadioButton userRadioButton = new JRadioButton("User");
        // Group the radio buttons
        ButtonGroup roleGroup = new ButtonGroup();
        roleGroup.add(adminRadioButton);
        roleGroup.add(userRadioButton);     

        // Add the radio buttons to the frame
        frame.add(adminRadioButton);
        frame.add(userRadioButton);

        // Make it visible
        frame.setVisible(true);
    }
}