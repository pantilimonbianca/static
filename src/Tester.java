public class Tester {
        public static void main(String[] args) {

            Employee emp1 = new Employee("Bianca", "Pantilimon", "Via p.maroncelli");
            Employee emp2 = new Employee("Giuseppe", "Masiero", "Via carlo");

            Badge badge1 = new Badge(emp1);
            Badge badge2 = new Badge(emp2);

            badge1.showBadgeDetails();
            badge2.showBadgeDetails();
        }
    }

