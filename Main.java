import java.util.*;
public class Main {
    static ArrayList <Syllabus> syllabus_list = new ArrayList<>();
    public static void main(String[] args) {
        SyllabusGeneratorFacade facade = new SyllabusGeneratorFacade();
        int opt;
        do {
            opt = menu();
            int final_opt;
            if (opt == 1) {
                do {
                    final_opt = instructorMenu();
                    switch (final_opt) {
                        case 1:
                            Syllabus new_syllabus = facade.createSyllabus();
                            syllabus_list.add(new_syllabus);
                            break;
                        case 2:
                            Syllabus old_syllabus = facade.getOldSyllabus();
                            syllabus_list.add(old_syllabus);
                            break;
                        case 3:
                            Scanner inp = new Scanner(System.in);
                            System.out.println("\nPublish Syllabus:");
                            int i =1;
                            for(Syllabus x:syllabus_list){
                                System.out.println(i++ + " " + x.getDetails());
                            }
                            int option = inp.nextInt();
                            Syllabus s = syllabus_list.get(option-1);
                            facade.publishSyllabus(s);
                            break;
                        case 4:
                            break;
                    }
                } while (final_opt != 4);
            }
        }while (opt != 3);
    }

    public static int menu(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Role:\t1) Course Instructor\t2) Program Chair\t3) Exit");
        return inp.nextInt();
    }

    public static int instructorMenu(){
        Scanner inp = new Scanner(System.in);
        System.out.println("\nEnter Option:\n1) Create New Syllabus\n2) Create from Existing Syllabus\n3) Publish Syllabus\n4) Exit");
        return inp.nextInt();
    }
}