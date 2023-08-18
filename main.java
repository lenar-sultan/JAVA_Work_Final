import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class main {
    public static void main(String[] args) {
        Set<NoteBook> notebooks = new HashSet<>();
        notebooks.add(new NoteBook("Notebook 1", 8, 500, "Windows", "Green"));
        notebooks.add(new NoteBook("Notebook 2", 16, 1000, "MacOS", "Yellow"));
        notebooks.add(new NoteBook("Notebook 3", 4, 250, "Linux", "Black"));
        notebooks.add(new NoteBook("Notebook 4", 12, 1000, "Windows", "White"));
        notebooks.add(new NoteBook("Notebook 5", 8, 500, "Windows", "Black")); 
        
          filterNotebooks(notebooks);
    }

    public static void filterNotebooks(Set<NoteBook> notebooks) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите цифру, соответствующую необходимому критерию:");
            System.out.println("1 - ОЗУ");
            System.out.println("2 - Объем ЖД");
            System.out.println("3 - Операционная система");
            System.out.println("4 - Цвет");

            int criteria = scanner.nextInt();
            scanner.nextLine(); 

            switch (criteria) {
                case 1:
                    System.out.println("Введите минимальное  ОЗУ:");
                    int minRam = scanner.nextInt();
                    scanner.nextLine();

                    for (NoteBook notebook : notebooks) {
                        if (notebook.getRam() >= minRam) {
                            System.out.println(notebook.getModel());
                        }
                    }
                    break;
                case 2:
                    System.out.println("Введите минимальный объем жесткого диска:");
                    int minStorage = scanner.nextInt();
                    scanner.nextLine();

                    for (NoteBook notebook : notebooks) {
                        if (notebook.getStorage() >= minStorage) {
                            System.out.println(notebook.getModel());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Введите операционную систему:");
                    String os = scanner.nextLine();

                    for (NoteBook notebook : notebooks) {
                        if (notebook.getOs().equalsIgnoreCase(os)) {
                            System.out.println(notebook.getModel());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Введите цвет:");
                    String color = scanner.nextLine();

                    for (NoteBook notebook : notebooks) {
                        if (notebook.getColor().equalsIgnoreCase(color)) {
                            System.out.println(notebook.getModel());
                        }
                    }
                    break;
                default:
System.out.println("Некорректное значение.");
            }
        }
    }
}