# java-fx-practice-kotlin

## notes
2024-12-31: I'm not sure this is do-able.  You can't call the `launch()` static method inherited from Application from within the companion object b/c it doesn't extend Application, but you also can't call `Application.launch()` outside of the class and have JavaFX launch.
