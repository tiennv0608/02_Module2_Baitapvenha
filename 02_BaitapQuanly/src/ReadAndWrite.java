import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    static List<Student> readFile(String path) throws IOException {
        List<Student> list = new ArrayList<>();
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            String[] information = line.split(",");
            int value = 0;
            if (information[3].equals("Nam")) {
                value = 1;
            } else if (information[3].equals("Nu")) {
                value = 2;
            }
            list.add(new Student(information[0], information[1], information[2], value, information[4], information[5], Double.parseDouble(information[6])));
        }
        br.close();
        fr.close();
        return list;
    }

    static void writeFile(String path, List<Student> list) {
        FileWriter fw;
        BufferedWriter bw;
        try {
            fw = new FileWriter(path);
            bw = new BufferedWriter(fw);
            bw.write("ID,Full Name,Birthday,Gender,Address,Email,Score");
            for (Student student : list) {
                String gender = "";
                if (student.getGender() == 1) {
                    gender = "Nam";
                } else if (student.getGender() == 2) {
                    gender = "Nu";
                }
                bw.write(student.getId() + "," + student.getFullName() + "," + student.getBirthDay() +
                        "," + gender + "," + student.getAddress() + "," + student.getEmail() +
                        "," + student.getScore() + "\n");
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.err.println("No file detected!");
        }

    }
}
