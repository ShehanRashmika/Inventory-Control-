package Pojos;
// Generated Nov 13, 2018 10:52:25 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * ReturnToSupplier generated by hbm2java
 */
public class ReturnToSupplier  implements java.io.Serializable {


     private Integer idreturnToSupplier;
     private Stock stock;
     private Supplier supplier;
     private Date date;
     private Date time;
     private String reason;
     private Double returnQty;
     private Double returnPrice;
     private String status;

    public ReturnToSupplier() {
    }

	
    public ReturnToSupplier(Stock stock, Supplier supplier) {
        this.stock = stock;
        this.supplier = supplier;
    }
    public ReturnToSupplier(Stock stock, Supplier supplier, Date date, Date time, String reason, Double returnQty, Double returnPrice, String status) {
       this.stock = stock;
       this.supplier = supplier;
       this.date = date;
       this.time = time;
       this.reason = reason;
       this.returnQty = returnQty;
       this.returnPrice = returnPrice;
       this.status = status;
    }
   
    public Integer getIdreturnToSupplier() {
        return this.idreturnToSupplier;
    }
    
    public void setIdreturnToSupplier(Integer idreturnToSupplier) {
        this.idreturnToSupplier = idreturnToSupplier;
    }
    public Stock getStock() {
        return this.stock;
    }
    
    public void setStock(Stock stock) {
        this.stock = stock;
    }
    public Supplier getSupplier() {
        return this.supplier;
    }
    
    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public Date getTime() {
        return this.time;
    }
    
    public void setTime(Date time) {
        this.time = time;
    }
    public String getReason() {
        return this.reason;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }
    public Double getReturnQty() {
        return this.returnQty;
    }
    
    public void setReturnQty(Double returnQty) {
        this.returnQty = returnQty;
    }
    public Double getReturnPrice() {
        return this.returnPrice;
    }
    
    public void setReturnPrice(Double returnPrice) {
        this.returnPrice = returnPrice;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }




}


