package annotation.deprecated;

public class LegacyAPI {

    // This method is outdated and should not be used
    @Deprecated
    public void oldFeature() {
        System.out.println("Old feature is running");
    }

    // New recommended method
    public void newFeature() {
        System.out.println("New feature is running");
    }
}

