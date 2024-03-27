
plugins{
    java
}

repositories{
    mavenCentral()
}

dependencies{
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly( "org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.named<Jar>("jar"){
    manifest{
        attributes["Main-Class"] = "com.gradlehero.languageapp.SayHello"
    }
}

tasks.withType<Test>{
    useJUnitPlatform()
}