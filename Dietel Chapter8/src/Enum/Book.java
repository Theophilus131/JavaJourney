package Enum;

public enum Book {
    JHTP("Java How To Program", "2018"),
    CHTP("C How to Program", "2016"),
    IW3HTP("Internet & World wide web how to program", "2015");

    private final String title;
    private final String copyrightYear;

    Book(String title, String copyrightYear){
        this.title = title;
        this.copyrightYear = copyrightYear;
    }

    public String getTitle(){
        return this.title;
    }

    public String getCopyrightYear(){
        return this.copyrightYear;
    }


}
