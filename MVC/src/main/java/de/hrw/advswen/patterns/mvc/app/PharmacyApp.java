package de.hrw.advswen.patterns.mvc.app;

import java.util.Arrays;
import java.util.List;

import de.hrw.advswen.patterns.mvc.controller.PharmacyController;
import de.hrw.advswen.patterns.mvc.model.Drug;
import de.hrw.advswen.patterns.mvc.model.Pharmacy;
import de.hrw.advswen.patterns.mvc.view.PharmacyView;

public class PharmacyApp {

	public static void main(String[] args) {
		
		//Create Model, View and Controller
		PharmacyView theView = new PharmacyView();
		Pharmacy theModel = new Pharmacy();
		new PharmacyController(theView, theModel);

		//Create Sample Data
		List<String> medi1GoodFor  = Arrays.asList("Kopfschmerzen", "Gliederschmerzen", "Durchblutungsstörungen");
		List<String> medi2GoodFor  = Arrays.asList("Durchfall", "Verstopfung", "Unwohlsein");
		List<String> medi3GoodFor  = Arrays.asList("Entzündung", "Schwellung", "Beule");
		
		Drug medi1 = new Drug("Aspirin", 4.99, medi1GoodFor);
		Drug medi2 = new Drug("DarmPower2000", 3.49, medi2GoodFor);
		Drug medi3 = new Drug("HeilMich0815", 10.99, medi3GoodFor);
		
		//Store sample Data in Model 
		theModel.storeNewDrug(medi1);
		theModel.storeNewDrug(medi2);
		theModel.storeNewDrug(medi3);
			
		//Launch View
		theView.setVisible(true);
	}
}


