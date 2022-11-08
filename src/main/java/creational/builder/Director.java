package creational.builder;

import creational.builder.builder_impl.BuilderB;

public class Director {
    private Director() {
    }

    public static void makeFirstScenario(Builder builder) {
        builder.reset();
        builder.stepA("stepA");
        builder.stepB("stepB");
        builder.stepC("stepC");
        if (builder instanceof BuilderB builderB) {
            builderB.extraStep("extra");
        }
        System.out.println("-----------------");
    }

    public static void makeSecondScenario(Builder builder) {
        builder.reset();
        builder.stepA("stepA");
        builder.stepC("stepC");
        System.out.println("-----------------");
    }
}
