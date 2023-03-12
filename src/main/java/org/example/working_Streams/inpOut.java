package org.example.working_Streams;

import java.io.FileInputStream;
import java.io.IOException;

public class inpOut {

    public static void main(String[] args) {

        String str = "Hello, World!\n";
        StringBuffer stringBuffer = new StringBuffer();

        try {
//            /**
//             * создаем файл на диски, и прописываем путь целиком, можно ничего не делать, если файла не будет, он автоматически
//             *  создаться
//             */
//            PrintStream printStream = new PrintStream("D:\\Java\\java Project\\Java_training_all_in_one\\stream.txt");
//            printStream.print(str);


            //запись в файл

//            FileOutputStream fileOutputStream = new FileOutputStream("D:\\Java\\java " +
//                    "Project\\Java_training_all_in_one\\stream.txt",true); //если не указать значению аппенд true
//            //то файл будет перезаписываться, если поставить true, файл будет дозаписываться в конце.
//            byte buf[] = str.getBytes();//переводим нашу строку в массиф типа byte для записи
//            fileOutputStream.write(buf);
//            System.out.println("Запись прошла успешно");


            //чтение файла
            FileInputStream inputStream = new FileInputStream("D:\\Java\\java Project\\Java_training_all_in_one\\stream.txt");
            //что бы читать файл его так же надо разбить на байты
            int i = -1;
            while ((i = inputStream.read()) != -1) {
//                System.out.print((char) i);
                stringBuffer.append((char)i);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.print(stringBuffer);
    }
}

