class Bloco {
    {
        System.out.println("Hi");
        xml = "2";
    }

    public String xml;

    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }
}

public class Exemplo01 {

    public static void main(String[] args) {

        Bloco b = new Bloco();
        System.out.println(b.getXml());
    }
}
