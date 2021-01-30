package com.company.HW6.EX_2_Interface;

public class AgencyOfNews extends WebSite {
    private final String correspondent = " корреспондент Петрович";

    public AgencyOfNews(int circulation, int profit) {
        super ( circulation, profit );
    }

    public void Release() {
        if (getProfit () < 100) {
            System.out.print ( "новости с полей - намолотили 100500 тонн зерна" + correspondent );
        } else {
            System.out.print ( "новости с полей - не выполнили план, ахтунг" + correspondent );
        }
    }

    @Override
    public void frequencyOfNewsRelease() { //переодичность выпуска
        System.out.println ( "раз в день" );
    }

    @Override
    public void numberOfSubscribers() {  //количество телеглечоу
        System.out.println ( " вещает для Вас." );
    }
}
