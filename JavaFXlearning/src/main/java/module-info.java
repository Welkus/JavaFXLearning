module com.ll.javafxlearning {
    requires javafx.controls;
    requires javafx.fxml;
            
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.ll.javafxlearning to javafx.fxml;
    exports com.ll.javafxlearning;
}