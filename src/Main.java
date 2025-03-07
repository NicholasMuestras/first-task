//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Custom: Hello, World!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        System.out.println("TASK 1");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Dog value: " + dog);
        System.out.println("Cat value: " + cat);
        System.out.println("Paper value: " + paper);

        System.out.println("TASK 2");

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("Dog value: " + dog);
        System.out.println("Cat value: " + cat);
        System.out.println("Paper value: " + paper);

        System.out.println("TASK 3");

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("Dog value: " + dog);
        System.out.println("Cat value: " + cat);
        System.out.println("Paper value: " + paper);

        System.out.println("TASK 4");

        var friend = 19;

        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("TASK 5");

        var frog = 3.5;

        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("TASK 6");

        var guyOne = 78.2;
        var guyTwo = 82.7;
        var massTotal = guyOne + guyTwo;
        var massDiff = Math.abs(guyOne - guyTwo);

        System.out.println("Mass total: " + massTotal + " kg");
        System.out.println("Mass diff: " + massDiff + " kg");

        System.out.println("TASK 7");

        double remainderOfDivision;

        if (guyOne > guyTwo) {
            remainderOfDivision = guyOne % guyTwo;
        } else {
            remainderOfDivision = guyTwo % guyOne;
        }

        System.out.println(remainderOfDivision);

        System.out.println("TASK 8");

        var totalCapacity = 640;
        var employerCapacity = 8;
        var employersCount = totalCapacity / employerCapacity;
        var increasedEmployersCount = employersCount + 94;
        var increasedTotalCapacity = increasedEmployersCount * employerCapacity;

        System.out.println("Employers total (body): " + employersCount);
        System.out.println("If employers count: " + increasedEmployersCount + " then capacity available (hour): " + increasedTotalCapacity);
    }
}