public class Address {

        private String city;
        private String street;
        private int numberHouse;
        private int numberApartment;
        Address address;

        public Address(String city, String street, int numberHouse, int numberApartment) {
            this.city = city;
            this.street = street;
            this.numberHouse = numberHouse;
            this.numberApartment = numberApartment;
        }
   /* public void setAddress (Address address) {
    	this.address = address;
    }*/

        public void setCity(String city) {
            this.city = city;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public void setNumberHouse(int numberHouse) {
            this.numberHouse = numberHouse;
        }

        public void setNumberApartment(int numberApartment) {
            this.numberApartment = numberApartment;
        }

        @Override
        public String toString() {
            return this.city + ", " + this.street + ", " + this.numberHouse + " - " + this.numberApartment;

        }
}
