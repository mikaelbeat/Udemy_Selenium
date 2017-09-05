
// Asserting values
	
	// Assert values
	public void assertText(String expected) {
		String status = textField.getText();
		assertEquals(text, expected);
	}
	
	// Assert values
	public void assertAttribute(String expected) {
		String expireDate = nameOfAttributeField.getAttribute("value");
		assertEquals(attribute, expected);		
	}