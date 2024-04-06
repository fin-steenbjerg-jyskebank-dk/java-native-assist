package dk.stonemountain;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(name = "greeting", mixinStandardHelpOptions = true)
public class AddReflectionForOSCommand implements Runnable {
    @CommandLine.Option(names = {"-os", "--operating-system"}, description = "Adds reflection files for a give os", defaultValue = "linux")
    String operationSystem;

    @Override 
    public void run() {
        System.out.printf("Generating reflection files for %s%n", operationSystem);
    }
}