package Method_Overriding.Multi_Level_Inheritance;

class Whatsapp1 {
    void sendMessage() {
        System.out.println("Single tick support");
    }
}

class Whatsapp2 extends Whatsapp1 {
    @Override
    void sendMessage() {
        super.sendMessage();
        System.out.println("Double tick support");
    }

    void story() {
        System.out.println("Image support");
    }
}

class Whatsapp3 extends Whatsapp2 {
    @Override
    void sendMessage() {
        super.sendMessage();
        System.out.println("Blue tick support");
    }

    @Override
    void story() {
        super.story();
        System.out.println("video support");
    }

    void call() {
        System.err.println("Voice call support");
    }
}

class UsingSuperWhatsapp {
    public static void main(String[] args) {
        Whatsapp3 w3 = new Whatsapp3();
        w3.sendMessage();
        System.out.println("_________________________");
        w3.story();
        System.out.println("_________________________");
        w3.call();
    }
}
