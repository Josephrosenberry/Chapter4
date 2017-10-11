public class Song {
        private String title = "";
        private String artist = "";
        private int length = 0; 
        
    public Song(){
        }
    public Song (String t, String a, int l){
        title = t;
        artist = a;
        length = l;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String t){
        title = t;
    }
    public String getArtist(){
        return artist;
    }
    public void setArtist(String a){
        artist = a;
    }
    public int getLength(){
        return length;
    }
    public void setLength(int l){
        length = l;
    }
    public String toString(){
        String a = "Title: " + title + ", Artist: " + artist + ", length: " + 
        length + " sec";
        return a;
    }
    public static void main (String [] args){
        System.out.println("\f");
        Song s1= new Song();
        s1.setTitle("Mockingbird");
        s1.setLength(251);
        s1.setArtist("Eminem");
        System.out.println(s1);
        
        Song s2 = new Song ("Rap god", "Eminem", 232);
    }
}