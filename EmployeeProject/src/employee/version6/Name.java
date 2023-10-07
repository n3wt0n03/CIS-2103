package employee.version6;

public class Name {
    private String title;
    private String fname;
    private String lname;
    private String mname;
    private String suffix;

    public Name() {

    }

    public Name(String fname, String lname, String mname) {
        this.fname = fname;
        this.lname = lname;
        this.mname = mname != null && !mname.isEmpty() ? mname.charAt(0) + "." : "";
    }

    public Name(String title, String fname, String lname, String mname, String suffix) {
        this.title = title;
        this.fname = fname;
        this.lname = lname;
        this.mname = mname != null && !mname.isEmpty() ? mname.charAt(0) + "." : "";
        this.suffix = suffix;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title != null && !title.isEmpty() ? title : "";
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname != null && !fname.isEmpty() ? fname : "";
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname != null && !lname.isEmpty() ? lname : "";
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname != null && !mname.isEmpty() ? String.valueOf(mname.charAt(0)) : "";
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = fname != null && !suffix.isEmpty() ? suffix : "";
    }

    @Override
    public String toString() {

        //StringBuilding and Concatenation is more efficient in dealing with strings to lessen the white spaces
        String retval = "";
        if (title != null && !title.isEmpty())
            retval = retval + " " + String.format("%s", title);
        if (fname != null && !fname.isEmpty())
            retval = retval + " " + String.format("%s", fname);
        if (mname != null && !mname.isEmpty())
            retval = retval + " " + String.format("%s", mname);
        if (lname != null && !lname.isEmpty())
            retval = retval + " " + String.format("%s", lname);
        if (suffix != null && !suffix.isEmpty())
            retval = retval + " " + String.format("%s", suffix);


        return retval;
    }
}
