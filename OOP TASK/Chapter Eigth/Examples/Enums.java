package Examples;

public enum Enums {
    JHTP("Java How to Program", "2018"),
    CHTP("C How to Program", "2016"),
    IW3HTP("Internet & World Wide Web How to Program ", "2012"),
    CPPHTP("C++ How to Program ", "2017"),
    VBHTP("Visual Basic How to Program", "2014"),
    CHARPHTP("Visual C# How to Program", "2017");

    private final String title;
    private final String copyRightYear;

    Enums(String title, String copyRightYear){
        this.title = title;
        this.copyRightYear = copyRightYear;
    }
    public String getTitle(){
        return title;
    }

    public String getCopyRightYear(){
        return copyRightYear;
    }
}

