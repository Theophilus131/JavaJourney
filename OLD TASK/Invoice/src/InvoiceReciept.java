
public class InvoiceReciept{
    private String partNumber;
    private String partDescription;
    private int quantityPurchased;
   private double pricePeritem;

public InvoiceReciept() {
    this.partNumber = partNumber;
    this.partDescription = partDescription;
    this.quantityPurchased = quantityPurchased;
    this.pricePeritem = pricePeritem;
}

 public String setPartNumber(String partNumber) {
    this.partNumber = partNumber;
    return partNumber;
 }

 public String setPartDescription(String partDescription) {
    this.partDescription = partDescription;
     return partDescription;
 }

 public int setQuantityPurchased(int quantityPurchased) {
    if(quantityPurchased >0){
        this.quantityPurchased = quantityPurchased;
    } else{System.out.println("Invalid Quantity Purchased");}

     return quantityPurchased;
 }

 public double setPricePeritem(double pricePeritem) {
    if(pricePeritem >0){
        this.pricePeritem = pricePeritem;
    }else{System.out.print("price cannot be negative");}

     return pricePeritem;
 }

 public String getPartNumber() {
    return partNumber;
 }
public String getPartDescription() {
    return partDescription;

}
public int getQuantityPurchased() {
    return quantityPurchased;
}
public double getPricePeritem() {
    return pricePeritem;
}
public double getInvoiveAmount() {
    return pricePeritem*quantityPurchased;
}
}
