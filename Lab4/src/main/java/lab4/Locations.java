package lab4;

public enum Locations {
    ON_SPECIAL_WOODEN_STAND{
        @Override
        public String toString() {
            return "on special wooden stand";
        }
    },
    ON_THE_COUNTER{
        @Override
        public String toString() {
            return "on the counter";
        }
    },
    ALONG_THE_WALLS{
        @Override
        public String toString() {
            return "along the walls";
        }
    },
    IN_THE_WINDOW{
        @Override
        public String toString() {
            return "in the window";
        }
    },
    IN_THE_SHOWCASE{
        @Override
        public String toString() {
            return "in the showcase";
        }
    },
    ON_BOTH_SIDES_OF_VALLEY{
        @Override
        public String toString() {
            return "on both sides of valley";
        }
    },
    IN_THE_RIGHT_CORNER{
        @Override
        public String toString() {
            return "In the right corner";
        }
    },
    IN_THE_LEFT_CORNER{
        @Override
        public String toString() {
            return "In the left corner, ";
        }
    },
    BEHIND_COUTER{
        @Override
        public String toString() {
            return "behind couter";
        }
    }
}
