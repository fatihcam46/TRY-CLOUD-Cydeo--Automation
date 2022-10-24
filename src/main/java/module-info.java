module com.example.trycloudcydeoautomation {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.tryCloudCydeoAutomation.trycloudcydeoautomation to javafx.fxml;
    exports com.tryCloudCydeoAutomation.trycloudcydeoautomation;
}