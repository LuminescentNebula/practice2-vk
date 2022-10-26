plugins {
    id("java")
}

group = "ru.mirea.lippo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.inject:guice:5.1.0")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    implementation("com.intellij:annotations:12.0")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}