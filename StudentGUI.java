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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.util.ArrayList;

public class StudentGUI implements ActionListener{
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
    private int counter = 0;
    private ArrayList<Student> studentList;
    // Constructor
    public StudentGUI(){
        studentList = new ArrayList<Student>();
        mainFrame = new JFrame(); // Initializing the mainFrame object
        // Setting the title of the window
        mainFrame.setTitle("Registration Form");
        // Setting the dimension of the window
        mainFrame.setSize(400,300);
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
        
        // STUDENT NAME
        nameLabel = new JLabel("Name");
        nameLabel.setBounds(new Rectangle(10,50,100,30));
        studentName = new JTextField();
        studentName.setBounds(new Rectangle(120,50,200,30));
        
        // STUDENT GROUP
        groupLabel = new JLabel("Group");
        groupLabel.setBounds(new Rectangle(10,90,100,30));
        studentGroup = new JTextField();
        studentGroup.setBounds(new Rectangle(120,90,200,30)); 
        
        // STUDENT PHONE NUMBER
        phoneNumberLabel = new JLabel("Phone Number");
        phoneNumberLabel.setBounds(new Rectangle(10,130,100,30));
        studentPhoneNumber = new JTextField();
        studentPhoneNumber.setBounds(new Rectangle(120,130,200,30));
        
        // SUBMIT BUTTON
        submitButton = new JButton("Submit");
        submitButton.setBounds(new Rectangle(10,170,100,30));
        submitButton.addActionListener(this);
        
        // COUNTER
        counterText = new JLabel("Total Students: \t" + String.valueOf(counter));
        counterText.setBounds(new Rectangle(120,170,200,30));
                
        /**
         * Adding the widgets to the frame
         */
        mainFrame.add(title);
        mainFrame.add(nameLabel);
        mainFrame.add(studentName);
        mainFrame.add(groupLabel);
        mainFrame.add(studentGroup);
        mainFrame.add(phoneNumberLabel);
        mainFrame.add(studentPhoneNumber);
        mainFrame.add(submitButton);
        mainFrame.add(counterText);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == submitButton){
            String name = studentName.getText();
            String group = studentGroup.getText();
            String phoneNumber = studentPhoneNumber.getText();
            studentList.add(new Student(name, group, phoneNumber));
            counterText.setText("Total Students:\t " + String.valueOf(studentList.size()));
        }
    }
    public static void main(String[] args){
        // Implementation
        StudentGUI obj = new StudentGUI();
    }
}