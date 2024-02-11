package javatraining.day5.interveiewquestions.oops;

class ParentNew {
    void show() {
        System.out.println("Parent's show method");
    }
}

class ChildNew extends ParentNew {
    @Override
    void show() {
        super.show();  // Call the overridden method in the superclass
        System.out.println("Child's show method");
    }
}
