public class Student {

        private  String firstName;
        private   String lastName;
        private  int year;
        private  String gender;
        private  double mark;


        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public  String getFirstName() {
            return this.firstName;
        }

        public  void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public  void setGender(String gender) {
            this.gender = gender;
        }

        public  String getGender() {
            return this.gender;
        }

        public  void setYear(int year) {
            this.year = year;
        }

        public  int getYear() {
            return this.year;
        }

        public  void setMark(double mark) {
            this.mark = mark;
        }

        public  double getMark() {
            return this.mark;
        }

        @Override
        public String  toString(){
            return ("FirstName : ") + getFirstName() + ", " + ("LastName : ") + getLastName() + ", " +
                   ("Gender : ")  + getGender() + ", " +("Year : ") + getYear() + ", " +
                            ("Mark : ") + getMark();
        }
}



