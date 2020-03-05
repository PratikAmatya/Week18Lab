/**
 * Assignment Week 18 Lab
 * @author Anwesh Dahal L1C1
 * @version 2020
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Rectangle;
public class StudentGUI{
    private JFrame mainFrame; // The main window that holds the application
    private JLabel title; // Title of the window
    private JLabel nameLabel; // Label for the name input field
    private JTextField studentName; // student name input field
    private JLabel groupLabel; // label for student group input field
    private JTextField studentGroup; // student group input field
    private JLabel phoneNumberLabel; // Label for phone number field
    private JTextField studentPhoneNumber; // text field for student phone number
    private JButton submitButton; // Button to add the student to the list
    private JLabel counterText; // counter to count the total students in the list
    // Constructor
    public StudentGUI(){
        mainFrame = new JFrame(); // Initializing the mainFrame object
        // Setting the title of the window
        mainFrame.setTitle("Registration Form");
        // Setting the dimension of the window
        mainFrame.setSize(450,300);
        // Disabling the Layout Manager
        mainFrame.setLayout(null);
        // Calling the registrationGUI method
        registrationGUI();
        
        // Terminating the application when the window is closed
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Displaying the frame
        mainFrame.setVisible(true);
    }
    
    /**
     * Window to handel the widgets
     */
    public void registrationGUI(){
        // Label
        title = new JLabel(); // instanciating the title object
        title.setText("Registration Form");
        title.setBounds(new Rectangle(10,10,200,30));
        
        /**
         * Inputs
         */
        // STUDENT NAME
        nameLabel = new JLabel("Student Name");
        nameLabel.setBounds(10,50,150,30);
        studentName = new JTextField();
        studentName.setBounds(new Rectangle(170,50,150,30));
        
        // 3 Label - TextField
        // 1 Button
        // i COunter Label
        
        /**
         * Adding the widgets to the frame
         */
        mainFrame.add(title);
        mainFrame.add(nameLabel);
        mainFrame.add(studentName);
    }
    public static void main(String[] args){
        // Implementation
        StudentGUI obj = new StudentGUI();
    }
}