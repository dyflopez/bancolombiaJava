import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Employee daniel = new Employee("daniel", "florez", "CC", "1030", "daniel0223AThotmail.es");
        Employee yesid = new Employee("yesid","lopez","CC","1030","daniel0223AThotmail.es");
        System.out.println(daniel.sendReport());


        Cashier juanita  = new Cashier("juanita","lopez","CE","AB123","juanitaAtgmail.com");

        juanita.answerMessages("Atender 100 clientes");

        var total = juanita.countCash(1,100);

        System.out.println(total);
        System.out.println(juanita.getName());


        System.out.println(juanita.sendReport());


        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(daniel);
        employeeList.add(yesid);

        var nombre = employeeList.get(0).getName();
        System.out.println("Nombre es " +nombre);
        var nombre2 = employeeList.get(1).getName();
        System.out.println("Nombre es " +nombre2);


        System.out.println(employeeList.get(0).toString());

        System.out.println("Recorrer con for");
        for (int i =0;i<employeeList.size() ;i++){
            System.out.println(employeeList.get(i).toString());
        }
        System.out.println("Recorrer con for Eatch");
        for(Employee employee:employeeList){
            System.out.println(employee.toString());
        }

    }
}
