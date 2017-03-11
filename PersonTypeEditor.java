package com.apps.app;

import java.beans.PropertyEditorSupport;

public class PersonTypeEditor extends PropertyEditorSupport {

	public void setAsText(String text){
		setValue(new Persontype(text.toUpperCase()));
	}
	
}
