package com.company.HW6.EX_2_Interface;

public class Blog extends WebSite {
    private int costAds;
    private boolean advertising = false;

    public Blog(int circulation, int profit) {
        super ( circulation, profit );
    }

    public void Hosting() {
        advertising = true;
    }

    public void TextBlog() {
        if (advertising) {
            costAds = 10;
        } else {
            costAds = 5;
        }
        System.out.println ( "реклама обходится в " + costAds );
    }

    @Override
    public void frequencyOfNewsRelease() { //переодичность выпуска
        System.out.println ( "переодичность выпуска блога: три раза в день" );
    }

    @Override
    public void numberOfSubscribers() { //количество подписчиков
        System.out.println ( "количество подписчиков - 500" );
    }
}
