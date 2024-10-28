//create an enumeration Month with all the name of the months
//iterate all the values of the enumeration, printing the name of the month followed by:
//ends with y if the name ends with Y
//doesn't end with y if the name doesn't end with y



public class Main {
    enum  Month{
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
        JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER

    }
    public static void main(String[] args) {
        for(Month month : Month.values()){
            String monthName = month.name();
            if(monthName.endsWith("Y")){
                System.out.println(monthName +" ends with y");
            }else {
                System.out.println(monthName + " doesn't end with y");
            }

        }

    }
}