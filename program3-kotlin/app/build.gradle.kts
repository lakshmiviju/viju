plugins {
    kotlin("jvm") version "1.8.21"
    application 
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("junit:junit:4.13.2")
}

application {
    mainClass.set("com.example.MainKt")
}

tasks.test {
    useJUnit() 

    testLogging {
        events("passed", "failed", "skipped") 
        exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL 
        showStandardStreams = true 
    }

    outputs.upToDateWhen { false }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}