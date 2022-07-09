package com.progettoengsw.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class formDocente extends Composite {

	private static formDocenteUiBinder uiBinder = GWT.create(formDocenteUiBinder.class);

	interface formDocenteUiBinder extends UiBinder<Widget, formDocente> {
	}

	public formDocente() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public void setText(String text) {
		
	}
}
