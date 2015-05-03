package de.hrw.advswen.patterns.mvc.view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DoctorView extends JFrame implements View{

	private static final long serialVersionUID = 1L;
	private JLabel symptomLabel = new JLabel("Symptome:");
	private JTextField symptom = new JTextField(10);
	private JButton searchButton = new JButton("Look for drugs");
	
	public DoctorView(){
		JPanel pharmacyPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 100);
		
		pharmacyPanel.add(symptomLabel);
		pharmacyPanel.add(symptom);
		pharmacyPanel.add(searchButton);
		
		this.add(pharmacyPanel);
	}
	
	public String getSymptoms(){
		return (symptom.getText());	
	}
	
	public void addCureButtonListener(ActionListener listenForCureButton){
		searchButton.addActionListener(listenForCureButton);
	}
	
	public void displayErrorMessage(String errorMessage){
		JOptionPane.showMessageDialog(this, errorMessage);
	}

	public void showMessageDialog(String message) {
		JOptionPane.showMessageDialog(new JFrame(), message);
		
	}
	
}
