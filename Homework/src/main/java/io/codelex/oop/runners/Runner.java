package io.codelex.oop.runners;

public enum Runner {
    BEGINNER(200, 300),
    INTERMEDIATE(100, 200),
    ADVANCED(50, 100);

    private final int minTime;
    private final int maxTime;

    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public static Runner getFitnessLevel(int marathonTime) {
        for (Runner runner : Runner.values()) {
            if (marathonTime >= runner.minTime && marathonTime <= runner.maxTime) {
                return runner;
            }
        }
        return null;
    }
}
