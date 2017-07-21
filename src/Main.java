public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("customer1");
        Movie movie1 = new Movie("book1",Movie.CHILDRENS);
        Rental rental1 = new Rental(movie1, 50);

        Movie movie2 = new Movie("book2",Movie.NEW_RELEASE);
        Rental rental2 = new Rental(movie2, 30);

        customer.addRental(rental1);
        customer.addRental(rental2);

        System.out.println(customer.statement());
    }
}
