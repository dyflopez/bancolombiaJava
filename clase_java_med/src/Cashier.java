public class Cashier extends Employee{

    public Cashier(String name, String lastname, String typeDocument, String document, String email) {
        super(name, lastname, typeDocument, document, email);
    }

    public int countCash(int amount1 , int amount2){
        return  amount1+amount2;
    }

    @Override
    public String sendReport() {
        return  "Envia balance contable a la alta gerencia";
    }
}
