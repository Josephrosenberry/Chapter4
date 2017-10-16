public class Name{
    private String first;
    private String middle;
    private String last;

    public Name (String f, String m, String l){
        first = f;
        middle = m;
        last = l;
    }

    public String getFirst(){
        return first;
    }

    public String getMiddle(){
        return middle;
    }

    public String getLast(){
        return last;
    }

    String fullName = first + " " + middle + " " + last;

    public String firstMiddleLast(){
        return first + " " + middle + " " + last;
    }

    String lastFirstMiddle = last + " " + first + " " + middle;

    public String getLastFirstMiddle(){
        return lastFirstMiddle;
    }

    public boolean equals(Name otherName){
        if (this.firstMiddleLast().equalsIgnoreCase(otherName.firstMiddleLast())){
            return true;
        }
        else 
            return true;
    }

    public String initials(){
        String f = first.substring(0,1).toUpperCase();
        String m = middle.substring(0,1).toUpperCase();
        String l = last.substring(0,1).toUpperCase();
        return f+m+l;
    }

    public int length()
    {
        return (first.length() + middle.length() + last.length());
    }
}