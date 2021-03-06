package Pojos;
// Generated Nov 13, 2018 10:52:25 PM by Hibernate Tools 4.3.1



/**
 * GrnHasItems generated by hbm2java
 */
public class GrnHasItems  implements java.io.Serializable {


     private Integer idgrnHasItems;
     private Grn grn;
     private Stock stock;
     private Double qty;
     private Double unitPrice;
     private Double discount;
     private Double tax;
     private Double unitBuyingPrice;
     private Double subTot;
     private Double total;
     private String status;

    public GrnHasItems() {
    }

	
    public GrnHasItems(Grn grn, Stock stock) {
        this.grn = grn;
        this.stock = stock;
    }
    public GrnHasItems(Grn grn, Stock stock, Double qty, Double unitPrice, Double discount, Double tax, Double unitBuyingPrice, Double subTot, Double total, String status) {
       this.grn = grn;
       this.stock = stock;
       this.qty = qty;
       this.unitPrice = unitPrice;
       this.discount = discount;
       this.tax = tax;
       this.unitBuyingPrice = unitBuyingPrice;
       this.subTot = subTot;
       this.total = total;
       this.status = status;
    }
   
    public Integer getIdgrnHasItems() {
        return this.idgrnHasItems;
    }
    
    public void setIdgrnHasItems(Integer idgrnHasItems) {
        this.idgrnHasItems = idgrnHasItems;
    }
    public Grn getGrn() {
        return this.grn;
    }
    
    public void setGrn(Grn grn) {
        this.grn = grn;
    }
    public Stock getStock() {
        return this.stock;
    }
    
    public void setStock(Stock stock) {
        this.stock = stock;
    }
    public Double getQty() {
        return this.qty;
    }
    
    public void setQty(Double qty) {
        this.qty = qty;
    }
    public Double getUnitPrice() {
        return this.unitPrice;
    }
    
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public Double getDiscount() {
        return this.discount;
    }
    
    public void setDiscount(Double discount) {
        this.discount = discount;
    }
    public Double getTax() {
        return this.tax;
    }
    
    public void setTax(Double tax) {
        this.tax = tax;
    }
    public Double getUnitBuyingPrice() {
        return this.unitBuyingPrice;
    }
    
    public void setUnitBuyingPrice(Double unitBuyingPrice) {
        this.unitBuyingPrice = unitBuyingPrice;
    }
    public Double getSubTot() {
        return this.subTot;
    }
    
    public void setSubTot(Double subTot) {
        this.subTot = subTot;
    }
    public Double getTotal() {
        return this.total;
    }
    
    public void setTotal(Double total) {
        this.total = total;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }




}


