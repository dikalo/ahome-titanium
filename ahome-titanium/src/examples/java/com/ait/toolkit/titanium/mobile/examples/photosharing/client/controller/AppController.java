package com.ait.toolkit.titanium.mobile.examples.photosharing.client.controller;

import com.ait.toolkit.core.client.Color;
import com.ait.toolkit.titanium.mobile.client.Titanium;
import com.ait.toolkit.titanium.mobile.client.blob.Blob;
import com.ait.toolkit.titanium.mobile.client.core.Debugger;
import com.ait.toolkit.titanium.mobile.client.core.events.media.MediaError;
import com.ait.toolkit.titanium.mobile.client.core.events.media.MediaEvent;
import com.ait.toolkit.titanium.mobile.client.core.events.ui.ClickEvent;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.ClickHandler;
import com.ait.toolkit.titanium.mobile.client.filesystem.File;
import com.ait.toolkit.titanium.mobile.client.filesystem.FileSystem;
import com.ait.toolkit.titanium.mobile.client.media.Media;
import com.ait.toolkit.titanium.mobile.client.media.MediaSelectionCallback;
import com.ait.toolkit.titanium.mobile.client.ui.EmailDialog;
import com.ait.toolkit.titanium.mobile.client.ui.UI;
import com.ait.toolkit.titanium.mobile.examples.photosharing.client.ui.MainWindow;

public class AppController {

	private static final AppController INSTANCE = new AppController();
	private Blob selectedImage;

	public static AppController get() {
		return INSTANCE;
	}

	private AppController() {
		bind();
	}

	public void startApp() {
		UI.get().setBackgroundColor(Color.BLACK.getValue());
		MainWindow.get().open();
	}

	private void bind() {
		MainWindow.get().getChooseButton().addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				Media.get().openPhotoGallery(new MediaSelectionCallback() {
					@Override
					public void onSuccess(MediaEvent event) {
						selectedImage = event.getMedia();
						MainWindow.get().getThumbNail().setImage(selectedImage);
					}

					@Override
					public void onError(MediaError error) {
						Titanium.alert("Error getting image from photo gallery : " + error.getCode());
					}

					@Override
					public void onCancel() {

					}
				});
			}
		});
		MainWindow.get().getEmailButton().addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				if (selectedImage == null) {
					Titanium.alert("You must select an image first !!!");
				} else {
					sendEmail();
				}
			}
		});
	}

	private void sendEmail() {
		File dir = FileSystem.get().getFile(FileSystem.get().getApplicationDataDirectory() + "attachments");
		if (!dir.exists()) {
			dir.createDirectory();
		}

		File file = FileSystem.get().getFile(dir.getNativePath() + "temp-image.jpg");
		file.write(selectedImage);

		EmailDialog emailDialog = new EmailDialog();
		Debugger.get().print(emailDialog);
		emailDialog.setSubject(MainWindow.get().getTitleField().getValue());
		emailDialog.setToRecipients("jazzmatadazz@gmail.com");
		emailDialog.setMessageBody(MainWindow.get().getMessageField().getValue());
		emailDialog.addAttachment(file);
		emailDialog.open();
	}
}
