* Using an enum for the different actions the user can take
* Change over if/else ladder to use lambda-based switch/case:
var result = switch (str) {
    case "A" -> 1;
    case "B" -> 2;
    case "C" -> 3;
    case "D" -> 4;
    default -> throw new IllegalStateException("Unexpected value: " + str);
};
* Building out "UserActionProcessor" as contrived practice for object composition

Next time:
* Start talking about steams and lambdas, functional interfaces, FP,
functions as first-class citizens, etc.
* Refactoring all loops to use .forEach, .stream()..., etc.
