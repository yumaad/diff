public class Main {
    public static void main(String[] args) {
        // 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("1 задание\n" + dog +" "+ cat +" "+ paper + "\n");

        // 2
        dog = dog + 4;
        cat = cat + 4;
        paper= paper + 4;
        System.out.println("2 задание\n" + dog +" "+ cat +" "+ paper + "\n");

        // 3
        dog = dog - 3.5;
        cat = cat- 1.6;
        paper = paper - 7639;
        System.out.println("3 задание\n" + dog +" "+ cat +" "+ paper+ "\n");

        // 4
        var friend = 19;
        System.out.println("4 задание\n" + friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend + "\n");

        // 5
        var frog = 3.5;
        System.out.println("5 задание\n" + frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog + "\n");

        // 6
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        var diffWeight = firstBoxerWeight - secondBoxerWeight;
        System.out.println("6 задание\n" + "Общий вес "+ totalWeight + " кг");
        System.out.println("Разница "+ diffWeight + " кг\n");

        // 7
        var remains = secondBoxerWeight % firstBoxerWeight;
        System.out.println("7 задание\n" + remains + " кг\n");

        // 8
        var hours = 640;
        var employeeHours = 8;
        var numbersOfEmloyees = hours / employeeHours;
        System.out.println("8 задание\n" + "Всего работников в компании — "
                + numbersOfEmloyees + " человек\n");

        numbersOfEmloyees = numbersOfEmloyees + 94;
        hours = numbersOfEmloyees * employeeHours;
        System.out.println("Если в компании работает " + numbersOfEmloyees +
                " человек, то всего "+ hours
                + " часов работы может быть поделено между сотрудниками");

    }
}