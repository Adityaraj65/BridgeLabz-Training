package BrowserBuddy;

import java.util.Stack;

class BrowserManager {
    private BrowserTab activeTab;
    private Stack<BrowserTab> closedTabs = new Stack<>();

    // Open new tab
    public void openNewTab() {
        activeTab = new BrowserTab();
        System.out.println("New tab opened");
    }

    // Close current tab
    public void closeCurrentTab() {
        if (activeTab == null) {
            System.out.println("No active tab to close");
            return;
        }
        closedTabs.push(activeTab);
        activeTab = null;
        System.out.println("Tab closed");
    }

    // Restore last closed tab
    public void restoreTab() {
        if (closedTabs.isEmpty()) {
            System.out.println("No closed tabs to restore");
            return;
        }
        activeTab = closedTabs.pop();
        System.out.println("Tab restored");
    }

    public BrowserTab getActiveTab() {
        return activeTab;
    }
}

