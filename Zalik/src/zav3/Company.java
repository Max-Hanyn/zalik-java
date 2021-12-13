package zav3;

import java.util.List;

public class Company {

    public List<Worker> workers;

    public Company(List<Worker> workers) {
        this.workers = workers;
    }
    public float calculateIncome(List<Building> buildings){

        float income = buildings.stream().mapToInt(value -> value.getPrice()).sum();

        float incomeWithCommission = (float) (income * 0.8);

        return incomeWithCommission;
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }

    public void addWorker(Worker worker) {
        this.workers.add(worker);
    }



    @Override
    public String toString() {
        return "Company{" +
                "workers=" + workers +
                '}';
    }
}
