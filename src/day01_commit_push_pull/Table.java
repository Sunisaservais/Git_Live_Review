package day01_commit_push_pull;

public class Table {

    public static void main(String[] args) {

        multiplicationTable(5);
        multiplicationTable();
    }

 /*
    Method: multiplicationTable
    Param: num
    Return: void
    prints multiplication table for the number
 */

    public static void multiplicationTable(int num) {
        for (int i = 0; i <= 12; i++) {
            System.out.println(num + " x " + i + "\t= " + (num * i));
        }
    }

/*
    Overloaded Method: multiplicationTable
    Param: num
    Return: void
    prints multiplication table for the number 1-9
*/
    public static void multiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            multiplicationTable(i);
            System.out.println("___________");
        }
    }
}
