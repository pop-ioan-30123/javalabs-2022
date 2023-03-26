package isp.lab4.exercise6;

public class Exercise6 {
    
    public static void main(String[] args) {
        Employee e;
        e=new Employee("Pop","Iulia");
        System.out.println("Employee:" + e.getPaymentAmount());
        
        ComissionEmployee c;
        c=new ComissionEmployee("Petrica", "Muresan", 240, 223.2);
        System.out.println("Comission Employee:" + c.getPaymentAmount());
        
        SalariedEmployee s;
        s=new SalariedEmployee("Pop", "Iulia", 200);
        System.out.println("Salaried Employee:" + s.getPaymentAmount());
        
        HourlyEmployee h;
        h=new HourlyEmployee("Mircea", "Tudor", 340, 523.2);
        System.out.println(" Hourly Employee:" + h.getPaymentAmount());
        
        Employee [] em;
        em=new Employee[6];
        
        em[0]=new ComissionEmployee("Petrica", "Muresan", 240, 223.2);
        em[1]=new ComissionEmployee("George", "Muresan", 240, 223.2);
        
        em[2]=new HourlyEmployee("Pop", "Ioan", 2400, 2230.2);
        em[3]=new HourlyEmployee("Pop", "Adina", 2400, 2230.2);
        
        em[4]=new ComissionEmployee("Mircea", "Tudor", 340, 523.2);
        em[0]=new ComissionEmployee("Sabou", "Mihai", 340, 523.2);
        
        double salarii;
        salarii=0;
        
        for(int i=0;i<6;i++)
        {
            salarii+=em[i].getPaymentAmount();
        }
    }
}
