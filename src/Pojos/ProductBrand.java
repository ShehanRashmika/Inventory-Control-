package Pojos;
// Generated Nov 13, 2018 10:52:25 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * ProductBrand generated by hbm2java
 */
public class ProductBrand  implements java.io.Serializable {


     private Integer idproductBrand;
     private String brand;
     private Set<Product> products = new HashSet<Product>(0);

    public ProductBrand() {
    }

    public ProductBrand(String brand, Set<Product> products) {
       this.brand = brand;
       this.products = products;
    }
   
    public Integer getIdproductBrand() {
        return this.idproductBrand;
    }
    
    public void setIdproductBrand(Integer idproductBrand) {
        this.idproductBrand = idproductBrand;
    }
    public String getBrand() {
        return this.brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public Set<Product> getProducts() {
        return this.products;
    }
    
    public void setProducts(Set<Product> products) {
        this.products = products;
    }




}


