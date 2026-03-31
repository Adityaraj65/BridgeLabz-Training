package BrowserBuddy;

class BrowserTab {
    private HistoryNode current;

    // Visit a new page
    public void visit(String url) {
        HistoryNode newNode = new HistoryNode(url);

        if (current != null) {
            current.next = newNode;
            newNode.prev = current;
        }
        current = newNode;

        System.out.println("Visited: " + url);
    }

    // Go back
    public void back() {
        if (current == null || current.prev == null) {
            System.out.println("No page to go back");
            return;
        }
        current = current.prev;
        System.out.println("Back to: " + current.url);
    }

    // Go forward
    public void forward() {
        if (current == null || current.next == null) {
            System.out.println("No page to go forward");
            return;
        }
        current = current.next;
        System.out.println("Forward to: " + current.url);
    }

    public String getCurrentPage() {
        return current != null ? current.url : "No page";
    }
}

