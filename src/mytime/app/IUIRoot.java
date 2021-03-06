package mytime.app;

import java.util.Date;

/**
 * This interface represents the UI of the application as a whole, as the application facade see it.
 */
public interface IUIRoot {

    /**
     * Instructs the UI to show the tray icon, and let it call back to the {@link AppTrayIcon} on user interaction.
     * 
     * @param trayIcon the application facade for the tray icon
     * @param isRunning whether the tray icon should display the 'running' state or not
     * @return the tray icon
     */
    IUITrayIcon showTrayIcon(AppTrayIcon trayIcon, boolean isRunning);

    /**
     * Instructs the UI to create, and immediately show, the window for the given {@link AppMainWindow}.
     * 
     * @param appMainWindow the application facade for the main window
     * @return the created main window
     */
    IUIMainWindow showMainWindow(AppMainWindow appMainWindow);

    /**
     * Returns the current time.
     * 
     * @return a Date object representing 'now'.
     */
    Date getTime();

    /**
     * Instructs the UI to exit.
     */
    void exit();
}
