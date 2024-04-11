import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        student st = new student();
        studentgroup st2 = new studentgroup();
        st2.groupB = new String[15];
        st2.groupA = new String[15];
        st.name = "john";
        st.surname = "johnsky";
        st.index = "0001";
        st.address = "mazowiecka";
        st.email = "johnjonksy1@gmail.com";
        System.out.println("podaj oceny ucznia");
        Scanner scanner = new Scanner(System.in);
        if (st.grades == null) {
            System.out.println("illeglaargumentexpresion");
        }
        for (int i = 0; i < st.grades.length; i++) {
            System.out.println("ocena" + (i + 1) + ":");
            double grade = scanner.nextDouble();
            st.grades[i] = grade;
        }

        double sum = 0;
        for (int i = 0; i < st.grades.length; i++) {
            sum += st.grades[i];
        }

        double average = sum / st.grades.length;
        //System.out.println(average);

        double zaokrsr = Math.round(average * 2) / 2.0;
        System.out.println(zaokrsr);


        System.out.println("Do you want to add student to a group?");
        Scanner sc = new Scanner(System.in);

        char yesNo = sc.next().charAt(0);
        if (yesNo == 'y') {
            System.out.println("Group A or B?");
            Scanner sc2 = new Scanner(System.in);
            char aorb = sc2.next().charAt(0);
            if (aorb == 'a') {
                for (int i = 0; i < st2.groupA.length; i++) {
                    if(st2.groupA[14]!=null){
                        System.out.println("illegalstateexception: Group is full!!");
                    }else {
                    if (st2.groupA[i] == null) {
                        st2.groupA[i] = st.index;
                        break;

                    } else if (aorb == 'b') {
                    }
                    if (st2.groupB[14]!=null){
                        System.out.println("illegalstateexception: Group is full!!");
                    }else

                    for (i =0; i < st2.groupB.length; i++) {
                            if (st2.groupB[i] == null) {
                                st2.groupB[i] = st.index;
                                break;
                            }
                        }




                    }
                }
            }
        }
        System.out.println(Arrays.toString(st2.groupA));
    }
}