import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HomeTask1 {
    // public static String createString(int num) {
    //     StringBuilder sb = new StringBuilder();
    //     for (int i = 0; i < num; i++) {
    //         sb.append("TEST ");
    //     }
    //     return sb.toString();
    // }

    // public static void writeToFile(String fileName, String content) {
    //     try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
    //         bw.write(content);
    //        // int t = 6/0;
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }
    // }

  
    
            public static StringBuilder LineInList(String line) {
                String line1 = line.replace("{", "");
                String line2 = line1.replace("}", "");
                String line3 = line2.replaceAll("\"", "");
                System.out.println(line3);
                StringBuilder result = new StringBuilder("select * from students where ");
        
                String [] arrayData = line3.split(", ");
                for (int i =0; i < arrayData.length; i++) {
                    String[] arrData = arrayData[i].split(":");
                    if(arrData[1].equals("null") == false) {
                        if (i != 0) {
                            result.append(", ");
                            result.append(arrData[0]);
                            result.append(" = ");
                            result.append(arrData[1]);
                        } else {
                            result.append(arrData[0]);
                            result.append(" = ");
                            result.append(arrData[1]);
                        }
                    }
                    
                }
                return result;
            }
        
    


        // Считывание строк с файла
        public static String [] ReadLineFromFile(String pathway) throws Exception {
            BufferedReader br = new BufferedReader(new FileReader(pathway));
            String str;
            int size = 0;
            while ((str = br.readLine()) != null) {
                size +=1;
                }
            br.close();
            String [] listData = new String [size];
           
            int i = 0;
            BufferedReader br1 = new BufferedReader(new FileReader(pathway));
            while ((str = br1.readLine()) != null) {
                listData[i] = str;
                i += 1;
                }
            br1.close();
            return listData;
        
        }   
}

