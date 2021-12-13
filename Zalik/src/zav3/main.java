package zav3;


import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(final String[] args) {

        Building flat1 = new Flat("1 room", 5000);
        Building flat2 = new Flat("2 rooms", 15000);
        Building flat3 = new Flat("3 rooms", 35000);

        Building office1 = new Office("1 room" , 1500);
        Building office2 = new Office("2 rooms" , 11500);
        Building office3 = new Office("3 rooms" , 21500);

        Building sklad1 = new Sklad("4 rooms", 3000);
        Building sklad2 = new Sklad("4 rooms", 13000);
        Building sklad3 = new Sklad("4 rooms", 23000);

        List<Building> buildings = new ArrayList<>();

        buildings.add(flat1);
        buildings.add(flat2);
        buildings.add(flat3);
        buildings.add(office1);
        buildings.add(office2);
        buildings.add(office3);
        buildings.add(sklad1);
        buildings.add(sklad2);
        buildings.add(sklad3);

        Worker worker1 = new Manager("Max", "Hanyn");
        Worker worker2 = new Manager("Max1", "Hanyn1");
        Worker worker3 = new SimpleWorker("Max2", "Hanyn2");
        Worker worker4 = new SimpleWorker("Max3", "Hanyn3");

        List<Worker> workers = new ArrayList<>();

        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
        workers.add(worker4);

        Company company = new Company(workers);

        float sum = company.calculateIncome(buildings);

        System.out.print(sum);
        System.out.print(company);

    }
}