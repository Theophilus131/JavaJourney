import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        InvoiceReciept customer = new InvoiceReciept();

    System.out.println("Enter item part Number");
    String partNumber = input.nextLine();
    customer.setPartNumber(partNumber);

    System.out.println("Enter item description");
    String partDescription = input.nextLine();
    customer.setPartDescription(partDescription);

    System.out.println("Enter quantity purchased");
    int quantityPurchased = input.nextInt();
    customer.setQuantityPurchased(quantityPurchased);

    System.out.println("Enter price per item");
    double pricePeritem = input.nextDouble();
    customer.setPricePeritem(pricePeritem);


System.out.println("part Number: " +customer.getPartNumber());
System.out.println("item bought: " +customer.getPartDescription());
System.out.println("quanlity purchase: "+customer.getQuantityPurchased());
System.out.println(" price "+customer.getPricePeritem());
System.out.println("total amount: "+customer.getInvoiveAmount());


        }


    }
