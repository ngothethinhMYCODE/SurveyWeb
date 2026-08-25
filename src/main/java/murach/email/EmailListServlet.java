package murach.email;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import murach.business.User;

@WebServlet("/emailList")
public class EmailListServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        // Get information from the form
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String dateOfBirth = request.getParameter("dateOfBirth");

        String heardFrom = request.getParameter("heardFrom");
        String announcements = request.getParameter("announcements");
        String emailAnnouncements = request.getParameter("emailAnnouncements");
        String contactMethod = request.getParameter("contactMethod");

        // Checkbox is not submitted when it is unchecked
        if (announcements == null) {
            announcements = "No";
        }

        if (emailAnnouncements == null) {
            emailAnnouncements = "No";
        }

        // Create User object
        User user = new User(
                firstName,
                lastName,
                email,
                dateOfBirth
        );

        // Set survey information
        user.setHeardFrom(heardFrom);
        user.setAnnouncements(announcements);
        user.setEmailAnnouncements(emailAnnouncements);
        user.setContactMethod(contactMethod);

        // Store User object in request
        request.setAttribute("user", user);

        // Forward to thanks.jsp
        getServletContext()
                .getRequestDispatcher("/thanks.jsp")
                .forward(request, response);
    }

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }
}