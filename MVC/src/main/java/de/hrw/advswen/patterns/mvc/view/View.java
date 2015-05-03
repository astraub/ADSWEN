package de.hrw.advswen.patterns.mvc.view;

public interface View {
	public String getSymptoms();
	public void displayErrorMessage(String errorMessage);
	public void showMessageDialog(String message);
}
