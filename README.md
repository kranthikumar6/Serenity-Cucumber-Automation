SERENITY CUCUMBER TEST AUTOMATION FRAMEWORK

# Maven Command to Execute Cucumber Feature File:
- mvn clean verify -Dcucumber.filter.tags=@scenario:VerifyStandardUserLogin -DexecutionThreadCount=1 -f C:\Users\PathToFolder\pom.xml

# Framework Setup:
- Java 17
- Intellij
- Maven
- Plugins [Cucumber for Java, Gherkin]

# Test Output:
- target/site/serenity/index.html
