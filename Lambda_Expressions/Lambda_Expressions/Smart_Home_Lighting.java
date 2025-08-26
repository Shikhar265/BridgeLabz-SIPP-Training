// Smart_Home_Lighting.java

interface LightBehavior {
    void activate();
}

public class Smart_Home_Lighting {

    public static void main(String[] args) {

        // Motion Trigger → turns on lights dim
        LightBehavior motionTrigger = () -> 
            System.out.println("Motion detected → Lights ON (Dim Mode)");

        // Time Trigger → lights ON in evening
        LightBehavior timeTrigger = () -> 
            System.out.println("Evening time → Lights ON (Warm Mode)");

        // Voice Trigger → custom command
        LightBehavior voiceTrigger = () -> 
            System.out.println("Voice Command 'Party Mode' → Lights ON (Colorful Mode)");

        // Testing different triggers
        System.out.println("=== Smart Lighting Automation ===");
        motionTrigger.activate();
        timeTrigger.activate();
        voiceTrigger.activate();
    }
}
