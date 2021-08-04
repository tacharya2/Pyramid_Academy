package com.company;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Cipher {
    public static void main(String[] args) throws IOException {
        System.out.println("Please write 'e' for encrypt and 'd' for decrypt");
        System.out.println("Do you wish to encrypt(e) or decrypt(d) a message?: ");
        Scanner sc = new Scanner(System.in);
        String response = sc.nextLine();

        if (response.equals("e")) {
            System.out.println("Please enter the text:");

            String s = sc.nextLine();

            System.out.println("Enter your key-number(1 - 52)");

            String codeString = sc.nextLine();
            int code = Integer.parseInt(codeString);

        Charset utf8 = StandardCharsets.UTF_8;
        List<String> list = Arrays.asList(encrypt(s, code));
        System.out.println(list);
        Files.write(Paths.get("cipher.log"), list, utf8);
        }
        if(response.equals("d")){

                System.out.println("Please enter the text:");

                String s = sc.nextLine();

                System.out.println("Enter your key-number(1 - 52)");

                String codeString = sc.nextLine();
                int code = Integer.parseInt(codeString);

                Charset utf8 = StandardCharsets.UTF_8;
                List<String> list = Arrays.asList(decrypt(s, code));
                System.out.println(list);
                //Files.write(Paths.get("cipher.log"), list, utf8);
        }
    }
    public static String encrypt(String text, int n){
        String buffer = "";
        for(int i = 0; i < text.length(); i++){
            if(Character.isUpperCase(text.charAt(i))){
                char ch = (char)(((int)text.charAt(i) + n - 65) % 26 + 65);
                buffer += ch;
            }else{
                char ch = (char)(((int)text.charAt(i) + n - 97) % 26 + 97);
                buffer += ch;
            }
        }
        return buffer;
    }
    public static String decrypt(String text, int n){
        String buffer = "";
        for(int i = 0; i < text.length(); i++){
            if(Character.isUpperCase(text.charAt(i))){
                char ch = (char)(((int)text.charAt(i) - n - 65) % 26 + 65);
                buffer += ch;
            }else{
                char ch = (char)(((int)text.charAt(i) - n - 97) % 26 + 97);
                buffer += ch;
            }
        }
        return buffer;
    }
}
