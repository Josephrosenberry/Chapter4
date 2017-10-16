public class Book{
    private String title = "";
    private String author = "";
    private double price = 0.0;
    public Book(){
    }

    public Book (String t, String a, double p){
        title = t;
        author = a;
        price = p;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double p){
        price = p;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String t){
        title = t;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String a){
        author = a;
    }

    public void giveDiscount(){
        price = price * .90;
    }
    public void giveDiscount(int d ){
        price -= price * d / 100;
    }
}
