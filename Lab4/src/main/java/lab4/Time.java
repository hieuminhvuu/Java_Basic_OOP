package lab4;

public enum Time {

    HALF_AN_HOUR_LATER{
        @Override
        public String toString() {
            return "Haft an hour later";
        }
    },
    WHILE_THERE_WAS_NO_ONE_IN_THE_STORE{
        @Override
        public String toString() {
            return "While there was no one in the store";
        }
    },
    RIGHT_AFTER_THE_DOOR_OPENED{
        @Override
        public String toString(){
            return "Right after the door opened";
        }
    }
}
