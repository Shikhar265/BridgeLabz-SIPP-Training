package Workshop;

import java.util.*;

//Interface for navigation
interface NavigationManager {
 void openTab(String url);
 void back();
 void forward();
 void showCurrent();
}

//Base browser tab (encapsulation via private stacks)
class BrowserTab implements NavigationManager {
 private Stack<String> backStack;
 private Stack<String> forwardStack;
 private String currentTab;

 public BrowserTab() {
     backStack = new Stack<>();
     forwardStack = new Stack<>();
     currentTab = "Home";
 }

 @Override
 public void openTab(String url) {
     if (currentTab != null) {
         backStack.push(currentTab);
     }
     currentTab = url;
     forwardStack.clear(); // Clear forward stack when new tab is opened
     System.out.println("Opened: " + url);
 }

 @Override
 public void back() {
     if (!backStack.isEmpty()) {
         forwardStack.push(currentTab);
         currentTab = backStack.pop();
         System.out.println("Back to: " + currentTab);
     } else {
         System.out.println("No previous tab.");
     }
 }

 @Override
 public void forward() {
     if (!forwardStack.isEmpty()) {
         backStack.push(currentTab);
         currentTab = forwardStack.pop();
         System.out.println("Forward to: " + currentTab);
     } else {
         System.out.println("No forward tab.");
     }
 }

 @Override
 public void showCurrent() {
     System.out.println("Current Tab: " + currentTab);
 }
}

//Desktop browser tab (polymorphic)
class DesktopBrowserTab extends BrowserTab {
 // You could add specific UI behavior or features here
}

//Mobile browser tab (polymorphic)
class MobileBrowserTab extends BrowserTab {
 // Specific behavior for mobile (gesture nav, tab preview etc.)
}

public class Browser_Navigation_App {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     NavigationManager browser = new DesktopBrowserTab(); // could also be MobileBrowserTab

     System.out.println("Browser Tab Navigation");
     System.out.println("Commands: open <url>, back, forward, show, exit");

     while (true) {
         System.out.print(">> ");
         String input = sc.nextLine();
         String[] parts = input.split(" ", 2);

         switch (parts[0].toLowerCase()) {
             case "open":
                 if (parts.length < 2) {
                     System.out.println("Usage: open <url>");
                 } else {
                     browser.openTab(parts[1]);
                 }
                 break;
             case "back":
                 browser.back();
                 break;
             case "forward":
                 browser.forward();
                 break;
             case "show":
                 browser.showCurrent();
                 break;
             case "exit":
                 System.out.println("Closing browser...");
                 sc.close();
                 return;
             default:
                 System.out.println("Unknown command.");
         }
     }
 }
}
