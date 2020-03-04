import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Family implements Parent {

    Family f ;
    String fN;

    public Family( String famName) {

        this.fN = famName;
    }

    public String getfN() {
        return fN;
    }

    public void setfN(String fN) {
        this.fN = fN;
    }

    public String giveName(){

        String familyname = fN +" " +"Family";
        return familyname;
    }



    @Override
    public String greetings() {
        String salut = "Hello there from " +f.giveName();
       return salut;
    }
}
