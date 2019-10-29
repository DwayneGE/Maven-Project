package JEETut3;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
@Table(name = "customer")
public class customer implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "custID", unique = true)
    private int id;

    @Column(name = "firstName", nullable = true)
    private String fName;
    @Column(name = "lastName", nullable = true)
    private String lName;

    public int getId() {
        return id;
    }
    
    public String getfName() {
        return fName;
    }
    
    public String getlName() {
        return lName;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setfName(String fName) {
        this.fName = fName;
    }
    
    public void setlName(String lName) {
        this.lName = lName;
    }
}