package Pojos;
// Generated Nov 13, 2018 10:52:25 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * SupAndVendorCompanyDetails generated by hbm2java
 */
public class SupAndVendorCompanyDetails  implements java.io.Serializable {


     private Integer idsupAndVendorCompanyDetails;
     private String name;
     private String no;
     private String street;
     private String city;
     private String country;
     private Integer mobile1;
     private Integer mobile2;
     private Integer tp1;
     private Integer tp2;
     private String email;
     private String website;
     private String regNo;
     private String description;
     private String status;
     private Set<Vendor> vendors = new HashSet<Vendor>(0);
     private Set<Supplier> suppliers = new HashSet<Supplier>(0);

    public SupAndVendorCompanyDetails() {
    }

    public SupAndVendorCompanyDetails(String name, String no, String street, String city, String country, Integer mobile1, Integer mobile2, Integer tp1, Integer tp2, String email, String website, String regNo, String description, String status, Set<Vendor> vendors, Set<Supplier> suppliers) {
       this.name = name;
       this.no = no;
       this.street = street;
       this.city = city;
       this.country = country;
       this.mobile1 = mobile1;
       this.mobile2 = mobile2;
       this.tp1 = tp1;
       this.tp2 = tp2;
       this.email = email;
       this.website = website;
       this.regNo = regNo;
       this.description = description;
       this.status = status;
       this.vendors = vendors;
       this.suppliers = suppliers;
    }
   
    public Integer getIdsupAndVendorCompanyDetails() {
        return this.idsupAndVendorCompanyDetails;
    }
    
    public void setIdsupAndVendorCompanyDetails(Integer idsupAndVendorCompanyDetails) {
        this.idsupAndVendorCompanyDetails = idsupAndVendorCompanyDetails;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getNo() {
        return this.no;
    }
    
    public void setNo(String no) {
        this.no = no;
    }
    public String getStreet() {
        return this.street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    public Integer getMobile1() {
        return this.mobile1;
    }
    
    public void setMobile1(Integer mobile1) {
        this.mobile1 = mobile1;
    }
    public Integer getMobile2() {
        return this.mobile2;
    }
    
    public void setMobile2(Integer mobile2) {
        this.mobile2 = mobile2;
    }
    public Integer getTp1() {
        return this.tp1;
    }
    
    public void setTp1(Integer tp1) {
        this.tp1 = tp1;
    }
    public Integer getTp2() {
        return this.tp2;
    }
    
    public void setTp2(Integer tp2) {
        this.tp2 = tp2;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getWebsite() {
        return this.website;
    }
    
    public void setWebsite(String website) {
        this.website = website;
    }
    public String getRegNo() {
        return this.regNo;
    }
    
    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public Set<Vendor> getVendors() {
        return this.vendors;
    }
    
    public void setVendors(Set<Vendor> vendors) {
        this.vendors = vendors;
    }
    public Set<Supplier> getSuppliers() {
        return this.suppliers;
    }
    
    public void setSuppliers(Set<Supplier> suppliers) {
        this.suppliers = suppliers;
    }




}


