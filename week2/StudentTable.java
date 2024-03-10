public class StudentGradeTable {

    public static void main(String[] args) {
        // Student data
        String[] names = {"Joe", "William", "Mary Sue", "Alice", "Bob"};
        int[] labPoints =  {43, 50, 39, 48, 42};
        int[] bonusPoints = {7, 8, 10, 5, 9};

        // Print the table header
        System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("==          Student Points          ==");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");

        // Print column headers
        System.out.println("Name\t\tLab\tBonus\tTotal");
        System.out.println("----\t\t---\t-----\t-----");

        // Print student data
        for (int i = 0; i < names.length; i++) {
            int totalPoints = labPoints[i] + bonusPoints[i];
            System.out.println(names[i] + "\t\t" + labPoints[i] + "\t" + bonusPoints[i] + "\t" + totalPoints);
        }
    }
}
