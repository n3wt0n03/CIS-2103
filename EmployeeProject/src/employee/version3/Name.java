package employee.version3;

public class Name {
    private String title = "";
    private String fname = "";
    private String lname = "";
    private String mname = "";
    private String suffix = "";

    public Name() {
    }

    public Name(String fname, String lname, String mname) {
        this.fname = fname;
        this.lname = lname;
        this.mname = mname;
    }

    public Name(String fname, String lname, String mname, String suffix) {
        this.fname = fname;
        this.lname = lname;
        this.mname = mname;
        this.suffix = suffix;
    }

    public Name(String title, String fname, String lname, String mname, String suffix) {
        this.title = title;
        this.fname = fname;
        this.lname = lname;
        this.mname = mname;
        this.suffix = suffix;
    }


}
