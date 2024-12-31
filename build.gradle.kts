plugins {
    kotlin("jvm") version "2.0.21"
    id("org.openjfx.javafxplugin") version "0.1.0"
}

group = "com.vincie"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.1")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}

javafx {
    version = "21"
    modules = listOf("javafx.controls", "javafx.graphics")
}