import java.util.Scanner;

public class TP1_3_H071231078 {

    public static String day(String day, String month){
        String fix_day = day;
        if (day.startsWith("0")){
            String converted_day = day.substring(1);
            int converted_day_in_int = Integer.parseInt(converted_day);
            if (converted_day_in_int < 1 || converted_day_in_int > 31){
                fix_day = "Invalid day";
            }else if (month.equals("Februari") && converted_day_in_int > 29){
                fix_day = "Invalid day for february";
            }else if ((month.equals("April") || month.equals("Juni") || month.equals("September") || month.equals("November")) && converted_day_in_int > 30) {
                fix_day = "Invalid day for "+ month;
            } else {
                fix_day = converted_day;
            }
        }

        return fix_day;
    }
    

    public static String month(String month) {
        switch (month) {
            
            case "1":
            case "01":
                return "January";       
            case "2":
            case "02":
                return "February";           
            case "3":
            case "03":
                return "March";
            case "04":
            case "4":
                return "April";            
            case "5":
            case "05":
                return "May";            
            case "6":
                return "June";           
            case "7":
                return "July";
            case "8":
            case "08":
                return "August";
            case "9":
            case "09":
                return "September";
            case "10":
                return "October";
            case "11":
                return "November";
            case "12":
                return "December";
            default:
                return "Invalid month";
        
        }
    }

    public static String year(String year) {
        int yearInt = Integer.parseInt(year);
        if (yearInt >= 0 && yearInt < 25) {
            return "20" + year;
        } else if (yearInt >= 25 && yearInt <= 99) {
            return "19" + year;
        } else {
            return "Invalid year";
        }
    }
    


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String date = scan.nextLine();
        String[] date_items = date.split("-");
        

        String now_day = date_items[0];
        String now_month = date_items[1];
        String now_year = date_items[2];

        System.out.println(day(now_day, now_month) +" "+ month(now_month) +" "+ year(now_year));
        scan.close();


    }
}
