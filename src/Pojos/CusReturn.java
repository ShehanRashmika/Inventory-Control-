package Pojos;
// Generated Nov 13, 2018 10:52:25 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * CusReturn generated by hbm2java
 */
public class CusReturn  implements java.io.Serializable {


     private Integer idcusReturn;
     private Customer customer;
     private InvoiceHasItemsCus invoiceHasItemsCus;
     private Date date;
     private Date time;
     private String reason;
     private Double returnQty;
     private Double returnPrice;
     private String status;

    public CusReturn() {
    }

	
    public CusReturn(Customer customer, InvoiceHasItemsCus invoiceHasItemsCus) {
        this.customer = customer;
        this.invoiceHasItemsCus = invoiceHasItemsCus;
    }
    public CusReturn(Customer customer, InvoiceHasItemsCus invoiceHasItemsCus, Date date, Date time, String reason, Double returnQty, Double returnPrice, String status) {
       this.customer = customer;
       this.invoiceHasItemsCus = invoiceHasItemsCus;
       this.date = date;
       this.time = time;
       this.reason = reason;
       this.returnQty = returnQty;
       this.returnPrice = returnPrice;
       this.status = status;
    }
   
    public Integer getIdcusReturn() {
        return this.idcusReturn;
    }
    
    public void setIdcusReturn(Integer idcusReturn) {
        this.idcusReturn = idcusReturn;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public InvoiceHasItemsCus getInvoiceHasItemsCus() {
        return this.invoiceHasItemsCus;
    }
    
    public void setInvoiceHasItemsCus(InvoiceHasItemsCus invoiceHasItemsCus) {
        this.invoiceHasItemsCus = invoiceHasItemsCus;
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


