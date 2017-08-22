import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.ws.rs.FormParam;

/**
 * @author Gregor Tudan, Cofinpro AG
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @FormParam("name")
    private String name;
    @FormParam("address1")
    private String address1;
    @FormParam("address2")
    private String address2;
    @FormParam("zip")
    private String zip;
    @FormParam("city")
    private String city;

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
