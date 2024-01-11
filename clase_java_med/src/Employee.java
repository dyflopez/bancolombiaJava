public class Employee implements IOfficeTask{


    /**
     * Atributos
     * **/
    private String name;
    private String lastname;
    private String typeDocument;

    private String document;

    private String email;

    /**
     * Constructores
     * **/
    public Employee(String name, String lastname, String typeDocument, String document, String email) {
        this.name = name;
        this.lastname = lastname;
        this.typeDocument = typeDocument;
        this.document = document;
        this.email = email;
    }


    /**
     * 2.0  Metodos Logica
     * **/
    @Override
    public String sendReport() {
        return "Enviado reporte generico";
    }

    @Override
    public void answerMessages(String message) {
        System.out.println("contestando el " + message);
    }
    /**
     * 1.0 metodos de acceso
     * **/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTypeDocument() {
        return typeDocument;
    }

    public void setTypeDocument(String typeDocument) {
        this.typeDocument = typeDocument;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", typeDocument='" + typeDocument + '\'' +
                ", document='" + document + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
