package com.WScStores;
//import java.time.LocalDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "Stores")
public class WscStores {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Integer idd;
	 private String id;
    private String tablets;
    private String injections;
    private String syrups;
    private String ointments;
    private String others;
   
    // Default constructor
    public WscStores() {}

    // Constructor with parameters
    public WscStores(
    		String id, 
    		String tablets, 
    		String injections, 
    		String syrups, 
    		String ointments, 
    		String others
                           )
    {
        this.id = id;
        this.tablets = tablets;
        this.injections = injections;
        this.syrups = syrups;
        this.ointments = ointments;
        this.others = others;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTablets() {
        return tablets;
    }

    public void setTablets(String tablets) {
        this.tablets = tablets;
    }

    public String getInjections() {
        return injections;
    }

    public void setInjections(String injections) {
        this.injections = injections;
    }

    public String getSyrups() {
        return syrups;
    }

    public void setSyrups(String syrups) {
        this.syrups = syrups;
    }

    public String getOintments() {
        return ointments;
    }

    public void setOintments(String ointments) {
        this.ointments = ointments;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }
}