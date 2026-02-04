package lambda_expressions;

public class SmartHomeLightingAutomation {
    public static void main(String[] args) {
        // Using Lambda Expressions for motion, voice and time of day
        LightFunction motion = () -> System.out.println("Applying motion to the light");
        LightFunction voice = () -> System.out.println("Responding to voice command: toggling lights");
        LightFunction timeOfDay = () -> System.out.println("Adjusting lights based on time of day");

        // Running the methods
        motion.execute();
        voice.execute();
        timeOfDay.execute();
    }
}

// Interface with only single abstract method
@FunctionalInterface
interface LightFunction{
    // Abstract method for operation of light
    void execute();
}