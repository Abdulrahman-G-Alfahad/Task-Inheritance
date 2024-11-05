package company;

public class Main {
    public static void main(String[] args) {
        Employee emily = new Employee("Emily", "Finance", 50000);
        Manager john = new Manager("John", "IT", 75000, 5);
        Intern dave = new Intern("Dave", "Marketing", 30000, "State University");
        Engineer ibrahim = new Engineer("Ibrahim" ,"Electrical",1000000,new String[]{"NextJS", "Javascript", "HTML"});
        Director olson = new Director("Andreas","Java",500000,100000000);
        SalesPerson fajri = new SalesPerson("Fajri","CODED",10000,999);

        System.out.println(ibrahim);
        ibrahim.setSkills("ReactJS");
        System.out.println(ibrahim);
        System.out.println(olson);
        System.out.println(fajri);

        System.out.println(emily);
        System.out.println(john);
        System.out.println(dave);
    }
}