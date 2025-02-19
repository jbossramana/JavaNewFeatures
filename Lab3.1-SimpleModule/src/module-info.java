module com.module.simple {
    exports com.module.simple;
    requires transitive java.logging;
	requires com.example;
    provides com.example.MyService with com.module.simple.Simple;
}