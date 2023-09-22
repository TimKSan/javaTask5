package HW_Sem5;

import java.util.HashMap;

public class task1 {
    public static void main(String[] args) {
        HashMap<String, Integer> nameAndTel = new HashMap<>();

        nameAndTel.put("Ivan", 123456);
        nameAndTel.put("Petr", 456321);
        nameAndTel.put("Gena", 852364);
        nameAndTel.put("Ivan", 555555);
        nameAndTel.put("Anton", 1954864);
        nameAndTel.put("Gena", 1111111);
        nameAndTel.put("Ivan", 8888888);
        System.out.println(nameAndTel);
    }
}

