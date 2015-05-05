package de.hrw.adswen.patterns.mvc.controller;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import de.hrw.advswen.patterns.mvc.controller.PharmacyController;
import de.hrw.advswen.patterns.mvc.model.Drug;
import de.hrw.advswen.patterns.mvc.model.Pharmacy;
import de.hrw.advswen.patterns.mvc.view.View;

public class TestPharmacyController {

	@Mock
	Pharmacy model;
	
	@Mock
	View view;
	
	@InjectMocks
	PharmacyController controller;
	
	@Before
	public void setUp() throws Exception {
		controller = new PharmacyController(view, model);
		MockitoAnnotations.initMocks(this);		
	}
	
	@Test
	public void test() {
		
		//Vorarbeiten
		model.storeNewDrug(new Drug("Drug1", 10.00, Arrays.asList("krankheit1", "krankheit2")));
		model.storeNewDrug(new Drug("Drug2", 9.99, Arrays.asList("krankheit3")));
		model.storeNewDrug(new Drug("Drug3", 7.99, Arrays.asList("krankheit4", "krankheit5")));
		
		//Mocking
		Mockito.when(view.getSymptoms()).thenReturn("krankheit4");
		
		//Ergebnis + Annahme
		//Drug result = controller.searchForMedicine();
						
		//assertTrue(result.getGoodFor().contains(result));
		
	}

}
