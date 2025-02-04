package io.github.centrifugal.centrifuge;

public class ErrorEvent {
    private final Throwable error;

    ErrorEvent(Throwable t) {
        this.error = t;
    }

    public Throwable getError() {
        return error;
    }
}
