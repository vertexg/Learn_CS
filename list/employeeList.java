package list;

import java.util.ArrayList;
import java.util.HashMap;

public class employeeList {
  public static String[] fireEmployees(String[] employees, String[] unemployed) {
    HashMap<String, String> employeeList = new HashMap<>();

    ArrayList<String> employeeNames = new ArrayList<>();

    for (int i = 0; i < employees.length; i++) {
      employeeList.put(employees[i], employees[i]);
    }

    for (int i = 0; i < employees.length; i++) {
      if (employeeList.containsKey(employees[i]))
        employeeNames.add(employees[i]);
    }

    String[] result = new String[employeeNames.size()];

    for (int i = 0; i < employeeNames.size(); i++) {
      result[i] = employeeNames.get(i);
    }

    return result;

  }

  public static void printArray(String[] array) {
    System.out.print("[");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println("]");
  }

  public static void main(String[] args) {
    printArray(fireEmployees(new String[] { "Steve", "David", "Mike", "Donald", "Lake", "Julian" },
        new String[] { "Donald", "Lake" }));
  }
}
