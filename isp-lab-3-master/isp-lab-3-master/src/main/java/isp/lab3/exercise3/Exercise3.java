package isp.lab3.exercise3;

public class Exercise3 {

    public static void main(String[] args) {

        System.out.println("Nr de vehicule: "+Vehicle.getNumberofVehicles());
        Vehicle a, b;
        a = new Vehicle("Dacia", "Logan", 180, 'D');
        b = new Vehicle("Golf", "Polo", 140, 'B');
        System.out.println("Nr de vehicule: "+Vehicle.getNumberofVehicles());
        
         System.out.println("Viteza masinii 1 este:" + a.getSpeed());
         a.setSpeed(150);
         System.out.println("Viteza masinii 1 este:" + a.getSpeed());
         System.out.println("Tpul carburantului masinii 1 este:" + a.getFuelType());
         a.setFuelType('B');
         System.out.println("Tipul carburntului masinii 1 este:" + a.getFuelType());
         System.out.println('\n'+b.toString());
         System.out.println("");
         b.setModel("Opel");
         b.setType("Sedan");
         b.setSpeed(220);
         b.setFuelType('D');
         System.out.println(b.toString());
         System.out.println("");
         
         if(a.equals(b))
             System.out.println("Prima masina este identica cu cea de a doua");
         else
             System.out.println("Masinile nu sunt identice");
         
    }
}
