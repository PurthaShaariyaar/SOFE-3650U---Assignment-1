public class NonOrganicFactory {
    public Banana createBanana() {
        return new NonOrganicBanana() {
            @Override
            public void getName(String name) {
                System.out.println(name);
            }

            @Override
            public void getPrice(String price) {
                System.out.println(price);
            }
        };
    }

    public Apple createApple() {
        return new NonOrganicApple() {
            @Override
            public void getName(String name) {
                System.out.println(name);
            }

            @Override
            public void getPrice(String price) {
                System.out.println(price);
            }
        };
    }
}
