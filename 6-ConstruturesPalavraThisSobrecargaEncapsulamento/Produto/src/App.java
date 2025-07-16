public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        Product product = new Product();
        
       System.out.println("Enter product data: ");

       System.out.println("Name: ");
       product.name = sc.nextLine();
       System.out.println("Price: ");
       product.price = sc.nextDouble();
       System.out.println("Quantity in stock: ");
       product.quantity = sc.nextInt();

       System.out.printf("Product data: " + product);

       System.out.println("\n Enter the number of products to be added in stock: ");
       int qnt = sc.nextInt();

       product.addProduct(qnt);

       System.out.printf("Updated data: " + product);

       System.out.println("\n Enter the number of products to be removed from stock:");
       qnt = sc.nextInt();
       product.removeProduct(qnt);

       System.out.printf("Updated data: " + product);
    }
}
