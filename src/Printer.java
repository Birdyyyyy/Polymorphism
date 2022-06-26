class Printer {
    public void method() {
        System.out.println("I can printing.");
    }
}

class ColorPrinter extends Printer {
    @Override
    public void method() {
        System.out.println("Different colors are used to paper.");
    }
}

class BlackWhitePrinter extends Printer {
    public void method(String color) {
        System.out.println(color == "Black" ? "Black color is used to paper." : "Can't be used to paper.");
    }
}
