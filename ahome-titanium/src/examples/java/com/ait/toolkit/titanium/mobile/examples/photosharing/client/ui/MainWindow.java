package com.ait.toolkit.titanium.mobile.examples.photosharing.client.ui;

import com.ait.toolkit.titanium.mobile.client.ui.Button;
import com.ait.toolkit.titanium.mobile.client.ui.ImageView;
import com.ait.toolkit.titanium.mobile.client.ui.Label;
import com.ait.toolkit.titanium.mobile.client.ui.TextArea;
import com.ait.toolkit.titanium.mobile.client.ui.TextField;
import com.ait.toolkit.titanium.mobile.client.ui.Window;
import com.ait.toolkit.titanium.mobile.client.ui.style.Font;
import com.ait.toolkit.titanium.mobile.client.ui.style.FontWeight;

public class MainWindow extends Window {

	private static final MainWindow INSTANCE = new MainWindow();

	public static MainWindow get() {
		return INSTANCE;
	}

	private ImageView thumbNail;
	private Button button;
	private TextField titleTextField;
	private TextArea messageTextArea;
	private Button emailButton;

	private MainWindow() {
		this.setTitle("Tab 1");
		this.setBackgroundImage("social/background.jpg");

		Label label = new Label("Photo Share: \nEmail, Facebook & Twitter");
		label.setWidth(280);
		label.setHeight("auto");
		label.setTop(20);
		label.setLeft(20);
		label.setColor("#FFF");
		label.setFont(new Font(18, "Helvetica", FontWeight.BOLD));
		this.add(label);

		thumbNail = new ImageView();
		thumbNail.setWidth(100);
		thumbNail.setHeight(120);
		thumbNail.setLeft(20);
		thumbNail.setTop(90);
		thumbNail.setBorderColor("#FFF");
		thumbNail.setBorderSize(10);
		this.add(thumbNail);

		button = new Button("Choose");
		button.setWidth(100);
		button.setHeight(30);
		button.setTop(220);
		button.setLeft(20);
		this.add(button);

		titleTextField = new TextField();
		titleTextField.setWidth(160);
		titleTextField.setHeight(35);
		titleTextField.setLeft(140);
		titleTextField.setTop(90);
		titleTextField.setValue("Message title ...");
		titleTextField.setBackgroundColor("#FFF");
		this.add(titleTextField);

		messageTextArea = new TextArea();
		messageTextArea.setWidth(160);
		messageTextArea.setLeft(140);
		messageTextArea.setHeight(120);
		messageTextArea.setTop(130);
		messageTextArea.setFont(new Font(15));
		messageTextArea.setBorderSize(2);
		messageTextArea.setBackgroundColor("#FFF");
		this.add(messageTextArea);

		emailButton = new Button("Send Via Email");
		emailButton.setWidth(280);
		emailButton.setHeight(35);
		emailButton.setTop(280);
		emailButton.setLeft(20);
		this.add(emailButton);
	}

	public ImageView getThumbNail() {
		return thumbNail;
	}

	public Button getChooseButton() {
		return button;
	}

	public TextField getTitleField() {
		return titleTextField;
	}

	public TextArea getMessageField() {
		return messageTextArea;
	}

	public Button getEmailButton() {
		return emailButton;
	}
}
