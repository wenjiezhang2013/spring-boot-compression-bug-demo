package spring.boot.issue.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @RequestMapping("/user")
    public Response hello() {
        final Response response = new Response();
        response.setFirstName("firstName");
        response.setLastName("lastName");
        return response;
    }

}

class Response {

    public String firstName;

    public String lastName;

    /**
     * Returns the firstName of the Response.
     *
     * @return The firstName of the Response
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the firstName of the Response
     *
     * @param firstName
     *            The firstName of the Response to set
     */
    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the lastName of the Response.
     *
     * @return The lastName of the Response
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the lastName of the Response
     *
     * @param lastName
     *            The lastName of the Response to set
     */
    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }
}
