public class Children extends Family implements Parent  {

    String cName;

    public Children(String fN, String cName) {
        super(fN);
        this.cName = cName;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    @Override
    public String greetings() {

        String salut = "Hello my name is "+cName +" from " +super.getfN();
        return salut;
    }
}
