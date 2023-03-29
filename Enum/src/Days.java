public enum Days {
    SUN, MON, TUES, WED, THU, FRI, SAT;

    Days() {
        System.out.println(this);
    }
    public void number() {
        switch (this) {
            case SUN: {
                System.out.println("Sunday");
                break;
            }
            default: {
                System.out.println("Default");
                break;
            }
        }

    }
}
