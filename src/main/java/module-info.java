module com.baho.calculator {
    requires javafx.controls;
    requires javafx.fxml;
            
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.baho.calculator to javafx.fxml;
    exports com.baho.calculator;
}