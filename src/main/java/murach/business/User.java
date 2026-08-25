package murach.business;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String firstName;
    private String lastName;
    private String email;
    private String dateOfBirth;

    private String heardFrom;
    private String announcements;
    private String emailAnnouncements;
    private String contactMethod;

    public User() {
        firstName = "";
        lastName = "";
        email = "";
        dateOfBirth = "";

        heardFrom = "";
        announcements = "";
        emailAnnouncements = "";
        contactMethod = "";
    }

    public User(String firstName, String lastName,
                String email, String dateOfBirth) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;

        heardFrom = "";
        announcements = "";
        emailAnnouncements = "";
        contactMethod = "";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getHeardFrom() {
        return heardFrom;
    }

    public void setHeardFrom(String heardFrom) {
        this.heardFrom = heardFrom;
    }

    public String getAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(String announcements) {
        this.announcements = announcements;
    }

    public String getEmailAnnouncements() {
        return emailAnnouncements;
    }

    public void setEmailAnnouncements(String emailAnnouncements) {
        this.emailAnnouncements = emailAnnouncements;
    }

    public String getContactMethod() {
        return contactMethod;
    }

    public void setContactMethod(String contactMethod) {
        this.contactMethod = contactMethod;
    }
}