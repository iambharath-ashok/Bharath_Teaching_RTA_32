package javatraining.day7.exceptions.trywithresources;

class CustomResource implements AutoCloseable {
    public CustomResource() {
        System.out.println("CustomResource opened");
    }

    public void process() {
        System.out.println("CustomResource processing");
    }

    @Override
    public void close() {
        System.out.println("CustomResource closed");
    }
}

public class TryWithCustomResource {
    public static void main(String[] args) {
        try (CustomResource resource = new CustomResource()) {
            resource.process();
        }
    }
}
