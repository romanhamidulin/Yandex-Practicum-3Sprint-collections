package HashTables.add;

import java.util.HashMap;
import java.util.ArrayList;

public class Practicum {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> stateHolidays = new HashMap<String, ArrayList<Integer>>();
        ArrayList<Integer> january = new ArrayList<Integer>();
        ArrayList<Integer> february = new ArrayList<Integer>();
        ArrayList<Integer> march = new ArrayList<Integer>();
        ArrayList<Integer> may = new ArrayList<Integer>();
        ArrayList<Integer> june = new ArrayList<Integer>();
        ArrayList<Integer> november = new ArrayList<Integer>();
        january.add(1);
        january.add(7);
        february.add(23);
        march.add(8);
        may.add(1);
        may.add(9);
        june.add(12);
        november.add(4);
        stateHolidays.put("Январь",january);
        stateHolidays.put("Февраль",february);
        stateHolidays.put("Март",march);
        stateHolidays.put("Май",may);
        stateHolidays.put("Июнь",june);
        stateHolidays.put("Ноябрь",november);
        System.out.println(stateHolidays);

    }


}