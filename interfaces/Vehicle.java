//TASK9
public abstract class Vehicle {

    protected interface Maintenance {
        void oilChange();
        void tireRotation();
        void brakeInspection();
    }


        private String make;
        private String model;
        private int year;

        public Vehicle(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public abstract void start();

        public abstract void stop();


}
