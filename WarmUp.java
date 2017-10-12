public class WarmUp{
    public static void main(String [] args){
        System.out.println("\f");
        Book book1 = new Book ("The Cat in the Hat", " Dr. Suess", 10.00);
        book1.giveDiscount(15);
        System.out.printf("The new price of \"" + book1.getTitle() + "\" is $%.2f", + book1.getPrice());
        System.out.println("\n");
        
        Book book2 = new Book ("Where the Wild Things Are", " Maurice Sandak", 12.00);
        book2.giveDiscount();
        System.out.printf("The new price of \"" + book2.getTitle() + "\" is $%.2f", + book2.getPrice());
        
    }
}