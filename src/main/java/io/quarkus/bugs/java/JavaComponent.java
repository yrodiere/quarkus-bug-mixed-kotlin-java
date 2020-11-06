package io.quarkus.bugs.java;

import org.jetbrains.annotations.NotNull;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class JavaComponent {
    @NotNull
    public Object hello() {
        return "hello from JavaComponent";
    }
}
