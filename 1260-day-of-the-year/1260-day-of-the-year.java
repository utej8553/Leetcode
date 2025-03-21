class Solution {
    public int dayOfYear(String date) {
        String[] temp = date.split("-");
        System.out.println(temp[0]+temp[1]+temp[2]);
        int totalDays = 0;
        int year = Integer.parseInt(temp[0]);
        int month = Integer.parseInt(temp[1]);
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        switch (month) {
            case 12: totalDays += 30;
            case 11: totalDays += 31;
            case 10: totalDays += 30;
            case 9:  totalDays += 31;
            case 8:  totalDays += 31;
            case 7:  totalDays += 30;
            case 6:  totalDays += 31;
            case 5:  totalDays += 30;
            case 4:  totalDays += 31;
            case 3:  totalDays += (isLeap ? 29 : 28);
            case 2:  totalDays += 31;
            case 1:  break; 
        }
        totalDays = totalDays + Integer.parseInt(temp[2]);
        return totalDays;
    }
}