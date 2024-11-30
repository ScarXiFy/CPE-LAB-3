/*
============================================================================
FILE : PBGUI.java
AUTHOR : Lauron, John Enrico D.
DESCRIPTION : Patient-Billing GUI for recording doctor and patient details,
              and calculating total income from billing records.
COPYRIGHT : November 07, 2024
REVISION HISTORY
Date: By: Description:

============================================================================
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The PBGUI class represents a GUI for the Patient-Billing System.
 * It allows users to enter details for doctors and patients, add billing records, 
 * and display the total income from the records.
 */
public class PBGUI extends JFrame {
    private JTextField doctorNameField, specialtyField, feeField;
    private JTextField patientNameField, patientIDField;
    private JTextArea displayArea;
    private double totalIncome = 0.0;

    /**
     * Default constructor that sets up the main GUI frame.
     */
    public PBGUI() {
        setTitle("Patient-Billing System");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // Main container panel for GUI organization
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Panel for input fields of doctor and patient details
        JPanel inputPanel = new JPanel(new GridLayout(2, 1, 5, 5));
        inputPanel.setBorder(BorderFactory.createTitledBorder("Input Details"));

        // Doctor input panel with fields for name, specialty, and fee
        JPanel doctorPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        doctorPanel.setBorder(BorderFactory.createTitledBorder("Doctor Details"));
        doctorPanel.add(new JLabel("Name:"));
        doctorNameField = new JTextField();
        doctorPanel.add(doctorNameField);
        doctorPanel.add(new JLabel("Specialty:"));
        specialtyField = new JTextField();
        doctorPanel.add(specialtyField);
        doctorPanel.add(new JLabel("Fee:"));
        feeField = new JTextField();
        doctorPanel.add(feeField);

        // Patient input panel with fields for name and ID
        JPanel patientPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        patientPanel.setBorder(BorderFactory.createTitledBorder("Patient Details"));
        patientPanel.add(new JLabel("Name:"));
        patientNameField = new JTextField();
        patientPanel.add(patientNameField);
        patientPanel.add(new JLabel("ID:"));
        patientIDField = new JTextField();
        patientPanel.add(patientIDField);

        // Adding doctor and patient panels to input panel
        inputPanel.add(doctorPanel);
        inputPanel.add(patientPanel);

        // Panel for action buttons: Add Billing Record and Show Total Income
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JButton addButton = new JButton("Add Billing Record");
        addButton.addActionListener(new AddBillingAction());
        JButton totalIncomeButton = new JButton("Show Total Income");
        totalIncomeButton.addActionListener(new TotalIncomeAction());
        buttonPanel.add(addButton);
        buttonPanel.add(totalIncomeButton);

        // Text area to display billing records and total income
        displayArea = new JTextArea(10, 40);
        displayArea.setEditable(false);
        displayArea.setBorder(BorderFactory.createTitledBorder("Billing Records"));
        JScrollPane scrollPane = new JScrollPane(displayArea);

        // Assembling main panel with input, button, and display areas
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        mainPanel.add(scrollPane, BorderLayout.SOUTH);

        // Adding main panel to frame
        add(mainPanel);
    }

    /**
     * Inner class for handling the action of adding a billing record.
     */
    private class AddBillingAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                // Create Doctor and Patient objects from input fields
                Doctor doctor = new Doctor(
                    doctorNameField.getText(),
                    specialtyField.getText(),
                    Double.parseDouble(feeField.getText())
                );
                Patient patient = new Patient(
                    patientNameField.getText(),
                    patientIDField.getText()
                );

                // Create a Billing record and update the display area and total income
                Billing billing = new Billing(patient, doctor);
                displayArea.append("Billing Record Added:\n");
                displayArea.append("Doctor: " + doctor.getName() + ", Specialty: " + doctor.getSpecialty() + ", Fee: $" + doctor.getOfficeVisitFee() + "\n");
                displayArea.append("Patient: " + patient.getName() + ", ID: " + patient.getIdNumber() + "\n\n");
                totalIncome += billing.getAmount();

                // Clear input fields
                doctorNameField.setText("");
                specialtyField.setText("");
                feeField.setText("");
                patientNameField.setText("");
                patientIDField.setText("");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(PBGUI.this, "Please enter a valid fee.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    /**
     * Inner class for handling the action of displaying total income.
     */
    private class TotalIncomeAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(PBGUI.this, "Total income from billing records: $" + totalIncome, "Total Income", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /**
     * The main method to run the Patient-Billing GUI.
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PBGUI frame = new PBGUI();
            frame.setVisible(true);
        });
    }
}
