package BrowserBuddy;

public class BrowserBuddyMain {
    public static void main(String[] args) {

        BrowserManager manager = new BrowserManager();

        manager.openNewTab();
        BrowserTab tab = manager.getActiveTab();

        tab.visit("google.com");
        tab.visit("github.com");
        tab.visit("stackoverflow.com");

        tab.back();
        tab.back();
        tab.forward();

        manager.closeCurrentTab();

        manager.restoreTab();
        BrowserTab restoredTab = manager.getActiveTab();
        System.out.println("Current page: " + restoredTab.getCurrentPage());
    }
}

