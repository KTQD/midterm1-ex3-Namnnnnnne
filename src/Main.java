import java.io.*;

public class Main {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try {
            // Đọc nội dung từ file input.txt
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            StringBuilder contentBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                contentBuilder.append(line).append("\n");
            }
            reader.close();
            String content = contentBuilder.toString();

            // Thay thế toàn bộ các từ "Nha Trang" bằng từ "Vũng Tàu"
            String replacedContent = content.replaceAll("Nha Trang", "Vũng Tàu");

            // Ghi nội dung đã thay thế vào file output.txt
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            writer.write(replacedContent);
            writer.close();

            System.out.println("Thay thế từ thành công và ghi nội dung vào file output.txt.");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi thực hiện thay thế từ và ghi nội dung vào file.");
            e.printStackTrace();
        }
    }
}
