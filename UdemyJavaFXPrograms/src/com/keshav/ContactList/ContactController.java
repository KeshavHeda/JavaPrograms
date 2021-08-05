package com.keshav.ContactList;

import com.keshav.ContactList.dataModel.Contact;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ContactController {

    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField phoneNumberField;
    @FXML
    private TextField notesField;

    public Contact getNewContact() {
        Contact newContact = new Contact();

        newContact.setFirstName(firstNameField.getText());
        newContact.setLastName(lastNameField.getText());
        newContact.setPhoneNumber(phoneNumberField.getText());
        newContact.setNotes(notesField.getText());

        return newContact;
    }

    public void editContact(Contact contact) {
        firstNameField.setText(contact.getFirstName());
        lastNameField.setText(contact.getLastName());
        phoneNumberField.setText(contact.getPhoneNumber());
        notesField.setText(contact.getNotes());
    }

    public void updateContact(Contact contact) {
        contact.setFirstName(firstNameField.getText());
        contact.setLastName(lastNameField.getText());
        contact.setPhoneNumber(phoneNumberField.getText());
        contact.setNotes(notesField.getText());
    }

}
