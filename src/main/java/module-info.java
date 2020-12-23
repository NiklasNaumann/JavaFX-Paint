module paint {
    requires javafx.controls;
    requires transitive javafx.graphics;
    
    exports paint;
    opens paint;
}
