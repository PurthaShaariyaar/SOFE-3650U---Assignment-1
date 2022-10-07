public class OrganicFactory {
    public Banana createBanana() {
        return new OrganicBanana() {
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
        return new OrganicApple() {
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
