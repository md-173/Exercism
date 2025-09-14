public class SalaryCalculator {
    int BASE_SALARY = 1000;
    
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped < 5 ? 1.0 : 0.85;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = BASE_SALARY * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        return salary < 2000.0 ? salary : 2000.0;
    } 
}
